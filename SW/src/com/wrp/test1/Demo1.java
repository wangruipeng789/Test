package com.wrp.test1;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JSplitPane;

public class Demo1 extends JFrame{
	//����ؼ�
   JSplitPane jsp;
   JList      jList;
   JLabel     jl;
   public Demo1(){
	   //�����ؼ�
	   String[] names={"����A","����B","����C","����D"};
	   jList=new JList(names);
	   jl=new JLabel(new ImageIcon("images/QQͼƬ20151024181149.jpg"));//���label������ͼƬ
	   jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jList, jl);
	   //jsp������չ���
	   jsp.setOneTouchExpandable(true);
	   //���ò��֣�jsplitpaneĬ����BorderLayout,��˿���ʡ��
	   //��ӿؼ�
	   this.add(jsp);
	   //���ô���
	   this.setTitle("С����");
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
