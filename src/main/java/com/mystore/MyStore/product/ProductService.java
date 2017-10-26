package com.mystore.MyStore.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts(int categoryId) {
		List<Product> products = new ArrayList<>();
		productRepository.findByCategoryId(categoryId).forEach(products::add); // lambda
		return products;
	}

	public Product getProduct(int id) {
		// lambda
		return productRepository.findOne(id);
	}

	public void addProduct(Product product) {
		productRepository.save(product);
	}

	public void updateProduct(Product product) {
		productRepository.save(product);
	}

	public void deleteProduct(int id) {
		productRepository.delete(id);
	}
}
