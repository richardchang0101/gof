package com.pattern;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class XMLUtil {

    public static Object getBean(String args) throws ParserConfigurationException {
        try{
            //创建DOM文档对象
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            Document doc;
            doc= builder.parse(new File("src\\main\\resources\\config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = null;
            String className = null;
            //获取第一个包含雷鸣的节点 扩充抽象类
            if (args.equals("image")){
                classNode = nl.item(0).getFirstChild();
            }else if (args.equals("os")){
                classNode = nl.item(1).getFirstChild();
            }

            className = classNode.getNodeValue();
            //通过类名生成实例对象并返回
            Class c =Class.forName(className);
            Object o = c.newInstance();
            return o;

        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
