package com.jxufe.cn.bigpane;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

import com.jxufe.cn.coutchar.CoutChar;
import com.jxufe.cn.graphpane.GraphPane;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class BigPane extends BorderPane{
	
	private boolean flag = false;
	private TextField path = new TextField();
	private GraphPane p2 = new GraphPane();
	private BorderPane p1 = new BorderPane();
	private Button view = new Button("view");
	
	public BigPane(){
		
		this.setCenter(p2);
		this.setBottom(setp1(p1));
	}
	
	public BorderPane setp1(BorderPane p1){
		
		p1.setLeft(new Label("Filename")); 
		p1.setCenter(path);
		p1.setRight(setViewButton(view));
		
		return p1;
		
	}
	
	public Button setViewButton(Button button){
		
		int res [] = new int [26];
		button.setOnAction(e->{
			if(flag)
				return;
			flag = true;
			
			String text = path.getText().trim();
			File file = new File("C:/Users/Administrator/Desktop/1.txt");//text
			try {
				CoutChar coutchar = new CoutChar();
				
//				JFileChooser jcs = new JFileChooser();
//				int a = jcs.showOpenDialog(jcs);
//				if( a == JFileChooser.APPROVE_OPTION){
//					File jcsFile = jcs.getSelectedFile();
//					Scanner jcsInput = new Scanner(jcsFile);
//					while(jcsInput.hasNext()){
//						
//						String str = jcsInput.nextLine();
//						coutchar.coutChar(str,res);
//					}
//				}
				
				Scanner input = new Scanner(file);				//close
				
				while(input.hasNext()){
					String str = input.nextLine();
					coutchar.coutChar(str,res);
				}

				p2.paintGraph(res);
				 
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		return button;
	}
	
	
}
