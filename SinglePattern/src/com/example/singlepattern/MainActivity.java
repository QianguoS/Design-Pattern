package com.example.singlepattern;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	private LoaderBancer loader1,loader2,loader3;
	private TextView text;
	private TextView display;
	
	private Singleton singlePattern;
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化实例
        //initLoader();
        //displayServer();
        singlePattern = Singleton.getInstance();
        
    }
	private void displayServer() {
		if(loader1==loader2&&loader2==loader3){
        	text.setText("这是一个实例哈，简单");
        }
        
        loader1.addServer("server1");
        loader1.addServer("server2");
        loader1.addServer("server3");
        loader1.addServer("server4");
        
        for(int i=0;i<10;i++){
        	try {
        		display.setText(loader1.getRandomServer());
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}
	private void initLoader() {
		// TODO Auto-generated method stub
		loader1 = LoaderBancer.getInstance();
		loader2 = LoaderBancer.getInstance();
		loader3 = LoaderBancer.getInstance();
		text = (TextView)findViewById(R.id.text);
		display = (TextView)findViewById(R.id.display);
	}
    
    
}
