/**
 * 功能：坦克游戏
 * 1.画出坦克
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
    //构造函数
	public MyTankGame6(){
		mp=new MyPanel();
		this.add(mp);
		this.setTitle("坦克游戏");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		
	}
}
//我的面板（坦克活动区域）
class MyPanel extends JPanel{
	//定义我的一个坦克，一定要在panel中
	Hero hero=null;
	//构造函数
	public MyPanel(){
		hero =new Hero(10, 10);//一开始的位置
	}
	//这个函数是自动调用的
	public void paint(Graphics g){
		super.paint(g);
		drawTank(hero.getX(),hero.getY(),g,0, 0);
	}
	//画出坦克的函数
	public void drawTank(int x,int y,Graphics g,int direct,int type){//跟据这些参数画
		//判断坦克类型
		switch(type){
		  case 0:
			  g.setColor(Color.yellow);
			  break;
		  case 1:
			  g.setColor(Color.cyan);
		}
		//判断方向
		switch(direct){
		   case 0://向上
			 //1.画出左边的图形
				g.fillRect(x, y, 5, 30);
				//2.画出右边的图形
				g.fillRect(x+15, y, 5, 30);
				//3.画中间矩形
				g.fill3DRect(x+5, y+5, 10, 20, false);//3d图形
				//4.画中间圆
				g.fillOval(x+4, y+10,10, 10);
				//5.画出线
				g.drawLine(x+9,y+15,x+9,y);
				break;
		}
	}
}
//坦克类
class Tank
{
	//表示坦克的横坐标
	int x=0;
	//表示坦克的纵坐标
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
//我的坦克类型
class Hero extends Tank{
	public Hero(int x,int y){
		super(x,y);
	}
}