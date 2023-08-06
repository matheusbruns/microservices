package com.dev.hrpayroll.feignclients;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dev.hrpayroll.entities.WorkerModel;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

	@GetMapping(value = "/find-by-id")
	ResponseEntity<Optional<WorkerModel>> getById(@RequestParam("workerId") Long workerId);

}
