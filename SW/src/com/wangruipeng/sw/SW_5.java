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
	//paint�������Զ����á���3������л��������--������С������󻯣����ڴ�С�ı䣻repaint����������
	public void paint(Graphics g){//g��������
		super.paint(g);//���Ҫ����
		//g.drawOval(20, 20, 100, 100);
		//ע�����ֻ�ȡ��Դ�ķ�ʽ
		//Image im=java.awt.Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/hongbao.jpg"));
		//g.drawImage(im, 10, 10, 50, 200, this);//������������
		g.setColor(Color.red);
		g.setFont(new Font("����", Font.BOLD, 30));
		g.drawString("���", 100, 100);
	}
}
