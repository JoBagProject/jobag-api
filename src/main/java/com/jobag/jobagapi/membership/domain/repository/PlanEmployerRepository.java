package com.jobag.jobagapi.membership.domain.repository;

import com.jobag.jobagapi.membership.domain.model.PlanEmployer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlanEmployerRepository extends JpaRepository<PlanEmployer, Long> {
    Page<PlanEmployer> findByEmployeerId(Long employeerId, Pageable pageable);

    public Optional<PlanEmployer> findByIdAndEmployeerId(Long id, Long employeerId);
}
