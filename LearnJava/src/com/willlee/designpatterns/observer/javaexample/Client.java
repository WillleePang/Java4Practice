package com.willlee.designpatterns.observer.javaexample;


public class Client {
	public static void main(String[] args) {

		// �������۲��߶���
		Watched watched = new Watched();
		// �����۲��߶��󣬲������۲��߶���Ǽ�
		new Watcher(watched);
		// �����۲���״̬��ֵ
		watched.setData("start");
		watched.setData("run");
		watched.setData("stop");

	}
}
