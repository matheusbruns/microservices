package com.dev.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.dev.hrpayroll.entities.PaymentModel;

@Service
public class PaymentService {
	
	public PaymentModel getPayment(Long workerId, Integer days ) {
		return new PaymentModel("bob", 200.0, days);
	}

}
