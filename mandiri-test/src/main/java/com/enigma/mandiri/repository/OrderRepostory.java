package com.enigma.mandiri.repository;

import com.enigma.mandiri.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepostory extends JpaRepository<Order, String> {
}
