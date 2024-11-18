package com.sat.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.sat.inte.IFaceFileOpsMath;

public class TestClient {
	public static void main(String[] args) throws MalformedURLException {
		URL url=new URL("http://localhost:3343/ws/wrt?wsdl");
		QName qname=new QName("http://impl.sat.com/","IFaceFileOpsMathImplService");
		Service serv=Service.create(url,qname);
		IFaceFileOpsMath pro=serv.getPort(IFaceFileOpsMath.class);
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"What do you want to do today?\n Enter a for writing logs \n Enter b for writing sqrts \n Enter c for writing cust string");
		String ch = scan.nextLine();
		switch (ch) {
		case "a":
			pro.wrtLogs();
			break;
		case "b":
			pro.wrtSqrts();
			break;
		case "c":
			String cont="";
			String fname="";
			System.out.println("Enter content");
			cont=scan.nextLine();
			System.out.println("Enter filename");
			fname=scan.nextLine()+".txt";
			pro.wrtCustStr(cont, fname);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}
