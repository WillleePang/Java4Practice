package com.willlee.memory;

/**
 * ջ�Ǵ���̵߳��÷���ʱ�洢�ֲ��������������������ڵ��뷽��ִ����ص���Ϣ��ջ��С��Xss�����ڣ��������ò��̫���ű��������
 * ����JVM������-Xss128k
 * 
 * @author Administrator
 * 
 */
public class Stack {
	private int stackLength = 1;

	public void stackLeak() {
		stackLength++;
		stackLeak();
	}

	public static void main(String[] args) throws Throwable {
		Stack oom = new Stack();
		try {
			oom.stackLeak();
		} catch (Throwable err) {
			System.out.println("Stack length:" + oom.stackLength);
			throw err;
		}

	}
}
