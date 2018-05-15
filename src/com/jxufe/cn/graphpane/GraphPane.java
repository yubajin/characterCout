package com.jxufe.cn.graphpane;

import com.jxufe.cn.recpane.RecPane;

import javafx.scene.layout.HBox;

public class GraphPane extends HBox{
	private int w = 800;
	private int h = 450;
	
	public GraphPane(){
		
	}
	
	public void paintGraph(int []res){
		
		int width = w/26 - 5;  		//�����ο��
	
		RecPane[] pane = new RecPane[26];
		
		
		for(int i = 0; i < pane.length; i++){
			int height = res[i] * 15;		//�����θ߶�
			char character= (char) ('a' + i);
			int Times = res[i];
			
			String ch = Character.toString(character);
			String times = "" + Times;
			
			/*x����Ĭ��Ϊ0����Ϊ��FlowPane,���Բ����غ�*/
			pane[i] = new RecPane(h-height,width,height,times,ch);
			
			getChildren().add(pane[i]);
		}
	
	}
}
