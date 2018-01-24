package com.willlee.algorithms.shellsort;

public class ArraySh {
	private long[] theArray;
	private int nElems;

	public ArraySh(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	public void display() {
		System.out.print("A=");
		for (int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
			if (i % 100 == 0&&i!=0) {
				System.out.println("");
			}
		}
		System.out.println("");
	}

	public void shellSort() {
		int inner, outer;
		long temp;

		int h = 1;
		while (h < nElems / 3) {
			h = h * 3 + 1;
		}
		// �ж�h�����Ƿ�1
		while (h > 0) {
			// ��h��ʼѭ������Ϊ�˴�����ģ��������������ѭ���е�������������һ������
			for (outer = h; outer < nElems; outer++) {
				temp = theArray[outer];
				inner = outer;
				// ��֮ǰ������h��������ֽ��в�������
				while (inner >= h && theArray[inner - 1] > temp) {
					theArray[inner] = theArray[inner - h];
					inner = inner - h;
				}
				theArray[inner] = temp;
			}
			h = (h - 1) / 3;
		}
	}
}
