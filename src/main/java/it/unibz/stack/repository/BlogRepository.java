package it.unibz.stack.repository;

import it.unibz.stack.entity.Blog;
import it.unibz.stack.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

	List<Blog> findByUser(User user);
}
