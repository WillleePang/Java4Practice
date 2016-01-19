package com.willlee.designpatterns.observer.carexample;

import java.util.Vector;

public class CarInfoManager implements Observable {

	//ά��һ���۲����б�
	private Vector<Observer> observersList;

	//��������
	private String deptName;

	public CarInfoManager() throws Exception {
		observersList = new Vector<Observer>();
	}

	public void register(Observer obs) {
		// ��̬�۲�����������ӹ۲���
		observersList.addElement(obs);
	}

	public void unRegister(Observer obs) {
		// �۲���������ɾ���۲���
		observersList.removeElement(obs);

	}

	public void notifyObservers() {
		// �����й۲��߷���֪ͨ
		for (int i = 0; i < observersList.size(); i++) {
			Observer observer = (Observer) observersList.elementAt(i);
			observer.update(this);
		}

	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String dept) {
		deptName = dept;
		notifyObservers(); // �˴���۲��߷���֪ͨ
	}
}
