package com.mystore.MyStore.category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategory() {
		List<Category> categories = new ArrayList<>();
		categoryRepository.findAll().forEach(categories::add); // lambda
		return categories;
	}

	public Category getCategory(int id) {
		// lambda
		return categoryRepository.findOne(id);
	}

	public void addCategory(Category category) {
		categoryRepository.save(category);
	}

	public void updateCategory(Category topic, int id) {
		categoryRepository.save(topic);
	}

	public void deleteCategory(int id) {
		categoryRepository.delete(id);
	}
}
