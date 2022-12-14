package com.jobag.jobagapi.security.domain.repository;

import com.jobag.jobagapi.security.domain.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByEmail(String email);

    Boolean existsByNumber(Long number);

}
