package com.jxufe.cn.entity;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.jxufe.cn.bigpane.BigPane;
import com.jxufe.cn.coutchar.CoutChar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class work extends Application{
	private int w = 800;
	private int h = 500;
	private boolean flag =false;
	
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		BigPane p = new BigPane();
		
		Scene scene = new Scene(p,w,h);          
		
		stage.setTitle("统计字符直方图");
		stage.setScene(scene);
		stage.show();
	}

	public static void  main(String [] args){
		Application.launch(args);
	}
	
}
