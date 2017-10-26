package com.mystore.MyStore.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mystore.MyStore.category.Category;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products/category/{categoryId}")
	public List<Product> getAllProducts(@PathVariable int categoryId) {
		return productService.getAllProducts(categoryId);
	}
	
	@GetMapping("/products/{id}/category/{categoryId}")
	public Product getProduct(@PathVariable int id) {
		return productService.getProduct(id);
	}
	
	@PostMapping("/products/category/{categoryId}")
	public void addProduct(@RequestBody Product product,@PathVariable int categoryId) {
		product.setCategory(new Category(categoryId,"",""));
		productService.addProduct(product);
	}
	
	@PutMapping("/products/{id}/category/{categoryId}")
	public void updateProduct(@RequestBody Product product, @PathVariable int categoryId, @PathVariable int id) {
		product.setCategory(new Category(categoryId,"",""));
		productService.updateProduct(product);
	}
	
	@DeleteMapping("/products/{id}/category/{categoryId}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
}
