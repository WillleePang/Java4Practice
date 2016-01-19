package com.willlee.designpatterns.observer.carexample;

public class CarCostInfo implements Observer {

	private CarInfoManager iManager;

	public CarCostInfo() {
		iManager = null;
	}

	public CarCostInfo(CarInfoManager aManager) {
		iManager = aManager;
		iManager.register(this);
	}

	public void update(Observable subject) { // ��ʾ����������Ϣ
		if (subject == iManager) {
			// �յ�֪ͨ����ȡ��״̬��������ʾ��Ϣ
			String deptName = iManager.getDeptName();
			System.out.println(deptName+"���³�������");
		}
	}

	public void setManager(CarInfoManager aManager) {
		iManager = aManager;
		iManager.register(this);
	}

}
