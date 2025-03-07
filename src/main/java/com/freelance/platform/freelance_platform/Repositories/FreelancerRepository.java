package com.freelance.platform.freelance_platform.Repositories;

import com.freelance.platform.freelance_platform.Models.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer,Long> {
}
