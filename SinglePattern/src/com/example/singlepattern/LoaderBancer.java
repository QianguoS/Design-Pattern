package com.example.singlepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoaderBancer {

	private static LoaderBancer loader;
	private List serverList;
	private LoaderBancer() {
		
		serverList = new ArrayList();
	}
	
	public static LoaderBancer getInstance(){
		if(loader == null){
			loader = new LoaderBancer();
		}
		return loader;
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
