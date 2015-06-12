package com.gree.gree_x.suport;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import com.gree.gree_x.puc.C;

public class HttpPostByXML {
	public void postXML(){
		HttpPostXML hpx = new HttpPostXML();
		System.out.println(hpx.getXmlInfo());
		byte[] xmlData = hpx.getXmlInfo().getBytes();
		DataInputStream input = null;
		java.io.ByteArrayOutputStream out = null;
		try{
		   //获得到位置服务的链接
			URL url = new URL(C.CREAT_WORKFLOW_API);
			URLConnection urlCon = url.openConnection();
			urlCon.setDoOutput(true);
			urlCon.setDoInput(true);
			urlCon.setUseCaches(false);
			//将xml数据发送到位置服务
			urlCon.setRequestProperty("Content-Type", "text/xml");
			urlCon.setRequestProperty("Content-length",String.valueOf(xmlData.length));
			DataOutputStream printout = new DataOutputStream(urlCon.getOutputStream());
			printout.write(xmlData);
			printout.flush();
			printout.close();
			input = new DataInputStream(urlCon.getInputStream());
	        byte[] rResult;
	        out = new java.io.ByteArrayOutputStream();
	        byte[] bufferByte = new byte[256];
	        int l = -1;
	        int downloadSize = 0;
	        while ((l = input.read(bufferByte)) > -1) {
	             downloadSize += l;
	             out.write(bufferByte, 0, l);
	             out.flush();
	         }
	         rResult = out.toByteArray();
	         DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	         DocumentBuilder db = dbf.newDocumentBuilder();
	         Document d = db.parse(new ByteArrayInputStream(rResult));
	         String respno = d.getElementsByTagName("respno").item(0).getFirstChild().getNodeValue();
	         System.out.println("respno:"+respno);
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 finally {
			 try {
				 out.close();
				 input.close();
			 }catch (Exception ex) {
				 ex.printStackTrace();
			 }
		 }
	}
	
	public static void main(String args[]){
		HttpPostByXML h = new HttpPostByXML();
		h.postXML();
	}
}