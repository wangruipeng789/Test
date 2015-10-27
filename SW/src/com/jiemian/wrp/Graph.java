package com.jiemian.wrp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JWindow;
import javax.swing.border.Border;

public class Graph extends JFrame{
	//һ��ע�������÷�
	/*******�������**************/
	JDesktopPane desktopPane;
	JInternalFrame inter1;//�ڲ��Ӵ���1
	JPanel   jp1;//��Ӧ��һ���Ӵ���
	JPanel   jp11,jp12,jp13;//������������
	JLabel   jl1,jl2,jl3,jl4,jl5,jl6;
	JCheckBox jcb1,jcb2;
	JButton   jb11,jb12,jb31,jb32,jb33;//��Ӧ���²��ֵİ�ť
	JComboBox jcbox1, jcbox2,jcbox3,jcbox4;
	JTextField jtf1,jtf2;
	JInternalFrame inter2;//�ڲ��Ӵ���2
	MapGraph  mg;
	JPanel   jp2;
	JMenuBar jmb;
	JMenu    menu1,menu2,menu3,menu4,menu5;
	JMenuItem  item1,item2,item3;
    public Graph() {
       //�����ұ����
    	mg=new MapGraph();
       //�����˵�
 	   jmb=new JMenuBar();
 	   menu1=new JMenu("File");
 	   menu1.setMnemonic(KeyEvent.VK_F);
 	   item1=new JMenuItem("��");
 	   item1.addActionListener(mg);
 	   item1.setActionCommand("��");//����ƥ��
 	   item2=new JMenuItem("����");
 	   item3=new JMenuItem("�ر�");
 	   item3.addActionListener(mg);
 	   item3.setActionCommand("�ر�");
 	   menu1.add(item1);
 	   menu1.add(item2);
 	   menu1.add(item3);
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
       //�������
       Container contentPane = this.getContentPane();
       desktopPane = new JDesktopPane();
	   contentPane.add(desktopPane);
       inter1=new JInternalFrame("Control", true, false, true,true);//���������ALT+/
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
       //����
       jp11=new JPanel();
       jb11=new JButton("Need a contiguity file");
       jb12=new JButton("Load conguity file");
       jb12.setForeground(Color.red);
       jp11.setLayout(new GridLayout());
       jp11.add(jb11);
       jp11.add(jb12);
       jp1.setLayout(new BorderLayout());
       jp1.add(jp11,BorderLayout.NORTH);
       //�м���
       jp12=new JPanel();
       jl1=new JLabel("Constained Clustering:");
       jl2=new JLabel("Flow Exception Model:");
       jl3=new JLabel("Optimization Measure:");
       jl4=new JLabel("Control Variable:");
       jl5=new JLabel("Control Threshold(incl):");
       jl6=new JLabel("Max # of regions:");
       jcb1=new JCheckBox("Tabu");
       jcb1.setSelected(true);
       jcb2=new JCheckBox("Hierarchical Exception");
       jcb2.setSelected(true);
       jcbox1=new JComboBox(new String[]{"���","�Һ�"});
       jcbox1.setMaximumRowCount(2);
       jcbox2=new JComboBox();
       jcbox3=new JComboBox();
       jcbox4=new JComboBox();
       jtf1=new JTextField("0");
       jtf2=new JTextField("10");
       jp12.setLayout(new GridLayout(7,2));
       jp12.add(jl1);
       jp12.add(jcbox1);
       jp12.add(jl2);
       jp12.add(jcbox2);
       jp12.add(jl3);
       jp12.add(jcbox3);
       jp12.add(jl4);
       jp12.add(jcbox4);
       jp12.add(jl5);
       jp12.add(jtf1);
       jp12.add(jl6);
       jp12.add(jtf2);
       jp12.add(jcb1);
       jp12.add(jcb2);
       jp1.add(jp12);
       //������
       jb31=new JButton("Run");
       jb31.setForeground(Color.red);
       jb32=new JButton("Save");
       jb33=new JButton("Load");
       jp13=new JPanel();
       jp13.setLayout(new GridLayout(1,3));
       jp13.add(jb31);
       jp13.add(jb32);
       jp13.add(jb33);
       jp1.add(jp13,BorderLayout.SOUTH);
       //
       inter2.getContentPane().add(mg);
       
	   //���ô���
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   this.setSize(800, 600);
	   this.setTitle("Graphcap����ģ��");
	   this.setVisible(true);
    }
    public static void main(String[] args) {
    	Graph g=new Graph();
	}
	
}
class MapGraph extends JPanel implements ActionListener{
	int x1=0,y1=0,x2=0,y2=0;
	//���������һ��Ҫ�е�,Ĭ�ϵ��ô˷���
	public void paint(Graphics g){
		super.paint(g);
		g.drawLine(x1, y1, x2, y2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("��")){
			this.x2=200;
			this.y2=200;
		}else if(e.getActionCommand().equals("�ر�")){
			this.x2=0;
			this.y2=0;
		}
		repaint();//���»���
	}
	
}
