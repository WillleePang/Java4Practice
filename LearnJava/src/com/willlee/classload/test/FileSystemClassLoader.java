package com.willlee.classload.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * �������ش洢���ļ�ϵͳ�ϵ� Java �ֽڴ���
 * 
 * @author Administrator
 * 
 */
public class FileSystemClassLoader extends ClassLoader {
	private String rootDir;

	public FileSystemClassLoader(String rootDir) {
		this.rootDir = rootDir;
	}

	//����class
	protected Class<?> findClass(String className)
			throws ClassNotFoundException {
		byte[] classData = getClassData(className);
		if (classData == null) {
			throw new ClassNotFoundException();
		} else {
			//ִ�ж��������
			return defineClass(className, classData, 0, classData.length);
		}

	}

	//����ת�����ֽ�����
	protected byte[] getClassData(String className) {
		String path = classNameToPath(className);
		try {
			InputStream ins = new FileInputStream(path);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[4096];
			int bytesNumRead = 0;
			while ((bytesNumRead = ins.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesNumRead);
			}
			return baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	//��ȡ���·��
	protected String classNameToPath(String className) {
		return rootDir + File.separatorChar
				+ className.replace('.', File.separatorChar) + ".class";
	}

}
