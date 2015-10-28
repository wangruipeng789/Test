package com.jiemian.wrp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.sun.media.sound.FFT;

public class FileOperation extends JFrame implements ActionListener{
	//�������
	Container container;
	JLabel    jlb;
	JTextArea jta;
	JButton   jb1,jb2;
	JPanel    jp;
	JFileChooser jFileChooser;
	public FileOperation(){
		//�����������ע�����
		container=this.getContentPane();
		jlb=new JLabel("...",JLabel.CENTER);
		jta=new JTextArea();
		jta.setBorder(BorderFactory.createLineBorder(Color.blue));
		jb1=new JButton("��");
		jb1.addActionListener(this);
		jb2=new JButton("����");
		jb2.addActionListener(this);
		jp=new JPanel();
		jp.add(jb1);
		jp.add(jb2);
		//����
		jFileChooser=new JFileChooser("D:/");
		//������
		this.add(jlb,BorderLayout.NORTH);
		this.add(jta,BorderLayout.CENTER);
		this.add(jp,BorderLayout.SOUTH);
		//���ô���
		this.setTitle("�ļ���������");
		this.setLocation(0, 0);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
    public static void main(String[] args) {
    	FileOperation demo=new FileOperation();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		File file=null;
		int result;
		if(e.getActionCommand().equals("��")){
			//��ʾ�Ի���
			result=jFileChooser.showOpenDialog(this);//�ڵ�ǰ�Ŀ�����ʾ�Ի���
			jFileChooser.setDialogTitle("���ļ��Ի���");
			jFileChooser.setApproveButtonText("ȷ��");
			if(result==jFileChooser.APPROVE_OPTION){//ע��������
				file=jFileChooser.getSelectedFile();
				jlb.setText("��Ҫ�򿪵��ļ��ǣ�"+file.getName());
			}else if(result==jFileChooser.CANCEL_OPTION){
				jlb.setText("��û��ѡ���κ��ļ�");
			}
			/***************�������ļ�*************************/
			if(file!=null){//��ȡ���ļ�����ǿ�
				FileInputStream fis;
				try {
					fis=new FileInputStream(file);
				} catch (FileNotFoundException e1) {
					jlb.setText("File Not Found");
					return;
				}
				int readbyte;//��ȡ�ļ����ֽڱ���
				try {
					this.jta.setText("");
					while((readbyte=fis.read())!=-1){
						this.jta.append(String.valueOf((char)readbyte));//�ֽ�תΪ�ַ���תΪ�ַ���
						//System.out.println("OK");
					}
				} catch (IOException e1) {
					jlb.setText("File Read Error");
				}finally{
					
						try {
							if(fis!=null){
								fis.close();
							}
						} catch (IOException e1) {
							e1.printStackTrace();
					    }
				}
			}else{//��ȡ���ļ�����Ϊ��
				return;
			}
		}else if(e.getActionCommand().equals("����")){
			result=jFileChooser.showSaveDialog(this);//�ڵ�ǰ�Ŀ�����ʾ�Ի���
			jFileChooser.setDialogTitle("�����ļ�");
			jFileChooser.setApproveButtonText("ȷ��");
			if(result==jFileChooser.APPROVE_OPTION){
				file=jFileChooser.getSelectedFile();//��δѡ���ļ������Լ������ļ���ʱ��ϵͳ���Զ��Դ��ļ�������
				jlb.setText("��Ҫ������ļ����ǣ�"+file.getName());
			}else if(result==jFileChooser.CANCEL_OPTION){
				jlb.setText("��û��ѡ�񱣴�Ϊ�ļ���");
			}
			if(file!=null){
				FileOutputStream fos;
				try {
					fos=new FileOutputStream(file);
				} catch (FileNotFoundException e1) {
					jlb.setText("Ҫ������ļ�û�ҵ�");
					return;
				}
				String content=this.jta.getText();
				try {
					fos.write(content.getBytes());//�õ������ַ�תΪ�ֽ�
				} catch (IOException e1) {
					jlb.setText("д�����");
				}finally{
					try{
						if(fos!=null){
							fos.close();
						}
					}catch (Exception e1) {
					    e1.printStackTrace();
					}
				}
			}
			
		}else{
			//do nothing
		}
	}
} 
