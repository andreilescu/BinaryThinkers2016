package com.binary.thinkers.hash.code.parser;

import java.util.List;

import com.binary.thinkers.hash.code.model.Drone;
import com.binary.thinkers.hash.code.model.Order;
import com.binary.thinkers.hash.code.model.Warehouse;

public interface FileParser {

	public List<Warehouse> convertFileToWarehouses(String fileName);
	
	public List<Drone> convertFileToDrones(String fileName);
	
	public List<Order> convertFileToOrders(String fileName);
	
	public Integer getRowNumber(String fileName);
	
	public Integer getColumnNumber(String fileName);
	
	public Integer getDroneNumber(String fileName);
	
	public Integer getTurnNumber(String fileName);
	
	public Integer getMaxPayload(String fileName);
	
	
}
