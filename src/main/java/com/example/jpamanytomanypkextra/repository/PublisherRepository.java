package com.example.jpamanytomanypkextra.repository;

import com.example.jpamanytomanypkextra.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}
