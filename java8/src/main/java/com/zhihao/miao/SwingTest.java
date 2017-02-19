package com.zhihao.miao;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("my frame");
		JButton jbutton = new JButton("my button");
		
		/*
		jbutton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.out.println("button pressed!");
			}
		});
		*/
		
		jbutton.addActionListener((ActionEvent event) -> {
			System.out.println("button pressed");
			System.out.println("hello world");
		});
		
		jframe.add(jbutton);
		jframe.pack(); //自动适配大小
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
