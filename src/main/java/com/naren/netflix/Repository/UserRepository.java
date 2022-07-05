package com.naren.netflix.Repository;

import com.naren.netflix.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}