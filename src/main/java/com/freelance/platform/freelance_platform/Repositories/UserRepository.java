package com.freelance.platform.freelance_platform.Repositories;

import com.freelance.platform.freelance_platform.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}