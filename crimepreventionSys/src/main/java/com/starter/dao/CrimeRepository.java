package com.starter.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starter.Entities.CrimeReport;

@Repository
public interface CrimeRepository extends JpaRepository<CrimeReport, Long> {
    List<CrimeReport> findAllByOrderByReportedAtDesc();
}
