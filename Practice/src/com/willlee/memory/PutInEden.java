package com.willlee.memory;

public class PutInEden {

	public static void main(String[] args) {
		// ��������ϸGC��־ģʽ
		// -XX:+PrintGCDetails -Xmx20M -Xms20M
		// -XX:+PrintGCDetails -Xmx20M -Xms20M -Xmn4M
		// byte[] b1, b2, b3, b4;// �������
		// b1 = new byte[1024 * 1024];// ���� 1MB �ѿռ䣬����ѿռ��ʹ�����
		// b2 = new byte[1024 * 1024];
		// b3 = new byte[1024 * 1024];
		// b4 = new byte[1024 * 1024];

		// -XX:+PrintGCDetails -Xmx1000M -Xms500M -Xmn100M -XX:SurvivorRatio=8
		// byte[] b1, b2, b3;
		// b1 = new byte[1024 * 512];// ���� 0.5MB �ѿռ�
		// b2 = new byte[1024 * 1024 * 90];// ���� 4MB �ѿռ�
		// b3 = new byte[1024 * 1024 * 50];
		// b3 = null; // ʹ b3 ���Ա�����
		// b3 = new byte[1024 * 1024 * 4];// ���� 4MB �ѿռ�
		
	}
}
