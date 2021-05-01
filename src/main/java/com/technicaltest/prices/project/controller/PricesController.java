package com.technicaltest.prices.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technicaltest.prices.project.business.PricesManager;
import com.technicaltest.prices.project.controller.dto.RequestDTO;
import com.technicaltest.prices.project.model.Prices;

import io.swagger.annotations.ApiOperation;

@RestController
public class PricesController {
	
	@Autowired
	private PricesManager pricesManager;
	
	@ApiOperation(value = "Checks the price of a certain product in a certain date")
	@PostMapping(path = "/v1/prices/checkPrice")
	public ResponseEntity<Prices> checkPrice(@RequestBody RequestDTO requestedPrice) {
		
		Prices response = pricesManager.getPrice(requestedPrice);
		
		return ResponseEntity.ok(response);
		
		
	}

}
