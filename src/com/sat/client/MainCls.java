package com.sat.client;

import java.awt.FlowLayout;
import java.io.IOException;

public class MainCls {

	public static void main(String[] args) throws IOException {
		MyFrame frame=new MyFrame();
		frame.setDefaultCloseOperation(2);
		frame.setVisible(true);
		frame.setSize(700,700);
		frame.setLayout(new FlowLayout());

	}

}
