package com.willlee.designpatterns.observer.carexample;

public class Client {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		//�����������
		CarInfoManager iSubject = new CarInfoManager();
		//�����۲���
		CarCostInfo costOb = new CarCostInfo(iSubject);
		CarListInfo listOb = new CarListInfo (iSubject);
		//����״̬���¡�֪ͨ���۲���
		iSubject.setDeptName("����");
		iSubject.setDeptName("������");
	}
}
