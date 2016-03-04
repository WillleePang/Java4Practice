package com.willlee.algorithms.partitionsort;

public class ArrayPar {
	private long[] theArray;
	private int nElems;

	public ArrayPar(int max) {
		theArray = new long[max];
		nElems = 0;
	}

	public void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	public int size() {
		return nElems;
	}

	public void display() {
		System.out.print("A=");
		for (int j = 0; j < nElems; j++) {
			System.out.print(theArray[j] + " ");
		}
		System.out.println("");
	}

	// left������ĵ�һ������index��right����������һ������index
	public int partition(int left, int right, long pivot) {
		int leftPtr = left - 1;// right of first elem
		int rightPtr = right + 1;// left of pivot
		while (true) {
			// find bigger item
			while (leftPtr < right && theArray[++leftPtr] < pivot) {
				;
			}
			// find smaller item
			while (rightPtr > left && theArray[--rightPtr] > pivot) {
				;
			}
			if (leftPtr >= rightPtr) {// if pointers cross, partition done
				break;
			} else { // not crossed ,so swap elements
				swap(leftPtr, rightPtr);
			}
		}
		return leftPtr;
	}

	public void swap(int dex1, int dex2) {
		long temp;
		temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
}
