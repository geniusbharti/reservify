package com.main.BookMovieShow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.BookMovieShow.Entity.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
