package com.binary.thinkers.hash.code.service.impl;

import java.util.List;

import com.binary.thinkers.hash.code.model.Drone;
import com.binary.thinkers.hash.code.model.Product;
import com.binary.thinkers.hash.code.model.Warehouse;
import com.binary.thinkers.hash.code.service.WarehouseService;

public class WarehouseServiceImpl implements WarehouseService {

	public void loadProduct(Drone drone, Product product) {

		// test if it is enought space on drone
		Integer maxPayload = drone.getMaxPayload();
		Integer weight = product.getWeight();

		if (maxPayload >= weight) {

			maxPayload -= weight;
		}
	}

	public Warehouse getClosestWarehouse(Drone drone, List<Warehouse> warehouses) {
		
		// iterate array
		
		return null;
	}

}
