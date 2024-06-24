package com.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
public ProductDao() {
   System.out.println("ProductDao");
	
}

public void add() 
{
   System.out.println("Dao method");	
}
}
