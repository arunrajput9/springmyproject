/**
 * 
 */
package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.service.IProductService;
import com.nagarro.modal.Product;

/**
 * @author arunrajput
 *
 */

@RestController
@RequestMapping("api/v1")
public class ProductController {
	
	@Autowired  
	private IProductService productService;  

	@GetMapping("/products")  
	public List<Product> getProduct()   
	{  
		List<Product> products = productService.findAll();  
		return products;  
	}
	

}
