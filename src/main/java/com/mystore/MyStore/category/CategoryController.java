package com.mystore.MyStore.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryservice;
	
	@GetMapping("/category")
	public List<Category> getAllCategory() {
		return categoryservice.getAllCategory();
	}
	
	@GetMapping("/category/{id}")
	public Category getCategory(@PathVariable int id) {
		return categoryservice.getCategory(id);
	}
	
	@PostMapping("/category")
	public void addCategory(@RequestBody Category topic) {
		categoryservice.addCategory(topic);
	}
	
	@PutMapping("/category/{id}")
	public void updateCategory(@RequestBody Category topic, @PathVariable int id) {
		categoryservice.updateCategory(topic,id);
	}
	
	@DeleteMapping("/category/{id}")
	public void deleteTopic(@PathVariable int id) {
		categoryservice.deleteCategory(id);
	}
}
