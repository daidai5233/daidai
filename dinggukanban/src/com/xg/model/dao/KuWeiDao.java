package com.xg.model.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.xg.model.util.db.C3P0Util;
import com.xg.model.vo.KuWei;

/**********
 * 
 * @author dd
 * @date 2017年3月13日
 **********/
@Repository
public class KuWeiDao {
	private Connection conn;
	private Logger logger = Logger.getLogger(KuWeiDao.class);
	/**
	 * 查找所有库位信息
	 * @return
	 * @throws SQLException
	 */
	public List<KuWei> list() throws SQLException{
		List<KuWei> result = null;
		String sql = " select number,bianhao,lkbh,lsbh,leixing,zhuangtai,bjbh from tb_kuwei order by lkbh,bianhao ";
		conn = C3P0Util.checkConn(conn);
		try {
			QueryRunner runner = new QueryRunner();
			List<Map<String, Object>> lists = runner.query(conn,sql, new MapListHandler());
			result = new ArrayList<KuWei>();
			for(Map<String,Object> list : lists){
				KuWei kw = new KuWei();
				kw.setNumber(list.get("number").toString());
				kw.setBjbh((String)list.get("bjbh"));
				kw.setBianhao(list.get("bianhao").toString());
				kw.setLkbh(list.get("lkbh").toString());
				kw.setLsbh(Integer.parseInt(list.get("lsbh")==null?"0":list.get("lsbh").toString()));
				kw.setLeixing(list.get("leixing").toString());
				kw.setZhuangtai(list.get("zhuangtai").toString());
				result.add(kw);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			throw e;
		}
		return result;
		
	}
	/**
	 * 查找指定立库的所有库位
	 * @param lkh 立库号
	 * @return
	 * @throws SQLException
	 */
	@SuppressWarnings("deprecation")
	public List<KuWei> listForLiku(String lkh) throws SQLException{
		List<KuWei> result = null;
		String sql = " select number,bianhao,lkbh,lsbh,leixing,zhuangtai,bjbh from tb_kuwei where lkbh=? order by bianhao ";
		conn = C3P0Util.checkConn(conn);
		try {
			QueryRunner runner = new QueryRunner();
			//List<Map<String, Object>> lists = runner.query(conn, sql, new MapListHandler());
			List<Map<String, Object>> lists = runner.query(conn, sql, lkh, new MapListHandler());
			result = new ArrayList<KuWei>();
			for(Map<String,Object> list : lists){
				KuWei kw = new KuWei();
				kw.setNumber(list.get("number").toString());
				kw.setBjbh((String)list.get("bjbh"));
				kw.setBianhao(list.get("bianhao").toString());
				kw.setLkbh(list.get("lkbh").toString());
				kw.setLsbh(Integer.parseInt(list.get("lsbh")==null?"0":list.get("lsbh").toString()));
				kw.setLeixing(list.get("leixing").toString());
				kw.setZhuangtai(list.get("zhuangtai").toString());
				result.add(kw);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		return result;
	}
	@PostConstruct
	private void init() throws SQLException{
		conn = C3P0Util.getConnection();
		logger.info("初始化数据库连接");
	}
	
	@PreDestroy
	private void release(){
		C3P0Util.reback(conn);
		logger.info("释放数据库连接");
	}
}
