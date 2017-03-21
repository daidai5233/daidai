package com.xgzn.dgfj.modbus.entity;

/************************************************************
 * 
 * @author DaiJian
 * @date 2017年3月21日
 ***********************************************************/

public class ReadData {
	private int dataAddress;
	private int dataLength;
	private int dataType;
	private String type;
	/**
	 * @return the dataAddress
	 */
	public int getDataAddress() {
		return dataAddress;
	}
	/**
	 * @param dataAddress the dataAddress to set
	 */
	public void setDataAddress(int dataAddress) {
		this.dataAddress = dataAddress;
	}
	/**
	 * @return the dataLength
	 */
	public int getDataLength() {
		return dataLength;
	}
	/**
	 * @param dataLength the dataLength to set
	 */
	public void setDataLength(int dataLength) {
		this.dataLength = dataLength;
	}
	/**
	 * @return the dataType
	 */
	public int getDataType() {
		return dataType;
	}
	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(int dataType) {
		this.dataType = dataType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
