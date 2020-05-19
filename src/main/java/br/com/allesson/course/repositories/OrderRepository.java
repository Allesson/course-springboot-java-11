package br.com.allesson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.allesson.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
