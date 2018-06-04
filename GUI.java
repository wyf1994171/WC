package wc;

//package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class  GUI extends JFrame implements ActionListener{  
    JButton open=null;  
    public File file;
    public GUI(){  
        open=new JButton("打开");  
        this.add(open);  
        this.setBounds(1000, 500, 250, 250);  
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        open.addActionListener(this);  

    }  
    @Override  
    public void actionPerformed(ActionEvent e) {  
        // TODO Auto-generated method stub  
        JFileChooser jfc=new JFileChooser();  
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );  
        jfc.showDialog(new JLabel(), "选择");  
        file=jfc.getSelectedFile();  
        BasicCount fo=new BasicCount();
        try {
			fo.count(file.getName());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        System.out.println("文件:"+file.getName());
        System.out.println("字符数:"+fo.getCharacterNumber());
        System.out.println("单词数:"+fo.getWordNumber());
        System.out.println("行数:"+fo.getLineNumber());
        

    }  

}  
