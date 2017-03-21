package com.xgzn.dgfj.modbus.entity;

import java.util.ArrayList;
import java.util.List;

public class RegisterEntity {

	private int address;
	private int value;
	private String type;
	private List<ReadData> datas = new ArrayList<>();
	private List<WriteData> writeDatas = new ArrayList<>();
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<ReadData> getDatas() {
		return datas;
	}
	public void setDatas(List<ReadData> datas) {
		this.datas = datas;
	}
	public List<WriteData> getWriteDatas() {
		return writeDatas;
	}
	public void setWriteDatas(List<WriteData> writeDatas) {
		this.writeDatas = writeDatas;
	}
	public void addReadData(ReadData data){
		datas.add(data);
	}
	public void addWriteData(WriteData data){
		writeDatas.add(data);
	}
	
}

