package com.willlee.java4reference;

/**
 * ����һ�����ö���ref
 * 
 * @author TianYou
 */
public class Grocery {
	private static final int SIZE = 10000;
	private double[] d = new double[SIZE];
	private String id;

	public Grocery(String id) {
		this.id = id;
	}

	public String toString() {
		return id;
	}

	public void finalize() {
		System.out.println("Finalizing ... " + id);
	}

	public double[] getD() {
		return d;
	}

	public void setD(double[] d) {
		this.d = d;
	}

}
