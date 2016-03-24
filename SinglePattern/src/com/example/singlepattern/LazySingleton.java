package com.example.singlepattern;

import java.util.ArrayList;
import java.util.List;

public class LazySingleton {

	private volatile static LazySingleton lazySingleton;
	private List serverList;
	public LazySingleton() {
		super();
		// TODO Auto-generated constructor stub
		serverList = new ArrayList();
	}
	//����ʹ�õ���˫�ؼ�������֤��ֻ�ܴ���һ��ʵ��
	 public static LazySingleton getInstance(){
		 if(lazySingleton == null){
			 synchronized(LazySingleton.class){
				 if(lazySingleton == null){
					 lazySingleton = new LazySingleton();
				 }
			 }
		 }
		 return lazySingleton;
	 }
	
	
}
