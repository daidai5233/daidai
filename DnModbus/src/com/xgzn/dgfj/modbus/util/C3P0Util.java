package com.xgzn.dgfj.modbus.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;

import com.mchange.v2.c3p0.DataSources;

/************************************************************
 * 
 * @author DaiJian
 * @date 2017年2月26日
 ***********************************************************/

public class C3P0Util {
	private static final String JDBC_DRIVER = "driverClassName";
    private static final String JDBC_URL = "url";
    private static DataSource ds;
    /**
     * 初始化连接池代码块
     */
    static {
        initDBSource();
    }
 
    /**
     * 初始化c3p0连接池
     */
    private static final void initDBSource() {
        Properties c3p0Pro = new Properties();
        try {
            // 加载配置文件
            c3p0Pro.load(C3P0Util.class.getClassLoader().getResourceAsStream(
					"db.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String drverClass = c3p0Pro.getProperty(JDBC_DRIVER);
        if (drverClass != null) {
            try {
                // 加载驱动类
                Class.forName(drverClass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        Properties jdbcpropes = new Properties();
        Properties c3propes = new Properties();
        for (Object key : c3p0Pro.keySet()) {
            String skey = (String) key;
            if (skey.startsWith("c3p0.")) {
                c3propes.put(skey, c3p0Pro.getProperty(skey));
            } else {
                jdbcpropes.put(skey, c3p0Pro.getProperty(skey));
            }
        }
        try {
            // 建立连接池
            DataSource unPooled = DataSources.unpooledDataSource(c3p0Pro.getProperty(JDBC_URL), jdbcpropes);
            ds = DataSources.pooledDataSource(unPooled, c3propes);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    /**
     * 获取数据库连接对象
     * 
     * @return 数据连接对象
     * @throws SQLException
     */
    public static synchronized Connection getConnection() throws SQLException {
        final Connection conn = ds.getConnection();
        conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
        return conn;
    }
    /**
     * 归还连接至连接池
     * @param conn 连接对象
     */
    public static void reback(Connection conn){
    	if(conn!=null){
    		try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	}
    }
    /**
     * 检查连接，若为空或已关闭，重新获取连接
     * @param conn 连接
     * @return 检查后的连接
     */
    public static Connection checkConn(Connection conn){
    	try {
			if(conn==null || conn.isClosed()){
				conn = getConnection();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return conn;
    }
    /**
     * 释放资源
     * @param st Statement
     * @param rSet ResultSet
     */
    public static void release(Statement st,ResultSet rSet){
    	if(st!=null){
    		try {
				st.close();
			} catch (SQLException e) {
			}
    	}
    	if(rSet!=null){
    		try {
				rSet.close();
			} catch (SQLException e) {
			}
    	}
    }
    
    @Test
    public void test1() throws SQLException{
    	System.out.println(new Date().getTime());
    	Connection conn = getConnection();
    	System.out.println(conn);
    	System.out.println(new Date().getTime());
    	reback(conn);
    }
}
