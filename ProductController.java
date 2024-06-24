package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.demo.bussiness.ProductBussiness;

@Controller
public class ProductController {
	@Autowired
	ProductBussiness pb;
	public ProductController() {
	    System.out.println("ProductController created");
	  
	}
	
	public void post() 
	{
		pb.save();
		System.out.println("Controller post()");
	}
	
}
