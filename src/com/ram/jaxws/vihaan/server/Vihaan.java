package com.ram.jaxws.vihaan.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Vihaan {
	@WebMethod String getOwnerName(String vehicleNumber);
}
