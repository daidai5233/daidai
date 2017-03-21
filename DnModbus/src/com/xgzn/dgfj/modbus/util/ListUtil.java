package com.xgzn.dgfj.modbus.util;

import java.util.List;

/************************************************************
 * 
 * @author DaiJian
 * @date 2017年2月27日
 ***********************************************************/

public class ListUtil {
	/**
	 * 将字符串集合转换为'A','B','C'格式
	 * @param list
	 * @return
	 */
	public static String stringListToStr(List<String> list){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<list.size();i++){
			sb.append("'"+list.get(i)+"'");
			if(i!=list.size()-1){
				sb.append(",");
			}
		}
		return sb.toString();
	}
	
	
}
