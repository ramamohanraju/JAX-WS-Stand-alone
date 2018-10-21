package com.ram.jaxws.vihaan.server;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ram.jaxws.vihaan.server.Vihaan")
public class VihaanImpl implements Vihaan {

	@Override
	public String getOwnerName(String vehicleNumber) {
		return vehicleNumber + ": Ram";
	}
}
