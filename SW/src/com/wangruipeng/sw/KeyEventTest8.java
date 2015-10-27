
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

	@Override//����һ��ֵ�����
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override//����ѹ��
	public void keyPressed(KeyEvent e) {//������Ҫ��д
		// TODO Auto-generated method stub
		//System.out.println("��������"+e.getKeyChar());
		if(e.getKeyCode()==KeyEvent.VK_DOWN){//�����ǰ��¡��¡�
			y+=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT){//�����ǰ��¡��¡�
			x-=10;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){//�����ǰ��¡��¡�
			x+=2;
		}
		if(e.getKeyCode()==KeyEvent.VK_UP){//�����ǰ��¡��¡�
			y-=2;
		}
		//����repaint����,�����ػ�
		repaint();
	}

	@Override//�����ͷ�
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
