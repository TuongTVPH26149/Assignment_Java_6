package poly.store.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.store.entity.Product;
import poly.store.repository.ProductRepository;
import poly.store.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public List<Product> findByCategoryId(String cid) {
		// TODO Auto-generated method stub
		return productRepository.findByCategoryId(cid);
	}

	@Override
	public Product create(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}
}
