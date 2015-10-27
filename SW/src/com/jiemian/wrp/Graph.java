package com.jiemian.wrp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JWindow;
import javax.swing.border.Border;

public class Graph extends JFrame{
	//一定注意这种用法
	/*******定义组件**************/
	JDesktopPane desktopPane;
	JInternalFrame inter1;//内部子窗口
	JPanel   jp1;
	JInternalFrame inter2;//内部子窗口
	JPanel   jp2;
	JMenuBar jmb;
	JMenu    menu1,menu2,menu3,menu4,menu5;
    public Graph() {
       //创建菜单
 	   jmb=new JMenuBar();
 	   menu1=new JMenu("File");
 	   menu1.setMnemonic(KeyEvent.VK_F);
 	   menu2=new JMenu("Tools");
 	   menu2.setMnemonic(KeyEvent.VK_T);
 	   menu3=new JMenu("Tests");
 	   menu3.setMnemonic(KeyEvent.VK_T);
 	   menu4=new JMenu("Views");
 	   menu4.setMnemonic(KeyEvent.VK_V);
 	   menu5=new JMenu("Help");
 	   menu5.setMnemonic(KeyEvent.VK_H);
 	   jmb.add(menu1);
 	   jmb.add(menu2);
 	   jmb.add(menu3);
 	   jmb.add(menu4);
 	   jmb.add(menu5);
 	   this.setJMenuBar(jmb);
       //创建组件
       Container contentPane = this.getContentPane();
       desktopPane = new JDesktopPane();
	   contentPane.add(desktopPane);
       inter1=new JInternalFrame("Control", true, false, true,true);//具体参数是ALT+/
       inter1.setSize(399, 400);
       inter1.setVisible(true);
       inter2=new JInternalFrame("Map", true, false, true,true);
       inter2.setSize(400, 400);
       inter2.setLocation(399, 0);
       inter2.setVisible(true);
       desktopPane.add(inter1);
       desktopPane.add(inter2);
       //Container1
       Container contentPane1=inter1.getContentPane();
       jp1=new JPanel();
       jp1.setBorder(BorderFactory.createTitledBorder("Algorithm"));
       contentPane1.add(jp1);
	  
	   //设置窗体
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setSize(800, 600);
	   this.setTitle("Graphcap界面模仿");
	   this.setVisible(true);
    }
    public static void main(String[] args) {
    	Graph g=new Graph();
	}
}
