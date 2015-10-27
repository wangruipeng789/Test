/**
 * ���ܣ�̹����Ϸ
 * 1.����̹��
 * 2.�ҵ�̹�˿��������ƶ�
 * */
package com.tank.move;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTankGame9 extends JFrame{
    MyPanel mp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyTankGame9 mytg=new MyTankGame9();  
	}
    //���캯��
	public MyTankGame9(){
		mp=new MyPanel();
		mp.setBackground(Color.black);
		this.add(mp);
		//ע�����
		this.addKeyListener(mp);
		
		
		this.setTitle("̹����Ϸ");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		
	}
}
//�ҵ���壨̹�˻����
class MyPanel extends JPanel implements KeyListener{
	//�����ҵ�һ��̹�ˣ�һ��Ҫ��panel��
	Hero hero=null;
	//���캯��
	public MyPanel(){
		hero =new Hero(10, 10);//һ��ʼ��λ��
	}
	//����������Զ����õ�
	public void paint(Graphics g){
		super.paint(g);
		drawTank(hero.getX(),hero.getY(),g,hero.direct, 0);
	}
	//����̹�˵ĺ���
	public void drawTank(int x,int y,Graphics g,int direct,int type){//������Щ������
		//�ж�̹������
		switch(type){
		  case 0://�Լ���̹��
			  g.setColor(Color.yellow);
			  break;
		  case 1://�Է���̹��
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
		   case 1://����
				//1.�����ϱߵ�ͼ��
				g.fillRect(x, y, 30, 5);
				//2.�����±ߵ�ͼ��
				g.fillRect(x, y+15, 30, 5);
				//3.���м����
				g.fill3DRect(x+5, y+5, 20, 10, false);//3dͼ��
				//4.���м�Բ
				g.fillOval(x+10, y+5,10, 10);
				//5.������
				g.drawLine(x+15,y+9,x+30,y+9);
				break;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	//�� asdw��������
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_W){//����
			//�����ҵ�̹�˵ķ���
			this.hero.setDirect(0);
			this.hero.moveUp();
		}else if(e.getKeyCode()==KeyEvent.VK_D){//����
			this.hero.setDirect(1);
			this.hero.moveR();
		}else if(e.getKeyCode()==KeyEvent.VK_S){//����
			this.hero.setDirect(2);
			this.hero.moveDown();
		}else if(e.getKeyCode()==KeyEvent.VK_A){//����
			this.hero.setDirect(3);
			this.hero.moveL();
		}
		//�������»���panel,---����Ҫ
		repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
//̹����
class Tank
{
	//��ʾ̹�˵ĺ�����
	int x=0;
	//��ʾ̹�˵�������
	int y=0;
	//̹�˵ķ���
	int direct=0;//0,1,2,3��������
	//̹�˵��ٶ�
	int speed=5;//Ĭ���ٶ���1
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDirect() {
		return direct;
	}
	public void setDirect(int direct) {
		this.direct = direct;
	}
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
	//̹�������ƶ�
	public void moveUp(){
		this.y-=speed;
	}
	//̹�������ƶ�
	public void moveR(){
		this.x+=speed;
	}
	//̹�������ƶ�
	public void moveL(){
		this.x-=speed;
	}
	//̹�������ƶ�
	public void moveDown(){
		this.y+=speed;
	}
}