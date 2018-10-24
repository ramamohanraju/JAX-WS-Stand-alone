package com.ram.jaxws.vihaan.client;

import java.net.MalformedURLException;

import com.ram.jaxws.vihaan.client.generated.Vihaan;
import com.ram.jaxws.vihaan.client.generated.VihaanImplService;

public class VihaanClient {
	public static void main(String[] args) throws MalformedURLException {
		String response = new VihaanClient().sendRequest("TS07ZZ0001");
		System.out.println(response);
	}

	public String sendRequest(String vehicleNumber) throws MalformedURLException {
		// URL of the WSDL hosted
		VihaanImplService serviceImpl = new VihaanImplService();

		// For custom endpoint.
//		VihaanImplService serviceImpl = new VihaanImplService(new URL("http://localhost:9091/Vihaan?wsdl"));

		Vihaan service = serviceImpl.getVihaanImplPort();
		return service.getOwnerName(vehicleNumber);
	}

}
