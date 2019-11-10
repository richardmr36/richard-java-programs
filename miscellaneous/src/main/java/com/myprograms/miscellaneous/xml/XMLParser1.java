package com.myprograms.miscellaneous.xml;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XMLParser1 {
    public void parse(String xml) throws Exception {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        InputSource inputSource = new InputSource();
        inputSource.setCharacterStream(new StringReader(xml));

        Document document = documentBuilder.parse(inputSource);
        NodeList root = document.getChildNodes();
        Node node = getNode("ECIDRA-INP", root);
    }

    private Node getNode(final String tagName, final NodeList nodes) {
        for (int x = 0; x < nodes.getLength(); x++) {
            Node node = nodes.item(x);
            if (node.getNodeName().equalsIgnoreCase(tagName)) {
                return node;
            }
        }

        return null;
    }

    public static void main(String[] args) throws Exception {
        String xml = "<REQUEST WSTOKEN=\"lIe58ELkClUe\" SERVICENAME=\"WTX_SERV_ECIDRA\">\n" +
                "\t<ECIDRA-INP>\n" +
                "\t\t<SVCHEADER>\n" +
                "\t\t\t<SVCVERSION>0</SVCVERSION>\n" +
                "\t\t\t<TRANSID>T1811209011889</TRANSID>\n" +
                "\t\t\t<USERID>300</USERID>\n" +
                "\t\t\t<STATION>ATL</STATION>\n" +
                "\t\t\t<AGENT>300</AGENT>\n" +
                "\t\t</SVCHEADER>\n" +
                "\t\t<DRA-INP>\n" +
                "\t\t\t<OPTION>\n" +
                "\t\t\t\t<ORIGIN>\n" +
                "\t\t\t\t\t<STATION>TRI</STATION>\n" +
                "\t\t\t\t</ORIGIN>\n" +
                "\t\t\t\t<DEST>\n" +
                "\t\t\t\t\t<STATION>ATL</STATION>\n" +
                "\t\t\t\t</DEST>\n" +
                "\t\t\t\t<DATE>23NOV18</DATE>\n" +
                "\t\t\t\t<WUNI>LB</WUNI>\n" +
                "\t\t\t</OPTION>\n" +
                "\t\t\t<SPACE>\n" +
                "\t\t\t\t<WGT>10</WGT>\n" +
                "\t\t\t</SPACE>\n" +
                "\t\t</DRA-INP>\n" +
                "\t</ECIDRA-INP>\n" +
                "</REQUEST>\n";
        new XMLParser1().parse(xml);
    }
}
