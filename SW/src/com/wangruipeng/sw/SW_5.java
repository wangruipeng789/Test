package com.wangruipeng.sw;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * ͼ�λ滭
 * */
public class SW_5 extends JFrame {
  //�������
  MyJpanel mp;
  public SW_5(){
	  //�������
	  mp=new MyJpanel();
	  //������
	  this.add(mp);
	  this.setSize(400, 300);
	  this.setLocation(0, 0);//Ĭ��λ��
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  this.setVisible(true);
  }
  public static void main(String[] args){
	  SW_5 demo=new SW_5();
  }
}
class MyJpanel extends JPanel{//�ⲿ��
	//��д���ķ���
	public void paint(Graphics g){//g��������
		super.paint(g);//���Ҫ����
		g.drawOval(20, 20, 100, 100);
	}
}
