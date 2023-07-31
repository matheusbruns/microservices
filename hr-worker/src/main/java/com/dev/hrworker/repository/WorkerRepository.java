package com.dev.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.hrworker.Model.WorkerModel;

public interface WorkerRepository extends JpaRepository<WorkerModel, Long> {

}
