package com.binary.thinkers.hash.code.parser.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.binary.thinkers.hash.code.model.Drone;
import com.binary.thinkers.hash.code.model.Order;
import com.binary.thinkers.hash.code.model.Warehouse;
import com.binary.thinkers.hash.code.parser.FileParser;

public class FileParserImpl implements FileParser{

	public List<Warehouse> convertFileToWarehouses(String fileName) {
		
		File file = new File(fileName);
		FileInputStream fis = null;
		BufferedReader bufferedReader = null;
		String line;
		try {
			fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			bufferedReader = new BufferedReader(isr);			
			System.out.println(bufferedReader.readLine());
			
			
			while ((line = bufferedReader.readLine()) != null) {
				
				// convert to char and display it
				System.out.print(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return null;
	}

	public List<Drone> convertFileToDrones(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Order> convertFileToOrders(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getRowNumber(String fileName) {
		File file = new File(fileName);
		FileInputStream fis = null;
		BufferedReader bufferedReader = null;
		String line;
		Integer row = 0;
		try {
			fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			bufferedReader = new BufferedReader(isr);			
			System.out.println(bufferedReader.readLine());
			
			
			while ((line = bufferedReader.readLine()) != null) {
				
				String arraylist[] = line.split(" ");
				row=Integer.parseInt(arraylist[0]);
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return row;
	}

	public Integer getColumnNumber(String fileName) {
		File file = new File(fileName);
		FileInputStream fis = null;
		BufferedReader bufferedReader = null;
		String line;
		try {
			fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			bufferedReader = new BufferedReader(isr);			
			System.out.println(bufferedReader.readLine());
			
			
			while ((line = bufferedReader.readLine()) != null) {
				
				// convert to char and display it
				System.out.print(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return null;
	}

	public Integer getDroneNumber(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getTurnNumber(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getMaxPayload(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

}
