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
   String[] names=new String[]{"���1","���2","���3","���4"};
   String[] sites=new String[]{"�ص�1","�ص�2","�ص�3","�ص�4"};
   public SW_4(){
	   //�������
	   jp1=new JPanel();
	   jp2=new JPanel();
	   jcb=new JComboBox(names);
	   jli=new JList(sites);
	   jli.setVisibleRowCount(2);//����Ĭ�Ͽ�������
	   jsp=new JScrollPane(jli);
	   //��������
	   this.setLayout(new GridLayout(2,1));//����1��
	   //������
	   jp1.add(jcb);//jpanelĬ������ʽ���
	   jp2.add(jsp);
	   //���panel
	   this.add(jp1);
	   this.add(jp2);
	   //����frame
	   this.setTitle("���񲼾�");
   	   this.setSize(300, 200);
   	   this.setLocation(200, 200);
   	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	   //��ʾ����
   	   this.setVisible(true);
   	   //���ô��ڴ�С���ܸı�
   	   this.setResizable(false);
	   
   }
   public static void main(String[] args){
	   SW_4 sw=new SW_4();
   }
}
