package test;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.xgzn.dgfj.modbus.util.DigitalTransUtil;
import com.xgzn.dgfj.modbus.util.ModbusUtil;

/************************************************************
 * 
 * @author DaiJian
 * @date 2017年3月17日
 ***********************************************************/

public class ModBusTest {
	Logger logger = Logger.getLogger(ModBusTest.class);
	//写一个int值
	@Test
	public void test1() {
		ModbusUtil.writeRegister("127.0.0.1",5050, 2, 21, 12);
	}
	//写一个状态值(0或1)
	@Test
	public void test2() {
		//往PLC写入一个状态值(0/1)
		ModbusUtil.writeDigitalOutput("127.0.0.1",5050, 1, 1, 0);
	}
	//
	@Test
	public void test3() {
		//从PLC获取字符串(条码)
		System.err.println(ModbusUtil.readManyRegisterString("127.0.0.1",5050, 0, 2, 18));
	}
	@Test
	public void test4() {
		//从PLC获取int值
		System.err.println(ModbusUtil.readRegister("127.0.0.1",5050, 3, 1));
	}
	@Test
	public void test5(){
		//把字符串转为hex字符串
		String code = "8ABH753964JN59336V";
		String hexStr = DigitalTransUtil.StringToAsciiString(code);
		System.out.println(hexStr);
		
	}

}
