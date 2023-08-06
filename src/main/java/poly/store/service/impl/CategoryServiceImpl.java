package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.entity.Category;
import poly.store.repository.CategoryRepository;
import poly.store.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
}
