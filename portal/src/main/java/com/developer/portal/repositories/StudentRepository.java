package com.developer.portal.repositories;

import com.developer.portal.entities.AdmissionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<AdmissionLog,Integer> {
}
