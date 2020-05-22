package br.com.allesson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.allesson.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
