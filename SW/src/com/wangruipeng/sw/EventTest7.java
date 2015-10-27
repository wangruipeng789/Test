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
   //����һ��panel
   JPanel jp;
   JButton  jb1;
   JButton  jb2;
   public static void main(String[] args){
	   EventTest7 demo=new EventTest7();
   }
   public EventTest7(){
	   jp=new MyJpanel();
	   jp.setBackground(Color.black);
	   jb1=new JButton("��ɫ");
	   jb2=new JButton("��ɫ");
	   
	   this.add(jb1,BorderLayout.NORTH);
	   this.add(jp);
	   this.add(jb2,BorderLayout.SOUTH);
	   
	   //ע�����
	   jb1.addActionListener(this);
	   //ָ��action����
	   jb1.setActionCommand("��ɫ");
	   jb2.addActionListener(this);
	   jb2.setActionCommand("��ɫ");
	   
	   this.setSize(200,150);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setVisible(true);
   }
   //���¼�����ķ���
   @Override
   public void actionPerformed(ActionEvent e) {
       //�ж����ĸ���ť�����
	   if(e.getActionCommand().equals("��ɫ")){
		   //System.out.println("�����˺�ɫ��ť");
		   jp.setBackground(Color.black);
	   }else{
		   //System.out.println("�����˺�ɫ��ť");
		   jp.setBackground(Color.red);
	   }
   }
}

//class MyJpanel extends JPanel{
//	public void paint(Graphics g){
//		super.paint(g);
//	}
//}