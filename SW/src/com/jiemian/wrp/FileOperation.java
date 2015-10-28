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
	//定义组件
	Container container;
	JLabel    jlb;
	JTextArea jta;
	JButton   jb1,jb2;
	JPanel    jp;
	JFileChooser jFileChooser;
	public FileOperation(){
		//创建组件，并注册监听
		container=this.getContentPane();
		jlb=new JLabel("...",JLabel.CENTER);
		jta=new JTextArea();
		jta.setBorder(BorderFactory.createLineBorder(Color.blue));
		jb1=new JButton("打开");
		jb1.addActionListener(this);
		jb2=new JButton("保存");
		jb2.addActionListener(this);
		jp=new JPanel();
		jp.add(jb1);
		jp.add(jb2);
		//创建
		jFileChooser=new JFileChooser("D:/");
		//添加组件
		this.add(jlb,BorderLayout.NORTH);
		this.add(jta,BorderLayout.CENTER);
		this.add(jp,BorderLayout.SOUTH);
		//设置窗体
		this.setTitle("文件操作案例");
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
		if(e.getActionCommand().equals("打开")){
			//显示对话框
			result=jFileChooser.showOpenDialog(this);//在当前的框内显示对话框
			jFileChooser.setDialogTitle("打开文件对话框");
			jFileChooser.setApproveButtonText("确定");
			if(result==jFileChooser.APPROVE_OPTION){//注意这个表达
				file=jFileChooser.getSelectedFile();
				jlb.setText("你要打开的文件是："+file.getName());
			}else if(result==jFileChooser.CANCEL_OPTION){
				jlb.setText("您没有选择任何文件");
			}
			/***************真正打开文件*************************/
			if(file!=null){//读取的文件对象非空
				FileInputStream fis;
				try {
					fis=new FileInputStream(file);
				} catch (FileNotFoundException e1) {
					jlb.setText("File Not Found");
					return;
				}
				int readbyte;//读取文件的字节变量
				try {
					this.jta.setText("");
					while((readbyte=fis.read())!=-1){
						this.jta.append(String.valueOf((char)readbyte));//字节转为字符再转为字符串
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
			}else{//读取的文件对象为空
				return;
			}
		}else if(e.getActionCommand().equals("保存")){
			result=jFileChooser.showSaveDialog(this);//在当前的框内显示对话框
			jFileChooser.setDialogTitle("保存文件");
			jFileChooser.setApproveButtonText("确定");
			if(result==jFileChooser.APPROVE_OPTION){
				file=jFileChooser.getSelectedFile();//当未选择文件而是自己输入文件名时，系统会自动以此文件名建立
				jlb.setText("你要保存的文件名是："+file.getName());
			}else if(result==jFileChooser.CANCEL_OPTION){
				jlb.setText("你没有选择保存为文件！");
			}
			if(file!=null){
				FileOutputStream fos;
				try {
					fos=new FileOutputStream(file);
				} catch (FileNotFoundException e1) {
					jlb.setText("要保存的文件没找到");
					return;
				}
				String content=this.jta.getText();
				try {
					fos.write(content.getBytes());//拿到所有字符转为字节
				} catch (IOException e1) {
					jlb.setText("写入错误！");
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
