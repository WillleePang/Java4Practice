package com.willlee.algorithms;

public class InsertionSort {

	private int[] sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			//������ĵط�����key����Ϊkey����ǰ�������С�ں������
			arr[j+1] = key;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 3, 5, 10, 56, 4, 7, 9 };
		InsertionSort insert = new InsertionSort();
		insert.sort(array);
		for(int i : array){
			System.out.print(i+" ");
		}
	}
}
