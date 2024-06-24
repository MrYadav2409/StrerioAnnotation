package com.demo.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;

@Service
public class ProductBussiness {
    @Autowired 
	ProductDao dao;
	public ProductBussiness() {
	   System.out.println("ProductBussiness created");
	}
	
	public void save() 
	{
		dao.add();
		System.out.println("Bussiness method save()");
	}
	
}
