package com.prokop.protobuffer.test.task.util;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public final class XmlUtility {
    private static final Logger LOGGER = Logger.getLogger(XmlUtility.class.getName());

    private XmlUtility() {
    }

    public static Document readXmlFromFile(String filePath) {
        File fXmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        Document xmlDocument = null;

        try {
            dBuilder = dbFactory.newDocumentBuilder();
            xmlDocument = dBuilder.parse(fXmlFile);
            xmlDocument.getDocumentElement().normalize();
        } catch (ParserConfigurationException e) {
            LOGGER.severe("XML parser configuration error: " + e.toString());
        } catch (SAXException e) {
            LOGGER.severe("General SAX error: " + e.toString());
        } catch (IOException e) {
            LOGGER.severe("Input/Output error: " + e.toString());
        }




        return xmlDocument;
    }
}
