package com.willlee.designpatterns.proxy.lazyload;

public class Client {
	public static void main(String[] args) {
		IDBQuery q = new DBQueryProxy(); // ʹ�ô���
		//DBQuery dbquery = new DBQuery();
		q.request(); // ������ʹ��ʱ�Ŵ�����ʵ����
	}
}
