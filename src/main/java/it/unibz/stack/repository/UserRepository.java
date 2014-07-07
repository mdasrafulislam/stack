package it.unibz.stack.repository;

import it.unibz.stack.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByName(String name);


}
