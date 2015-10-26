package com.wangruipeng.sw;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 图形绘画
 * */
public class SW_5 extends JFrame {
  //定义组件
  MyJpanel mp;
  public SW_5(){
	  //创建组件
	  mp=new MyJpanel();
	  //添加组件
	  this.add(mp);
	  this.setSize(400, 300);
	  this.setLocation(0, 0);//默认位置
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setVisible(true);
  }
  public static void main(String[] args){
	  SW_5 demo=new SW_5();
  }
}
class MyJpanel extends JPanel{//外部类
	//重写它的方法
	public void paint(Graphics g){//g看做画笔
		super.paint(g);//最好要加上
		g.drawOval(20, 20, 100, 100);
	}
}
