package com.wangruipeng.sw;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * ���񲼾�
 */
public class SW_3 extends JFrame{
	int size=9;
	//�������
	JButton[] jbs=new JButton[size];
	public SW_3(){
		//�������
		for(int i=0;i<size;i++){
			jbs[i]=new JButton(i+"");//תΪ�ַ���
		}
		//���ò��ֹ�����
		this.setLayout(new GridLayout(3,3));//3��3��,������Ĭ����BorderLayout
		//������
		for(int i=0;i<size;i++){
			this.add(jbs[i]);
		}
		//���ô���
		this.setTitle("���񲼾�");
    	this.setSize(300, 200);
    	this.setLocation(200, 200);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	//��ʾ����
    	this.setVisible(true);
    	//���ô��ڴ�С���ܸı�
    	this.setResizable(false);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SW_3 sw=new SW_3();
	}

}
