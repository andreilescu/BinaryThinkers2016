package com.binary.thinkers.hash.code.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
			Map<Integer, Integer> orders = drone.getProducts();
			
			Integer productId = product.getId();
			if(orders.isEmpty()) {
				orders = new HashMap<Integer, Integer>();
				orders.put(productId, 1);
				
			} else {
				Integer count = orders.get(productId);
				count++;
				orders.put(productId, count);
			}
		}
	}

	public Warehouse getClosestWarehouse(Drone drone, List<Warehouse> warehouses) {
		
		int auxDistance;
		Warehouse minWarehouse = warehouses.get(0);
		int minDistance = (int)Math.sqrt(Math.pow(Math.abs(drone.getCoordinate().x - drone.getCoordinate().y), 2) + Math.pow(Math.abs(warehouses.get(0).getCoordinates().x - warehouses.get(0).getCoordinates().y), 2));
		for (int i=1;i<warehouses.size();i++) {
			
			auxDistance = (int)Math.sqrt(Math.pow(Math.abs(drone.getCoordinate().x - drone.getCoordinate().y), 2) + Math.pow(Math.abs(warehouses.get(i).getCoordinates().x - warehouses.get(i).getCoordinates().y), 2));
			if (auxDistance < minDistance) {
				
				auxDistance = minDistance;
				minWarehouse = warehouses.get(i);
			}
		}
		
		return minWarehouse;
	}

}
