package com.exam.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.exam.entities.Table7;

@Repository
public interface Table7Repository extends JpaRepository<Table7, Long> {
}
