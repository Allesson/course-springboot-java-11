package br.com.allesson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.allesson.course.entities.Category;

public interface CategoryRepository extends JpaRepository <Category, Long> {
	
}
