package com.willlee.designpatterns.decorator.news;

import java.util.ArrayList;
import java.util.List;

public class DBNews extends ComponentNew{

	@Override
	public List<New> getListOfNews() {
		 List<New> list = new ArrayList<New>();
         //�����ݿ���ȡ��������䵽_list ��
         System.out.println("�����ݿ���ȡ��������䵽list ��");
         return list;
	}

}
