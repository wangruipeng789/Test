package com.wangruipeng.sw;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SW extends JFrame {
   JButton jb;//����
   public SW(){
	   this.setTitle("������");
	   this.setSize(200, 200);
	   this.setLocation(200, 200);
	   this.setVisible(true);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   jb=new JButton("���ǰ�ť");//��ʼ��
	   this.add(jb);
   }
   public static void main(String[] args){
	   SW sw=new SW();
   }
}
