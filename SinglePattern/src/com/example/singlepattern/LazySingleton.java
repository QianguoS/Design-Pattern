package com.example.singlepattern;
//懒汉模式，多线程创建该实例的时候造成系统效率低下
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LazySingleton {

	private volatile static LazySingleton lazySingleton;
	private List serverList;
	private LazySingleton() {
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
	 public void addServer(String server){
			serverList.add(server);
		}
	public void remove(String server){
			serverList.remove(server);
		}
		
	public String getRandomServer(){
			Random random = new Random();
			int i = random.nextInt(serverList.size());
			return (String) serverList.get(i);
		}
	
}
