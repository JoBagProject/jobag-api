package com.jobag.jobagapi.enterprise.domain.repository;

import com.jobag.jobagapi.enterprise.domain.model.Sector;
import com.jobag.jobagapi.security.domain.model.Employer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {
    public Page<Employer> findById(Long Id, Pageable page);
}
