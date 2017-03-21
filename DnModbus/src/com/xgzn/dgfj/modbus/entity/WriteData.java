package com.xgzn.dgfj.modbus.entity;

/************************************************************
 * 
 * @author DaiJian
 * @date 2017年3月21日
 ***********************************************************/

public class WriteData {
	private String ip;
	private int port;
	private int slaveId;
	private int address;
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getSlaveId() {
		return slaveId;
	}
	public void setSlaveId(int slaveId) {
		this.slaveId = slaveId;
	}
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	
	
}
