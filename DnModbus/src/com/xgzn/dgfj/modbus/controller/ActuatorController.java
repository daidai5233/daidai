package com.xgzn.dgfj.modbus.controller;

public class ActuatorController extends BaseController implements Runnable{

	@Override
	public void showTest() {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>ActuatorController");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("BB运行     " + i);
        }
	}

}
