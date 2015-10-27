
package com.wangruipeng.sw;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyEventTest8 extends JFrame{
	Mypanel_8 mp;
	public static void main(String [] args){
		 KeyEventTest8 demo=new KeyEventTest8();
    }
    public KeyEventTest8(){
	   mp=new Mypanel_8();
	   this.add(mp);
	   this.addKeyListener(mp);
	   
	   this.setSize(400, 300);
	   this.setVisible(true);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class Mypanel_8 extends JPanel implements KeyListener{
	int x = 10,y=10;
	public void paint(Graphics g){
		super.paint(g);
		g.fillOval(x, y, 20, 20);
	}

	@Override//键的一个值被输出
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override//键被压下
	public void keyPressed(KeyEvent e) {//根据需要重写
		// TODO Auto-generated method stub
		//System.out.println("键被按下"+e.getKeyChar());
		if(e.getKeyCode()==KeyEvent.VK_DOWN){//看看是按下“下”
			y+=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT){//看看是按下“下”
			x-=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){//看看是按下“下”
			x+=2;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP){//看看是按下“下”
			y-=2;
		}
		//调用repaint函数,进行重画
		repaint();
	}

	@Override//键被释放
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
