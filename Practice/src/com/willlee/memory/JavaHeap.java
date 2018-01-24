package com.willlee.memory;

import java.util.ArrayList;

/**
 * ���ж����ʵ�����䶼��Java���Ϸ����ڴ棬�Ѵ�С��-Xmx��-Xms������
 * ����JVM����-verbose:gc -Xms10M -Xmx10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemoryError�����ܺܿ챨��OOM��
 * @author Administrator
 * 
 */
public class JavaHeap {
	static class OOMObject {
	}

	public static void main(String[] args) {
		ArrayList<OOMObject> list = new ArrayList<OOMObject>();
		while (true) {
			list.add(new OOMObject());
		}
	}
}
