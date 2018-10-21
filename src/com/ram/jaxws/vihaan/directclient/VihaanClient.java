package com.ram.jaxws.vihaan.directclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.ram.jaxws.vihaan.server.Vihaan;

public class VihaanClient {
	public static void main(String[] args) throws MalformedURLException {
		String response = new VihaanClient().sendRequest("TS07ZZ0000");
		System.out.println(response);
	}

	private String sendRequest(String vehicleNumber) throws MalformedURLException {
		//URL of the WSDL hosted
		URL wsdlURL = new URL("http://localhost:9091/Vihaan?wsdl");
		
		//Target namespace and interface name
		QName qName = new QName("http://server.vihaan.jaxws.ram.com/", "VihaanImplService");
		
		Service service = Service.create(wsdlURL, qName);
		Vihaan vihaanServicePort = service.getPort(Vihaan.class);
		return vihaanServicePort.getOwnerName(vehicleNumber);
	}
	
	
}
