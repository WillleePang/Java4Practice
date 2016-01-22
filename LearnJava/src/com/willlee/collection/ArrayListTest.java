package com.willlee.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * ͨ��ensureCapacity(int paramInt)�����������ArrayList�ĳ�ʼ���ٶ�
 * 
 * @author Administrator
 * 
 */
public class ArrayListTest {

	public static void endureCapacity() {
		int N = 1000000;
		Object object = new Object();

		ArrayList<Object> list = new ArrayList<Object>();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= N; i++) {
			list.add(object);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("û�е���ensureCapacity()��������ʱ�䣺"
				+ (endTime - startTime) + "ms");

		/* ����ensureCapacity()������ʼ��ArrayList���� */
		list = new ArrayList<Object>();
		startTime = System.currentTimeMillis();

		// Ԥ������list�Ĵ�С
		list.ensureCapacity(N);
		for (int i = 0; i <= N; i++) {
			list.add(object);
		}
		endTime = System.currentTimeMillis();
		System.out.println("����ensureCapacity()��������ʱ�䣺" + (endTime - startTime)
				+ "ms");
	}

	public static void ArrayListandLinkedList() {
		long start = System.currentTimeMillis();
		ArrayList<Object> list = new ArrayList<Object>();
		Object obj = new Object();
		for (int i = 0; i < 5000000; i++) {
			list.add(obj);
		}
		long end = System.currentTimeMillis();
		System.out.println("arraylist���object���õ�ʱ�䣺 "+(end - start));

		start = System.currentTimeMillis();
		LinkedList<Object> list1 = new LinkedList<Object>();
		Object obj1 = new Object();
		for (int i = 0; i < 5000000; i++) {
			list1.add(obj1);
		}
		end = System.currentTimeMillis();
		System.out.println("linkedlist���object���õ�ʱ�䣺"+(end - start));

		start = System.currentTimeMillis();
		Object obj2 = new Object();
		for (int i = 0; i < 1000; i++) {
			list.add(0, obj2);
		}
		end = System.currentTimeMillis();
		System.out.println("arraylist��ͷ���object���õ�ʱ�䣺 "+(end - start));

		start = System.currentTimeMillis();
		Object obj3 = new Object();
		for (int i = 0; i < 1000; i++) {
			list1.add(obj3);
		}
		end = System.currentTimeMillis();
		System.out.println("linkedlist��ͷ���object���õ�ʱ�䣺"+(end - start));

		start = System.currentTimeMillis();
		list.remove(0);
		end = System.currentTimeMillis();
		System.out.println("arraylist��ͷ�Ƴ�object���õ�ʱ�䣺 "+(end - start));

		start = System.currentTimeMillis();
		list1.remove(250000);
		end = System.currentTimeMillis();
		System.out.println("linkedlist��ͷ�Ƴ�object���õ�ʱ�䣺"+(end - start));

	}

	public static void main(String[] args) {
		ArrayListandLinkedList();
	}
}
