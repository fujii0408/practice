package jp.co.illmatics.apps.shopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.illmatics.apps.shopping.model.Category;

@Service
public interface CategoryService {

	public List<Category> findCategory();
	
	public List<Category> searchCategory(Category category);
	
	public Category findById(int id);
}
