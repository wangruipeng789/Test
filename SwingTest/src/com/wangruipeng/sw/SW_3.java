package com.wangruipeng.sw;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * 网格布局
 */
public class SW_3 extends JFrame{
	int size=9;
	//定义组件
	JButton[] jbs=new JButton[size];
	public SW_3(){
		//创建组件
		for(int i=0;i<size;i++){
			jbs[i]=new JButton(i+"");//转为字符串
		}
		//设置布局管理器
		this.setLayout(new GridLayout(3,3));//3行3列,不设置默认是BorderLayout
		//添加组件
		for(int i=0;i<size;i++){
			this.add(jbs[i]);
		}
		//设置窗体
		this.setTitle("网格布局");
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
		 SW_3 sw=new SW_3();
	}

}
