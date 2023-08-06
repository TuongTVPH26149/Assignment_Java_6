package poly.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.store.entity.OrderDetail;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Long> {

}
