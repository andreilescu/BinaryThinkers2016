package com.binary.thinkers.hash.code.service;

import java.util.List;

import com.binary.thinkers.hash.code.model.Drone;
import com.binary.thinkers.hash.code.model.Product;
import com.binary.thinkers.hash.code.model.Warehouse;

public interface WarehouseService {

	public void loadProduct(Drone drone, Product product);
	
	public Warehouse getClosestWarehouse(Drone drone, List<Warehouse> warehouses);
	
}
