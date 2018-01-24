package com.willlee.designpatterns.observer.carexample;

public class CarListInfo implements Observer {

	private CarInfoManager iManager;

	public CarListInfo() {
		iManager = null;
	}

	public CarListInfo(CarInfoManager aManager) {
		iManager = aManager;
		iManager.register(this);
	}

	public void update(Observable subject) { // ��ʾ�����б���Ϣ
		if (subject == iManager) {
			// �յ�֪ͨ����ȡ��״̬��������ʾ��Ϣ
			String deptName = iManager.getDeptName();
			System.out.println(deptName+"���³����б���Ϣ");
		}

	}

	public void setManager(CarInfoManager aManager) {
		iManager = aManager;
		iManager.register(this);
	}

}
