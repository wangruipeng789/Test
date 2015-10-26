package com.wangruipeng.sw;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class SW_4 extends JFrame{
   JPanel jp1,jp2;
   JComboBox jcb;
   JList     jli;
   JScrollPane jsp;
   String[] names=new String[]{"你好1","你好2","你好3","你好4"};
   String[] sites=new String[]{"地点1","地点2","地点3","地点4"};
   public SW_4(){
	   //创建组件
	   jp1=new JPanel();
	   jp2=new JPanel();
	   jcb=new JComboBox(names);
	   jli=new JList(sites);
	   jli.setVisibleRowCount(2);//设置默认看见两个
	   jsp=new JScrollPane(jli);
	   //创建布局
	   this.setLayout(new GridLayout(2,1));//两行1列
	   //添加组件
	   jp1.add(jcb);//jpanel默认是流式添加
	   jp2.add(jsp);
	   //添加panel
	   this.add(jp1);
	   this.add(jp2);
	   //设置frame
	   this.setTitle("网格布局");
   	   this.setSize(300, 200);
   	   this.setLocation(200, 200);
   	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	   //显示窗体
   	   this.setVisible(true);
   	   //设置窗口大小不能改变
   	   this.setResizable(false);
	   
   }
   public static void main(String[] args){
	   SW_4 sw=new SW_4();
   }
}
