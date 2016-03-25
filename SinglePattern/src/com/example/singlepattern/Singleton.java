package com.example.singlepattern;

//ʹ���ڲ����ȡ���������������ģʽ���̵߳�����ͬʱ����˶���ģʽ����Դ�˷����⡣

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
