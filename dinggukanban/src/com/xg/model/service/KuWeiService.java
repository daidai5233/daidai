package com.xg.model.service;
import java.sql.SQLException;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xg.model.dao.KuWeiDao;
import com.xg.model.vo.KuWei;

/**********
 * 
 * @author dd
 * @date 2017年3月1日
 **********/
@Service
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/spring/applicationContext-bean.xml") 
public class KuWeiService {
	@Autowired
	private KuWeiDao kuWeiDao;
	
	/**
	 * 查找所有库位信息
	 * @return
	 * @throws SQLException
	 */
	public List<KuWei> list() throws SQLException{
		return kuWeiDao.list();
	}
	/**
	 * 查找指定立库的库位信息
	 * @param lkh
	 * @return
	 * @throws SQLException
	 */
	public List<KuWei> listForLk(String lkh) throws SQLException{
		return kuWeiDao.listForLiku(lkh);
	}
	
	public void test1(){
		System.out.println(kuWeiDao);
	}
	
}
