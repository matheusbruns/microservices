package com.dev.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.hrworker.entities.WorkerModel;

public interface WorkerRepository extends JpaRepository<WorkerModel, Long> {

}
