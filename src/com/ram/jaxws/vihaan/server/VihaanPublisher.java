package com.ram.jaxws.vihaan.server;

import javax.xml.ws.Endpoint;

public class VihaanPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9091/Vihaan", new VihaanImpl());
		System.out.println("Service running..");
	}
}