/**
 * ���ܣ�̹����Ϸ
 * 1.����̹��
 * */
package com.wangruipeng.sw;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTankGame6 extends JFrame{
    MyPanel mp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyTankGame6 mytg=new MyTankGame6();  
	}
    //���캯��
	public MyTankGame6(){
		mp=new MyPanel();
		this.add(mp);
		this.setTitle("̹����Ϸ");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		
	}
}
//�ҵ���壨̹�˻����
class MyPanel extends JPanel{
	//�����ҵ�һ��̹�ˣ�һ��Ҫ��panel��
	Hero hero=null;
	//���캯��
	public MyPanel(){
		hero =new Hero(10, 10);//һ��ʼ��λ��
	}
	//����������Զ����õ�
	public void paint(Graphics g){
		super.paint(g);
		drawTank(hero.getX(),hero.getY(),g,0, 0);
	}
	//����̹�˵ĺ���
	public void drawTank(int x,int y,Graphics g,int direct,int type){//������Щ������
		//�ж�̹������
		switch(type){
		  case 0:
			  g.setColor(Color.yellow);
			  break;
		  case 1:
			  g.setColor(Color.cyan);
		}
		//�жϷ���
		switch(direct){
		   case 0://����
			 //1.������ߵ�ͼ��
				g.fillRect(x, y, 5, 30);
				//2.�����ұߵ�ͼ��
				g.fillRect(x+15, y, 5, 30);
				//3.���м����
				g.fill3DRect(x+5, y+5, 10, 20, false);//3dͼ��
				//4.���м�Բ
				g.fillOval(x+4, y+10,10, 10);
				//5.������
				g.drawLine(x+9,y+15,x+9,y);
				break;
		}
	}
}
//̹����
class Tank
{
	//��ʾ̹�˵ĺ�����
	int x=0;
	//��ʾ̹�˵�������
	int y=0;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Tank(int x,int y){
		this.x=x;
		this.y=y;
	}
}
//�ҵ�̹������
class Hero extends Tank{
	public Hero(int x,int y){
		super(x,y);
	}
}