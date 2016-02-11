package com.binary.thinkers.hash.code.service;

import com.binary.thinkers.hash.code.model.Drone;
import com.binary.thinkers.hash.code.model.Product;

public interface WarehouseService {

	public void loadProduct(Drone drone, Product product);
}
