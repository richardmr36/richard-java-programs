package com.myprograms.test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XMLParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        String xml = "<ECGMNT-OUT>\n" +
                "\t<TYPE>S</TYPE>\n" +
                "\t<SORT>A</SORT>\n" +
                "\t<CREATION>\n" +
                "\t\t<DATE>05JUL18</DATE>\n" +
                "\t\t<TIME>23:56</TIME>\n" +
                "\t</CREATION>\n" +
                "\t<SPL-MNT>\n" +
                "\t\t<COMMON-MNT>\n" +
                "\t\t\t<KEYINFO>\n" +
                "\t\t\t\t<DBKEY>154200051605</DBKEY>\n" +
                "\t\t\t\t<REVISION>4</REVISION>\n" +
                "\t\t\t</KEYINFO>\n" +
                "\t\t\t<RTYP>S</RTYP>\n" +
                "\t\t\t<RCOD>PIH</RCOD>\n" +
                "\t\t\t<TEXT>PET IN HOUSEHOLD</TEXT>\n" +
                "\t\t</COMMON-MNT>\n" +
                "\t\t<PRIORITY>5</PRIORITY>\n" +
                "\t\t<INDICATORS>\n" +
                "\t\t\t<FZE>N</FZE>\n" +
                "\t\t\t<COPY>Y</COPY>\n" +
                "\t\t\t<HOST>Y</HOST>\n" +
                "\t\t\t<GROUP>L</GROUP>\n" +
                "\t\t\t<QABLE>N</QABLE>\n" +
                "\t\t\t<DSSPL>N</DSSPL>\n" +
                "\t\t\t<HEA>N</HEA>\n" +
                "\t\t\t<COLOR>N</COLOR>\n" +
                "\t\t\t<LAST-MINUTE>N</LAST-MINUTE>\n" +
                "\t\t\t<REST-ON-FLT>N</REST-ON-FLT>\n" +
                "\t\t\t<PHARMA>N</PHARMA>\n" +
                "\t\t</INDICATORS>\n" +
                "\t\t<SUB-IATA>AVI</SUB-IATA>\n" +
                "\t</SPL-MNT>\n" +
                "\t<SPL-MNT>\n" +
                "\t\t<COMMON-MNT>\n" +
                "\t\t\t<KEYINFO>\n" +
                "\t\t\t\t<DBKEY>154200051606</DBKEY>\n" +
                "\t\t\t\t<REVISION>1</REVISION>\n" +
                "\t\t\t</KEYINFO>\n" +
                "\t\t\t<RTYP>S</RTYP>\n" +
                "\t\t\t<RCOD>RBI</RCOD>\n" +
                "\t\t\t<TEXT>FULLY REGULATED LITHIUM ION BATTERIES (UN 3480)</TEXT>\n" +
                "\t\t</COMMON-MNT>\n" +
                "\t\t<PRIORITY>99</PRIORITY>\n" +
                "\t\t<INDICATORS>\n" +
                "\t\t\t<FZE>N</FZE>\n" +
                "\t\t\t<COPY>Y</COPY>\n" +
                "\t\t\t<HOST>N</HOST>\n" +
                "\t\t\t<QABLE>N</QABLE>\n" +
                "\t\t\t<DSSPL>N</DSSPL>\n" +
                "\t\t\t<HEA>N</HEA>\n" +
                "\t\t\t<COLOR>N</COLOR>\n" +
                "\t\t\t<LAST-MINUTE>N</LAST-MINUTE>\n" +
                "\t\t\t<REST-ON-FLT>N</REST-ON-FLT>\n" +
                "\t\t\t<PHARMA>N</PHARMA>\n" +
                "\t\t</INDICATORS>\n" +
                "\t</SPL-MNT>\n" +
                "\t<SPL-MNT>\n" +
                "\t\t<COMMON-MNT>\n" +
                "\t\t\t<KEYINFO>\n" +
                "\t\t\t\t<DBKEY>154200015611</DBKEY>\n" +
                "\t\t\t\t<REVISION>1</REVISION>\n" +
                "\t\t\t</KEYINFO>\n" +
                "\t\t\t<RTYP>S</RTYP>\n" +
                "\t\t\t<RCOD>RBM</RCOD>\n" +
                "\t\t\t<TEXT>FULLY REGULATED LITHIUM METAL BATTERIES (UN 3090)</TEXT>\n" +
                "\t\t</COMMON-MNT>\n" +
                "\t\t<PRIORITY>99</PRIORITY>\n" +
                "\t\t<INDICATORS>\n" +
                "\t\t\t<FZE>N</FZE>\n" +
                "\t\t\t<COPY>Y</COPY>\n" +
                "\t\t\t<HOST>N</HOST>\n" +
                "\t\t\t<QABLE>N</QABLE>\n" +
                "\t\t\t<DSSPL>N</DSSPL>\n" +
                "\t\t\t<HEA>N</HEA>\n" +
                "\t\t\t<COLOR>N</COLOR>\n" +
                "\t\t\t<LAST-MINUTE>N</LAST-MINUTE>\n" +
                "\t\t\t<REST-ON-FLT>N</REST-ON-FLT>\n" +
                "\t\t\t<PHARMA>N</PHARMA>\n" +
                "\t\t</INDICATORS>\n" +
                "\t</SPL-MNT>\n" +
                "\t<SPL-MNT>\n" +
                "\t\t<COMMON-MNT>\n" +
                "\t\t\t<KEYINFO>\n" +
                "\t\t\t\t<DBKEY>154200003401</DBKEY>\n" +
                "\t\t\t\t<REVISION>1</REVISION>\n" +
                "\t\t\t</KEYINFO>\n" +
                "\t\t\t<RTYP>S</RTYP>\n" +
                "\t\t\t<RCOD>BAA</RCOD>\n" +
                "\t\t\t<TEXT>2-1684</TEXT>\n" +
                "\t\t</COMMON-MNT>\n" +
                "\t\t<PRIORITY>111</PRIORITY>\n" +
                "\t\t<INDICATORS>\n" +
                "\t\t\t<FZE>N</FZE>\n" +
                "\t\t\t<COPY>Y</COPY>\n" +
                "\t\t\t<HOST>N</HOST>\n" +
                "\t\t\t<GROUP>C</GROUP>\n" +
                "\t\t\t<QABLE>N</QABLE>\n" +
                "\t\t\t<DSSPL>N</DSSPL>\n" +
                "\t\t\t<HEA>N</HEA>\n" +
                "\t\t\t<COLOR>N</COLOR>\n" +
                "\t\t\t<LAST-MINUTE>N</LAST-MINUTE>\n" +
                "\t\t\t<REST-ON-FLT>N</REST-ON-FLT>\n" +
                "\t\t\t<PHARMA>N</PHARMA>\n" +
                "\t\t</INDICATORS>\n" +
                "\t</SPL-MNT>\t\n" +
                "</ECGMNT-OUT>";

        Document document = buildDocument(xml);
        String newXML = transformFromDocument(document);
        System.out.println(newXML);

        document = buildDocument(newXML);
        Document newDocument = getDocumentBuilder().newDocument();
        Element responseElement = newDocument.createElement("RESPONSE");
        responseElement.setAttribute("SERVICENAME", "TEST");
        newDocument.appendChild(responseElement);

        if (document != null) {
            Node node = newDocument.importNode(document.getDocumentElement(), true);
            responseElement.appendChild(node);
        }

        System.out.println(transformFromDocument(newDocument));
        System.out.println(System.getProperty("line.separator"));
    }

    public static DocumentBuilder getDocumentBuilder() throws ParserConfigurationException {
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        documentFactory.setNamespaceAware(true);
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        return documentBuilder;
    }

    public static Document buildDocument(String xml) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder documentBuilder = getDocumentBuilder();
        xml = escapeXml(xml);

        Reader reader = new StringReader(xml);
        InputSource inputSource = new InputSource(reader);
        inputSource.setEncoding("UTF-8");
        Document document = documentBuilder.parse(inputSource);

        return document;
    }

    public static String transformFromDocument(Document document) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(writer));
        return writer.getBuffer().toString();
    }

    public static String escapeXml(String s) {
        return s.replaceAll("line.separator", "")
                .replaceAll(">\\s*<", "><").replaceAll("&", "&amp;");
    }
}
