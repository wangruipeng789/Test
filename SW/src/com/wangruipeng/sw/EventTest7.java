package com.wangruipeng.sw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventTest7 extends JFrame implements ActionListener{
   //定义一个panel
   JPanel jp;
   JButton  jb1;
   JButton  jb2;
   public static void main(String[] args){
	   EventTest7 demo=new EventTest7();
   }
   public EventTest7(){
	   jp=new MyJpanel();
	   jp.setBackground(Color.black);
	   jb1=new JButton("黑色");
	   jb2=new JButton("红色");
	   
	   this.add(jb1,BorderLayout.NORTH);
	   this.add(jp);
	   this.add(jb2,BorderLayout.SOUTH);
	   
	   //注册监听
	   jb1.addActionListener(this);
	   //指定action命令
	   jb1.setActionCommand("黑色");
	   jb2.addActionListener(this);
	   jb2.setActionCommand("红色");
	   
	   this.setSize(200,150);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setVisible(true);
   }
   //对事件处理的方法
   @Override
   public void actionPerformed(ActionEvent e) {
       //判断是哪个按钮被点击
	   if(e.getActionCommand().equals("黑色")){
		   //System.out.println("你点击了黑色按钮");
		   jp.setBackground(Color.black);
	   }else{
		   //System.out.println("你点击了红色按钮");
		   jp.setBackground(Color.red);
	   }
   }
}

//class MyJpanel extends JPanel{
//	public void paint(Graphics g){
//		super.paint(g);
//	}
//}