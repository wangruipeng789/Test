package com.wangruipeng.sw;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SW extends JFrame {
   JButton jb;//创建
   public SW(){
	   this.setTitle("王瑞鹏");
	   this.setSize(200, 200);
	   this.setLocation(200, 200);
	   this.setVisible(true);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   jb=new JButton("我是按钮");//初始化
	   this.add(jb);
   }
   public static void main(String[] args){
	   SW sw=new SW();
   }
}
