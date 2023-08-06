package poly.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import poly.store.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	@Query("SELECT o FROM Order o WHERE o.account.username = ?1")
	List<Order> findByUsername(String username);

}
