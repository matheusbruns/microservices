package com.dev.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dev.hrpayroll.entities.PaymentModel;
import com.dev.hrpayroll.entities.WorkerModel;

@Service
public class PaymentService {

	@Value("${hr-worker.host}")
	private String workerHost;

	@Autowired
	RestTemplate restTemplate;

	public PaymentModel getPayment(Long workerId, Integer days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("workerId", workerId.toString());
		WorkerModel worker = restTemplate.getForObject(workerHost + "/workers/find-by-id?workerId={workerId}",
				WorkerModel.class, uriVariables);
		return new PaymentModel(worker.getName(), worker.getDailyIncome(), days);
	}

}
