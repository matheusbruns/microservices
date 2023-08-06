package com.dev.hrworker.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.hrworker.entities.WorkerModel;
import com.dev.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

	@Autowired
	WorkerRepository workerRepository;

	@GetMapping
	public ResponseEntity<List<WorkerModel>> getAll() {
		List<WorkerModel> list = this.workerRepository.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/find-by-id")
	public ResponseEntity<Optional<WorkerModel>> getById(@RequestParam("workerId") Long workerId) {
		Optional<WorkerModel> worker = this.workerRepository.findById(workerId);
		return ResponseEntity.ok(worker);
	}

}
