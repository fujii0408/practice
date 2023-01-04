package jp.co.illmatics.apps.shopping.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.co.illmatics.apps.shopping.model.Category;

@Mapper
public interface CategoryMapper {
	public List<Category> findCategory();

	public List<Category> searchCategory(Category category);
	
	public Category findById(int id);
}
