package com.example.singlepattern;

public class Singleton {
	private static class SingletonPattern{
		private final static Singleton singleton = new Singleton();
	}
	public static Singleton getInstance(){
		
		return SingletonPattern.singleton;
	}

}
