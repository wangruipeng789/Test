package com.wangruipeng.sw;
/*
 * 1.extends
 * 2.������Ҫ�����
 * 3.��������ʼ����������ڹ��캯����ʵ�֣�
 * 4.������
 * 5.�Դ�������
 * 6.��ʾ����
 * */
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SW_2 extends JFrame{
	//����������
	JButton jb1,jb2,jb3,jb4,jb5;
    public SW_2(){
    	//�����������
    	jb1=new JButton("�в�");
    	jb2=new JButton("�ϲ�");
    	jb3=new JButton("�²�");
    	jb4=new JButton("����");
    	jb5=new JButton("����");
    	//��Ӹ������
    	this.add(jb1, BorderLayout.CENTER);
    	this.add(jb2,BorderLayout.NORTH);
    	this.add(jb3,BorderLayout.SOUTH);
    	this.add(jb4,BorderLayout.WEST);
    	this.add(jb5,BorderLayout.EAST);
    	//���ô�������
    	this.setTitle("�߽粼��");
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
        SW_2 sw=new SW_2();
	}

}
