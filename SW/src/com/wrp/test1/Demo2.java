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
 * �˵�����
 * 
 * */
public class Demo2 extends JFrame{
	//����ؼ�
    JMenuBar jmb;
    JMenu menu1,menu2,menu3,menu4,menu5;
    JMenuItem item1,item2,item3;
    //������
    JToolBar jtb;
    JButton  jb1,jb2,jb3,jb4;
    //
    JScrollPane jsp;
    JTextArea   jta;
    public Demo2(){
    	/**********************�������******/
    	//�˵���
        jmb=new JMenuBar();
    	menu1=new JMenu("�ļ�(F)");
    	menu1.setMnemonic('F');//�������Ƿ���Alt+��F�����ܴ�
    	menu2=new JMenu("�༭(E)");
    	menu3=new JMenu("��ʽ(O)");
    	menu4=new JMenu("�鿴(V)");
    	menu5=new JMenu("����(H)");
    	// �˵���
    	item1=new JMenuItem("�ļ�");
    	item2=new JMenuItem("����");
    	item3=new JMenuItem("��");
    	//������
    	jtb=new JToolBar();
    	jb1=new JButton("��");
    	jb2=new JButton("����");
    	jb3=new JButton("����");
    	jb4=new JButton("���");
    	//�ı���
    	jta=new JTextArea();
    	jsp=new JScrollPane(jta);
    	/*****���***********************************************/
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
    	this.setJMenuBar(jmb);//�����ò������
    	this.add(jtb,BorderLayout.NORTH);
    	this.add(jsp,BorderLayout.CENTER);
 	    //���ô���
 	    this.setTitle("С����");
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
