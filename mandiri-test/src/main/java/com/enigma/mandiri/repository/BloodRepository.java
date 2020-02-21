package com.enigma.mandiri.repository;

import com.enigma.mandiri.model.Blood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodRepository extends JpaRepository<Blood, String> {
}
