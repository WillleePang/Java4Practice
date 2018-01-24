package com.willlee.designpatterns.singleton;

public class LockSingleton {
	private static LockSingleton singleTon = null;

	public LockSingleton() {
	}

	public static LockSingleton getInstance() {
		// Double-Check Locking
		/*
		 * Ϊ��Ҫʹ��˫�ؼ�������أ� ��������һ������������������߳�ͬʱ�����ͬʱ���� GetInstance������ ��ʱ����
		 * singleton == null �����Ժ����ԣ������̶߳�����ͨ����һ�ص� singleton == null �� �����һ�� if
		 * �������ڴ��������ƣ����Ի���һ���߳̽��� lock ��䲢����ڶ��� singleton == null �� �������һ���߳������
		 * lock ��������ȴ��� ������һ���߳�ִ���� new Singleton�������󣬱���˳��������򣬴�ʱ���ڶ����̱߳���Խ���
		 * lock ���飬 ��ʱ�����û�еڶ��� singleton == null �Ļ�����ô�ڶ����̻߳��ǿ��Ե��� new
		 * Singleton������䣬 �����ڶ����߳�Ҳ�ᴴ��һ�� Singleton ʵ��������Ҳ����Υ���˵���ģʽ�ĳ��Եģ�
		 * �����������Ҫʹ��˫�ؼ�������� ϸ�ĵ�����һ���ᷢ�֣������ȥ����һ�� singleton == null
		 * �������ǿ����ڶ��߳�����õ����еģ� ������û�е�һ�� singleton == null ������£� ���������߳�ͬʱ�����ʱ������
		 * lock ���ƵĴ��ڣ���һ���̻߳���� lock ���飬���ҿ���˳��ִ�� new Singleton������ ����һ���߳��˳� lock
		 * ����ʱ�� singleton �����̬�����Ѳ�Ϊ null �ˣ����Ե��ڶ����߳̽��� lock ʱ�� ���ǻᱻ�ڶ��� singleton
		 * == null �������棬���޷�ִ�� new Singleton������ ������û�е�һ�� singleton == null
		 * ������£�Ҳ�ǿ���ʵ�ֵ���ģʽ�ģ���ôΪʲô��Ҫ��һ�� singleton == null �أ�
		 * ������漰һ�����������ˣ���Ϊ���ڵ���ģʽ�Ļ���new Singleton����ֻ��Ҫִ��һ�ξ� OK �ˣ� �����û�е�һ��
		 * singleton == null �Ļ���ÿһ�����߳̽��� GetInstance����ʱ������ִ������������ʵ���߳�ͬ����
		 * ���Ƿǳ��ķ����ܵģ�������Ҽ��ϵ�һ�� singleton == null �Ļ��� ��ô��ֻ���ڵ�һ�Σ�Ҳ���� singleton
		 * ==null ����ʱ�������ִ��һ��������ʵ���߳�ͬ���� ���Ժ�Ļ�����ֻҪֱ�ӷ��� Singleton ʵ���� OK �˶����������ٽ���
		 * lock �����ˣ������Ϳ��Խ�����߳�ͬ�����������������ˡ�
		 * �ã����ڶ��߳��µ���ģʽ��ʵ�ֵĽ��ܾ͵������ˣ����ǣ����ڵ���ģʽ�Ľ��ܻ�û�ꡣ
		 */
		if (singleTon == null) {
			synchronized (LockSingleton.class) {
				if (singleTon == null) {
					singleTon = new LockSingleton();
				}
			}
		}
		return singleTon;
	}
}
