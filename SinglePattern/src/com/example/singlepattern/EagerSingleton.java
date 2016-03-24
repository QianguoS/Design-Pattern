package com.example.singlepattern;

import java.util.ArrayList;
import java.util.List;

public class EagerSingleton {
	
	private static EagerSingleton eagerSingleton = new EagerSingleton();
	private List serverList;
	
	
	
	public EagerSingleton() {
		super();
		// TODO Auto-generated constructor stub
		serverList = new ArrayList();
	}



	public static EagerSingleton getInstace(){
		return eagerSingleton;
	}

}
