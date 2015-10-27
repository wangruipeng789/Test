package com.wangruipeng.sw;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.media.sound.Toolkit;

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
	//paint方法会自动调用。在3种情况中会继续调用--窗口最小化再最大化；窗口大小改变；repaint方法被调用
	public void paint(Graphics g){//g看做画笔
		super.paint(g);//最好要加上
		//g.drawOval(20, 20, 100, 100);
		//注意这种获取资源的方式
		//Image im=java.awt.Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/hongbao.jpg"));
		//g.drawImage(im, 10, 10, 50, 200, this);//画到这个面板上
		g.setColor(Color.red);
		g.setFont(new Font("仿宋", Font.BOLD, 30));
		g.drawString("你好", 100, 100);
	}
}
