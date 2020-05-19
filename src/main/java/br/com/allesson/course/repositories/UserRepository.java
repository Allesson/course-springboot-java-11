package br.com.allesson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.allesson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
