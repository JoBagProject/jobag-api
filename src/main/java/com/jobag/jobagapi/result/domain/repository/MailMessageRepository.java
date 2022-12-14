package com.jobag.jobagapi.result.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobag.jobagapi.result.domain.model.MailMessage;

@Repository
public interface MailMessageRepository extends JpaRepository<MailMessage, Long> {
    public Page<MailMessage> findById(Long Id, Pageable pageable);

    Page<MailMessage> findByPostulantId(Long postulantId, Pageable pageable);

    Page<MailMessage> findByEmployeerId(Long employeerId, Pageable pageable);

    public Page<MailMessage> findByPostulantIdAndEmployeerId(Long postulantId, Long employeerId, Pageable pageable);
    // Boolean existsByPostulantId(Long postulantId);
    // Boolean existsByJobOfferId(Long jobOfferId);
}