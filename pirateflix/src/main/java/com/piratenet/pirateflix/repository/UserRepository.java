package com.piratenet.pirateflix.repository;

import com.piratenet.pirateflix.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{
    Optional<User> findByUserName(String username);

}
