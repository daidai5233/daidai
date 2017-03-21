package test;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xg.model.controller.KuWeiController;
import com.xg.model.dao.KuWeiDao;
import com.xg.model.service.KuWeiService;

/**********
 * 
 * @author dd
 * @date 2017年3月14日
 **********/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/spring/applicationContext-bean.xml") 
public class KanBanTest {
	@Autowired
	public KuWeiService kuWeiService;
	@Resource(name="kuWeiController")
	public KuWeiController kw;
	
	@Test
	public void test1() throws SQLException {
		System.out.println(System.currentTimeMillis());
		System.out.println(new KuWeiDao().list().size());
		System.out.println(System.currentTimeMillis());
	}
	@Test
	public void test2() throws SQLException {
		System.out.println(System.currentTimeMillis());
		System.out.println(new KuWeiDao().listForLiku("A").size());
		System.out.println(System.currentTimeMillis());
	}
	
	@Test
	public void test3(){
		kuWeiService.test1();
	}
	@Test
	public void test4(){
		System.out.println(kw);
	}
}
