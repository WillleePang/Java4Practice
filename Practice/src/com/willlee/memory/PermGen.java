package com.willlee.memory;

import java.util.ArrayList;

/**
 * �������Ǵ�������������������Ϣ�����ࡢ��̬�����ͳ�������С��-XX:PermSize��-XX:MaxPermSize�����ڣ���̫���п��ܳű����ô�
 * �������ô���JVM������-XX:PermSize=10M -XX:MaxPermSize=10M
 * @author Administrator
 * 
 */
public class PermGen {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();  
        int i=0;  
        while(true){  
            list.add(String.valueOf(i++).intern());  
        }  
	}
}
