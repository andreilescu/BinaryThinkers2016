package com.binary.thinkers.hash.code.model;

import java.awt.Point;
import java.util.Map;

public class Drone {
	
	private Integer maxTurns;
	
	private Integer maxPayload;
	
	private Point coordinate;
	
	private Map<Integer, Integer> products;

	public Integer getMaxTurns() {
		return maxTurns;
	}

	public void setMaxTurns(Integer maxTurns) {
		this.maxTurns = maxTurns;
	}

	public Integer getMaxPayload() {
		return maxPayload;
	}

	public void setMaxPayload(Integer maxPayload) {
		this.maxPayload = maxPayload;
	}

	public Point getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Point coordinate) {
		this.coordinate = coordinate;
	}

	public Map<Integer, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, Integer> products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coordinate == null) ? 0 : coordinate.hashCode());
		result = prime * result + ((maxPayload == null) ? 0 : maxPayload.hashCode());
		result = prime * result + ((maxTurns == null) ? 0 : maxTurns.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Drone other = (Drone) obj;
		if (coordinate == null) {
			if (other.coordinate != null)
				return false;
		} else if (!coordinate.equals(other.coordinate))
			return false;
		if (maxPayload == null) {
			if (other.maxPayload != null)
				return false;
		} else if (!maxPayload.equals(other.maxPayload))
			return false;
		if (maxTurns == null) {
			if (other.maxTurns != null)
				return false;
		} else if (!maxTurns.equals(other.maxTurns))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Drone [maxTurns=" + maxTurns + ", maxPayload=" + maxPayload + ", coordinate=" + coordinate
				+ ", products=" + products + "]";
	}

}
