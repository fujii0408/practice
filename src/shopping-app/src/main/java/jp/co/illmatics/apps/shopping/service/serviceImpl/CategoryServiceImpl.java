package jp.co.illmatics.apps.shopping.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jp.co.illmatics.apps.shopping.model.Category;
import jp.co.illmatics.apps.shopping.repository.CategoryMapper;
import jp.co.illmatics.apps.shopping.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> findCategory() {
		return categoryMapper.findCategory();
	}

	@Override
	public List<Category> searchCategory(Category category) {
		return categoryMapper.searchCategory(category);
	}

	@Override
	public Category findById(int id) {
		return categoryMapper.findById(id);
	}

}
