package com.wangruipeng.sw;
/*
 * 1.extends
 * 2.定义需要的组件
 * 3.创建（初始化）组件（在构造函数中实现）
 * 4.添加组件
 * 5.对窗体设置
 * 6.显示窗体
 * */
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SW_2 extends JFrame{
	//定义各个组件
	JButton jb1,jb2,jb3,jb4,jb5;
    public SW_2(){
    	//创建各个组件
    	jb1=new JButton("中部");
    	jb2=new JButton("上部");
    	jb3=new JButton("下部");
    	jb4=new JButton("西部");
    	jb5=new JButton("东部");
    	//添加各个组件
    	this.add(jb1, BorderLayout.CENTER);
    	this.add(jb2,BorderLayout.NORTH);
    	this.add(jb3,BorderLayout.SOUTH);
    	this.add(jb4,BorderLayout.WEST);
    	this.add(jb5,BorderLayout.EAST);
    	//设置窗体属性
    	this.setTitle("边界布局");
    	this.setSize(300, 200);
    	this.setLocation(200, 200);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//显示窗体
    	this.setVisible(true);
    	//设置窗口大小不能改变
    	this.setResizable(false);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SW_2 sw=new SW_2();
	}

}
