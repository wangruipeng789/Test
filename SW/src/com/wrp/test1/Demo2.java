package com.wrp.test1;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
/*
 * 菜单功能
 * 
 * */
public class Demo2 extends JFrame{
	//定义控件
    JMenuBar jmb;
    JMenu menu1,menu2,menu3,menu4,menu5;
    JMenuItem item1,item2,item3;
    //工具条
    JToolBar jtb;
    JButton  jb1,jb2,jb3,jb4;
    //
    JScrollPane jsp;
    JTextArea   jta;
    public Demo2(){
    	/**********************创建组件******/
    	//菜单栏
        jmb=new JMenuBar();
    	menu1=new JMenu("文件(F)");
    	menu1.setMnemonic('F');//设置助记符，Alt+‘F’就能打开
    	menu2=new JMenu("编辑(E)");
    	menu3=new JMenu("格式(O)");
    	menu4=new JMenu("查看(V)");
    	menu5=new JMenu("帮助(H)");
    	// 菜单项
    	item1=new JMenuItem("文件");
    	item2=new JMenuItem("工程");
    	item3=new JMenuItem("打开");
    	//工具条
    	jtb=new JToolBar();
    	jb1=new JButton("打开");
    	jb2=new JButton("保存");
    	jb3=new JButton("试试");
    	jb4=new JButton("随便");
    	//文本域
    	jta=new JTextArea();
    	jsp=new JScrollPane(jta);
    	/*****添加***********************************************/
    	menu1.add(item1);
    	menu1.add(item2);
    	menu1.add(item3);
    	
    	jmb.add(menu1);
    	jmb.add(menu2);
    	jmb.add(menu3);
    	jmb.add(menu4);
    	jmb.add(menu5);
    	
    	jtb.add(jb1);
    	jtb.add(jb2);
    	jtb.add(jb3);
    	jtb.add(jb4);
    	this.setJMenuBar(jmb);//用设置不用添加
    	this.add(jtb,BorderLayout.NORTH);
    	this.add(jsp,BorderLayout.CENTER);
 	    //设置窗体
 	    this.setTitle("小界面");
 	    this.setSize(400, 300);
 	    this.setLocation(200,200);
 	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	    this.setVisible(true);
 	    this.setResizable(false);
    }
    public static void main(String[] args){
    	Demo2 demo2=new Demo2();
    }
}
