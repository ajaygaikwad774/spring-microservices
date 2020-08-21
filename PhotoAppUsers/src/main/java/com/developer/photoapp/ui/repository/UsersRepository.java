package com.developer.photoapp.ui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.photoapp.ui.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
