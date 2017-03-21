package com.xgzn.dgfj.modbus.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**********
 * 
 * @author dd
 * @date 2017年3月4日
 **********/

public class PathUtil {
	/**
	 * 获取类路径根目录
	 * @return
	 */
	public static String getClassPath(){
		return ClassLoader.getSystemResource("").getPath();
	}
	/**
	 * 获取相对类路径的文件输出流
	 * @param subPath 子路径
	 * @return 文件输出流
	 * @throws IOException
	 */
	public static FileWriter getClassPathFileWriter(String subPath) throws IOException{
		return new FileWriter(getClassPath()+subPath);
	}
	/**
	 * 获取相对类路径的文件输入流
	 * @param subPath 子路径
	 * @return 文件输入流
	 * @throws FileNotFoundException
	 */
	public static FileReader getClassPathFileReader(String subPath) throws FileNotFoundException{
		return new FileReader(getClassPath()+subPath);
	}
}
