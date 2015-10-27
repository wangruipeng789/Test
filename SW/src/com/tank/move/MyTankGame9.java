/**
 * 功能：坦克游戏
 * 1.画出坦克
 * 2.我的坦克可以上下移动
 * */
package com.tank.move;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyTankGame9 extends JFrame{
    MyPanel mp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyTankGame9 mytg=new MyTankGame9();  
	}
    //构造函数
	public MyTankGame9(){
		mp=new MyPanel();
		mp.setBackground(Color.black);
		this.add(mp);
		//注册监听
		this.addKeyListener(mp);
		
		
		this.setTitle("坦克游戏");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 300);
		
	}
}
//我的面板（坦克活动区域）
class MyPanel extends JPanel implements KeyListener{
	//定义我的一个坦克，一定要在panel中
	Hero hero=null;
	//定义敌人的坦克
	Vector<EnergyTank> ets=new Vector<EnergyTank>();
	int ensize=3;//定义敌人的坦克数量显示的
	//构造函数
	public MyPanel(){
		hero =new Hero(10, 10);//一开始的位置
		for(int i=0;i<ensize;i++){
			//创建敌人坦克
			EnergyTank et=new EnergyTank((i+50), 0);
			et.setColor(Color.cyan);
			ets.add(et);
		}
	}
	//这个函数是自动调用的
	public void paint(Graphics g){
		super.paint(g);
		drawTank(hero.getX(),hero.getY(),g,hero.direct, 0);
		//画敌人的坦克
		for(int i=0;i<ets.size();i++){
			this.drawTank(ets.get(i).getX(), ets.get(i).getY(), g, ets.get(i).getDirect(), 1);
		}
	}
	//画出坦克的函数
	public void drawTank(int x,int y,Graphics g,int direct,int type){//跟据这些参数画
		//判断坦克类型
		switch(type){
		  case 0://自己的坦克
			  g.setColor(Color.yellow);
			  break;
		  case 1://对方的坦克
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
		   case 1://向右
				//1.画出上边的图形
				g.fillRect(x, y, 30, 5);
				//2.画出下边的图形
				g.fillRect(x, y+15, 30, 5);
				//3.画中间矩形
				g.fill3DRect(x+5, y+5, 20, 10, false);//3d图形
				//4.画中间圆
				g.fillOval(x+10, y+5,10, 10);
				//5.画出线
				g.drawLine(x+15,y+9,x+30,y+9);
				break;
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	//键 asdw左下右上
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_W){//向上
			//设置我的坦克的方向
			this.hero.setDirect(0);
			this.hero.moveUp();
		}else if(e.getKeyCode()==KeyEvent.VK_D){//向右
			this.hero.setDirect(1);
			this.hero.moveR();
		}else if(e.getKeyCode()==KeyEvent.VK_S){//向下
			this.hero.setDirect(2);
			this.hero.moveDown();
		}else if(e.getKeyCode()==KeyEvent.VK_A){//向左
			this.hero.setDirect(3);
			this.hero.moveL();
		}
		//必须重新绘制panel,---很重要
		repaint();
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
//坦克类
class Tank
{
	//表示坦克的横坐标
	int x=0;
	//表示坦克的纵坐标
	int y=0;
	//坦克的方向
	int direct=0;//0,1,2,3上右下左
	//坦克的速度
	int speed=5;//默认速度是1
	Color color;
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
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
//我的坦克类型
class Hero extends Tank{
	public Hero(int x,int y){
		super(x,y);
	}
	//坦克向上移动
	public void moveUp(){
		this.y-=speed;
	}
	//坦克向右移动
	public void moveR(){
		this.x+=speed;
	}
	//坦克向左移动
	public void moveL(){
		this.x-=speed;
	}
	//坦克向下移动
	public void moveDown(){
		this.y+=speed;
	}
}
class EnergyTank extends Tank{
	public EnergyTank(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	//坦克向上移动
		public void moveUp(){
			this.y-=speed;
		}
		//坦克向右移动
		public void moveR(){
			this.x+=speed;
		}
		//坦克向左移动
		public void moveL(){
			this.x-=speed;
		}
		//坦克向下移动
		public void moveDown(){
			this.y+=speed;
		}
}