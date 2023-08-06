package com.dev.hrpayroll.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.hrpayroll.entities.PaymentModel;
import com.dev.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@GetMapping
	public ResponseEntity<PaymentModel> getPayment(@RequestParam("workerId") Long workerId,
			@RequestParam("days") Integer days) {
		PaymentModel paymentModel = paymentService.getPayment(workerId, days);
		return ResponseEntity.ok(paymentModel);
	}

}
