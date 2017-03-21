package com.xg.model.util.db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.sql.DataSource;
import org.junit.Test;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/************************************************************
 * 
 * @author DaiJian
 * @date 2017年2月26日
 ***********************************************************/
public class C3P0Util {
    private static ComboPooledDataSource dataSource;
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
    	if(dataSource==null){
    		dataSource = new ComboPooledDataSource("sqlserver");//基于xml配置
    	}
    }
 
    /**
     * 获取数据库连接对象
     * 
     * @return 数据连接对象
     * @throws SQLException
     */
    public static synchronized Connection getConnection() throws SQLException {
        final Connection conn = dataSource.getConnection();
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
    
    public static int getBusyNum(){
    	try {
			return dataSource.getNumBusyConnections();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return -1;
    }
    
    public static int getLazyNum(){
    	try {
			return dataSource.getNumConnections()-getBusyNum();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return -1;
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
