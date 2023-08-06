package com.dev.hrpayroll.entities;

import lombok.Data;

@Data
public class PaymentModel {

	private String name;
	private Double dailyIncome;
	private Integer days;

	public Double getTotal() {
		return days * dailyIncome;
	}

	public PaymentModel(String name, Double dailyIncome, Integer days) {
		this.name = name;
		this.dailyIncome = dailyIncome;
		this.days = days;
	}

}
