package poly.store.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import poly.store.entity.Order;
import poly.store.service.OrderService;
import poly.store.entity.OrderDetail;
import poly.store.repository.OrderRepository;
import poly.store.repository.OrderDetailDao;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	OrderDetailDao orderDetailRepository;

	@Override
	public Order create(JsonNode orderData) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		
		Order order = mapper.convertValue(orderData, Order.class);
		
		orderRepository.save(order);
		
		TypeReference<List<OrderDetail>> type = new TypeReference<List<OrderDetail>>() {};
		List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"), type)
				.stream().peek(d -> d.setOrder(order)).collect(Collectors.toList());
		
		orderDetailRepository.saveAll(details);
		return order;
	}

	@Override
	public Order findById(Integer id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).get();
	}

	@Override
	public List<Order> findByUsername(String username) {
		// TODO Auto-generated method stub
		return orderRepository.findByUsername(username);
	}
	
	
}
