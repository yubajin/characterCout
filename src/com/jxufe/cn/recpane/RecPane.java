package com.jxufe.cn.recpane;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class RecPane extends Pane{
	 public RecPane(int y , double width, double height,String times,String ch){
		 
		Rectangle rec = new Rectangle(0,y, width,height); 
		rec.setStrokeWidth(2);
		
		Text text = new Text(0,y-10,times);
		
		rec.setStroke(Color.BLACK);
		rec.setFill(Color.WHITE);
		
		Line line = new Line(0,y + height,5 + width,y + height);
		line.setStrokeWidth(2);
		
		Text text1 = new Text(7,y + height + 15,ch);
		text1.setFont(Font.font("SansSerif",14));
		text1.setTextAlignment(TextAlignment.CENTER);
		
		getChildren().addAll(rec,text,text1,line);
	 }
}
