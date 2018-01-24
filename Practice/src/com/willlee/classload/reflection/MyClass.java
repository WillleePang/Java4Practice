package com.willlee.classload.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyClass {
	public int count;

	public MyClass(int start) {
		count = start;
	}

	public void increase(int step) {
		count += step;
	}

	public static void main(String[] args) {
		MyClass myClass = new MyClass(0); // һ������
		myClass.increase(2);
		System.out.println("Normal -> " + myClass.count);
		try {
			Constructor<MyClass> constructor = MyClass.class
					.getConstructor(int.class); // ��ȡ���췽��
			MyClass myClassReflect = (MyClass) constructor.newInstance(10); // ��������
			Method method = MyClass.class.getMethod("increase", int.class); // ��ȡ����
			method.invoke(myClassReflect, 5); // ���÷���
			Field field = MyClass.class.getField("count"); // ��ȡ��
			System.out.println("Reflect -> " + field.getInt(myClassReflect)); // ��ȡ���ֵ
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
