package com.gree.gree_x.suport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.gree.gree_x.puc.C;

public class HttpPostXML {
    void testPost(String urlStr) {  
        try {  
            URL url = new URL(urlStr);  
            URLConnection con = url.openConnection();  
            con.setDoOutput(true);  
            con.setRequestProperty("Pragma:", "no-cache");  
            con.setRequestProperty("Cache-Control", "no-cache");  
            con.setRequestProperty("Content-Type", "text/xml");  
  
            OutputStreamWriter out = new OutputStreamWriter(con  
                    .getOutputStream());      
            String xmlInfo = getXmlInfo();  
            out.write(new String(xmlInfo.getBytes("UTF-8")));  
            out.flush();  
            out.close();  
            BufferedReader br = new BufferedReader(new InputStreamReader(con  
                    .getInputStream()));  
            String line = "";  
            for (line = br.readLine(); line != null; line = br.readLine()) {  
                System.out.println(line);
            }
        } catch (MalformedURLException e) {  
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  
    String getXmlInfo() {  
        StringBuilder sb = new StringBuilder();
        /*文件开通固定格式*/
        sb.append("<?xml version='1.0' encoding='UTF-8' ?>");
        sb.append("<msc>");
        sb.append("	<respheader>");
        sb.append("		<enterpriseid></enterpriseid>");
        sb.append("		<serviceid> </serviceid>");
        sb.append("		<ver></ver>");
        sb.append("		<transactionid></transactionid>");
        sb.append("		<action>createRequest</action>");
        sb.append("		<resptime></resptime>");
        sb.append("		<respno></respno>");
        sb.append("		<respmsg></respmsg>");
        sb.append("	</respheader>");
        /*数据内容*/
        sb.append("	<data>");
        sb.append("		<userid>zhangyuntu</userid>");
        sb.append("		<workflowid>115</workflowid>");
        sb.append("		<requestname>D8001 ZZGREE大型全员改善提案系统</requestname>");
        sb.append("		<EsOnLineReg>");
        sb.append("			<RegCount>1</RegCount>");
        sb.append("			<RegInfo>");
        sb.append("				<tarxm>马晓鹏</tarxm>");
        sb.append("				<targh>002313</targh>");
        sb.append("				<xtdlr></xtdlr>");
        sb.append("				<tarszdw>10</tarszdw>");
        sb.append("				<tarlxfs>18937178969</tarlxfs>");
        sb.append("				<tarznsx>0</tarznsx>");
        sb.append("				<tamc>测试请驳回</tamc>");
        sb.append("				<gsqxzms>测试请驳回</gsqxzms>");
        sb.append("				<tafjzc></tafjzc>");
        sb.append("				<gsyj>测试请驳回</gsyj>");
        sb.append("				<gshyjxg>测试请驳回</gshyjxg>");
        sb.append("				<talx>0</talx>");
        sb.append("				<csyjxz></csyjxz>");
        sb.append("				<lsyjxz></lsyjxz>");
        sb.append("				<zplsdw></zplsdw>");
        sb.append("				<zpbdwlsr></zpbdwlsr>");
        sb.append("				<zsyjxz></zsyjxz>");
        sb.append("				<bcnyy></bcnyy>");
        sb.append("				<sjlsrxm></sjlsrxm>");
        sb.append("				<sjlsrgh></sjlsrgh>");
        sb.append("				<lsrlxfs></lsrlxfs>");
        sb.append("				<lsrjdyj></lsrjdyj>");
        sb.append("				<yjlssj></yjlssj>");
        sb.append("				<bklsyy></bklsyy>");
        sb.append("				<sjlssj></sjlssj>");
        sb.append("				<yxxyms></yxxyms>");
        sb.append("				<lsyjfj></lsyjfj>");
        sb.append("				<wxxyms></wxxyms>");
        sb.append("				<tgcxdms></tgcxdms>");
        sb.append("				<lsyxxxz></lsyxxxz>");
        sb.append("				<pdf1></pdf1>");
        sb.append("				<pdf2></pdf2>");
        sb.append("				<pdf3></pdf3>");
        sb.append("				<spyj1></spyj1>");
        sb.append("				<lsjy></lsjy>");
        sb.append("				<fyyj></fyyj>");
        sb.append("				<spyj2></spyj2>");
        sb.append("				<fujian>68889</fujian>");
        sb.append("				<wdwzp></wdwzp>");
        sb.append("				<fylsdwzzp></fylsdwzzp>");
        sb.append("				<lsrzzp9></lsrzzp9>");
        sb.append("				<dlrx>226</dlrx>");
        sb.append("				<SQRQ>2015-04-27</SQRQ>");
        sb.append("				<csyjbz></csyjbz>");
        sb.append("				<BANZU></BANZU>");
        sb.append("			</RegInfo>");
        sb.append("		</EsOnLineReg>");
        sb.append(" </data>");
        sb.append("</msc>");
        return sb.toString();  
    }  
  
    public static void main(String[] args) {  
        new HttpPostXML().testPost(C.CREAT_WORKFLOW_API);  
    }  
}
