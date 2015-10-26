package com.wrp.test1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSplitPane;

public class Demo1 extends JFrame{
	//定义控件
   JSplitPane jsp;
   JList      jList;
   JLabel     jl;
   public Demo1(){
	   //创建控件
	   String[] names={"我是A","我是B","我是C","我是D"};
	   jList=new JList(names);
	   jl=new JLabel(new ImageIcon("images/QQ图片20151024181149.jpg"));//这个label里面是图片
	   jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jList, jl);
	   //jsp设置扩展与否
	   jsp.setOneTouchExpandable(true);
	   //设置布局，jsplitpane默认是BorderLayout,因此可以省略
	   //添加控件
	   this.add(jsp);
	   //设置窗体
	   this.setTitle("小界面");
	   this.setSize(400, 300);
	   this.setLocation(200,200);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setVisible(true);
	   this.setResizable(false);
	   
   }
   public static void main(String[] args){
	   Demo1 demo1=new Demo1();
   }
}
