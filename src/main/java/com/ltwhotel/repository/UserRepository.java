package com.ltwhotel.repository;

import com.ltwhotel.entity.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	Optional<User> findByUsernameAndPassword(String username,String password);
}