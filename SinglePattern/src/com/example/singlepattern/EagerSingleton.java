package com.example.singlepattern;
//饿汉模式，在类的实例化时候创建
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EagerSingleton {
	
	private static EagerSingleton eagerSingleton = new EagerSingleton();
	private List serverList;
	
	
	
	private EagerSingleton() {
		super();
		// TODO Auto-generated constructor stub
		serverList = new ArrayList();
	}

	public static EagerSingleton getInstace(){
		return eagerSingleton;
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
