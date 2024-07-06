package com.exemple.foodiecli.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.exemple.foodiecli.model.Customer;

public class CsvReader {

		//Read the data from CSV files and create a list of objects
	
	public List<Customer> readCustomerCSV(){
		
		String CustomerCSVFile ="C:\\Users\\Lenovo\\Documents\\sts\\food-cli-app-java\\data\\customers.csv";
		List<Customer> CustomerList = new ArrayList<>();
		// java io classes (FileReader,  BufferReader)
		// try-with-resource
		String Line;
		try(BufferedReader br = new BufferedReader(new FileReader(CustomerCSVFile))){
			String CsvSplit = ",";
			br.readLine();
			while((Line = br.readLine()) != null) {
				String[] data = Line.split(CsvSplit);
				Customer customer = new Customer();
				customer.setId(data[0]);
				customer.setName(data[1]);
				customer.setEmail(data[2]);
				customer.setPassword(data[3]);
				
				CustomerList.add(customer);
			}
			
			
			
		}catch (IOException e) {
			System.out.println("File not found in the path " +CustomerCSVFile);
			System.exit(0);
			e.printStackTrace();
		}
		
		return CustomerList;
		
	}
}
