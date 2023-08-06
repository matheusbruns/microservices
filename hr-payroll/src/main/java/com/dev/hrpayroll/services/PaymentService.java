package com.dev.hrpayroll.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.hrpayroll.entities.PaymentModel;
import com.dev.hrpayroll.entities.WorkerModel;
import com.dev.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workerFeignClient;

	public PaymentModel getPayment(Long workerId, Integer days) {
		Optional<WorkerModel> worker = this.workerFeignClient.getById(workerId).getBody();
		if(worker.isEmpty()) return null;
		
		return new PaymentModel(worker.get().getName(), worker.get().getDailyIncome(), days);
	}

}
