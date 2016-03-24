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
	//这里使用的是双重检索，保证了只能创建一个实例
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
