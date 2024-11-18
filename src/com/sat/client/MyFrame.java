package com.sat.client;

import java.awt.Container;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.sat.inte.IFaceFileOpsMath;

public class MyFrame extends JFrame {
	
	public MyFrame() throws IOException {
		Container cont=this.getContentPane();
		Vector<String> vec=new Vector<>();
		URL url=new URL("http://localhost:3343/ws/wrt?wsdl");
		QName qname=new QName("http://impl.sat.com/","IFaceFileOpsMathImplService");
		Service serv=Service.create(url,qname);
		IFaceFileOpsMath pro=serv.getPort(IFaceFileOpsMath.class);
		String strs=pro.readFi();
		String[] arr=strs.split(";");
		for(int i=0;i<arr.length;i++) {
			vec.add(arr[i]);
		}
		JComboBox box=new JComboBox(vec);
		cont.add(box);
	}
}
