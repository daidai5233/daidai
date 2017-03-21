package com.xgzn.dgfj.modbus.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.DataSources;

/************************************************************
 * 
 * @author DaiJian
 * @date 2017年2月26日
 ***********************************************************/

public class DruidUtil {
	private static final String JDBC_DRIVER = "driverClassName";
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
        Properties druidPro = new Properties();
        try {
            // 加载配置文件
        	druidPro.load(DruidUtil.class.getClassLoader().getResourceAsStream(
					"druid.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String drverClass = druidPro.getProperty(JDBC_DRIVER);
        if (drverClass != null) {
            try {
                // 加载驱动类
                Class.forName(drverClass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
			// 建立连接池
			if(ds==null){
				ds = DruidDataSourceFactory.createDataSource(  
						druidPro);  
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public static DataSource getDataSource() {
		return ds;
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
    	conn = getConnection();
    	System.out.println(conn);
    	System.out.println(new Date().getTime());
    	reback(conn);
    }
}
