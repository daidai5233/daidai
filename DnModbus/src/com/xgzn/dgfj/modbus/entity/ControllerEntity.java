package com.xgzn.dgfj.modbus.entity;

import java.util.Map;

import com.xgzn.dgfj.modbus.controller.IController;
import com.xgzn.dgfj.modbus.util.SimulationMode;

import net.wimpi.modbus.Modbus;

public class ControllerEntity {
	
	private int id;
	private int slaveId;
	private SimulationMode mode;
	private IController controller;
	private Map<Integer, RegisterEntity> registers;
	private String ip;
	private int port;
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		if(port == 0){
			return Modbus.DEFAULT_PORT;
		}
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public SimulationMode getMode() {
		return mode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSlaveId() {
		return slaveId;
	}
	public void setSlaveId(int slaveId) {
		this.slaveId = slaveId;
	}
	public void setMode(SimulationMode mode) {
		this.mode = mode;
	}
	public IController getController() {
		return controller;
	}
	public void setController(IController controller) {
		this.controller = controller;
	}
	public Map<Integer, RegisterEntity> getRegisters() {
		return registers;
	}
	public void setRegisters(Map<Integer, RegisterEntity> registers) {
		this.registers = registers;
	}
}
