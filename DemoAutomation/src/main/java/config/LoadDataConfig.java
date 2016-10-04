package config;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import common.Constant;

public class LoadDataConfig {
	public LoadDataConfig(String instance) {
		try {

			File fXmlFile = new File(Constant.PathConfig.AUTOMATION_CONFIG_XML);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("instance");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				Element eElement = (Element) nNode;
				if (eElement.getAttribute("tag").equals(instance)) {
					url = eElement.getElementsByTagName("url").item(0).getTextContent();
					browser = eElement.getElementsByTagName("browser").item(0).getTextContent();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getURL() {
		return url;
	}

	public String getBROWSER() {
		return browser;
	}

	private String url = "";
	private String browser = "";

}
