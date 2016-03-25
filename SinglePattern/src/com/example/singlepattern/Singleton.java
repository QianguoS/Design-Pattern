package com.example.singlepattern;

//使用内部类获取单例，解决了懒汉模式多线程的问题同时解决了饿汉模式的资源浪费问题。

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Singleton {
	private List serverList;
	
	
	private Singleton() {
		super();
		// TODO Auto-generated constructor stub
		serverList = new ArrayList();
	}

	private static class SingletonPattern{
		private final static Singleton singleton = new Singleton();
	}
	public static Singleton getInstance(){
		
		return SingletonPattern.singleton;
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
