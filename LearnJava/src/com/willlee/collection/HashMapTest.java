package com.willlee.collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	/**
	 * ��ӡ�������г���n/2���ϵ�Ԫ��
	 * ����һ��HashMap���������Ԫ�ؼ����ֵĴ���
	 * @author erqing
	 * 
	 */
	public static void test1() {
		int[] a = { 2, 3, 2, 2, 1, 4, 2, 2, 2, 7, 9, 6, 2, 2, 3, 1, 0 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				int temp = map.get(a[i]);
				temp++;
				map.put(a[i], temp);
			} else {
				map.put(a[i], 1);
			}
		}
		Set<Integer> entrySet = map.keySet();
		for (Integer key : entrySet) {
			if (map.get(key) >= a.length / 2) {
				System.out.println(key);
			}
		}
	}
	
	public static void main(String[] args) {
		test1();
	}
	

}
