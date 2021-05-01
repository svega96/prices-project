package com.technicaltest.prices.project.business;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technicaltest.prices.project.controller.dto.RequestDTO;
import com.technicaltest.prices.project.mapper.PricesMapper;
import com.technicaltest.prices.project.model.Prices;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PricesManager {
	
	@Autowired
	private PricesMapper pricesMapper;

	public Prices getPrice(RequestDTO requestedPrice) {
		
		log.info("Date {}, brandId: {}, productId: {}", requestedPrice.getDate(), requestedPrice.getBrandId(), requestedPrice.getProductId());
		//Recuperación de datos de BD
		List<Prices> pricesFromDb = pricesMapper.getPricesByDateAndBrandAndProduct(requestedPrice.getDate(), requestedPrice.getProductId(), requestedPrice.getBrandId());
		//Utilización de comparador para ordernar la lista por la prioridad del precio. Ordenación de menor a mayor.
		List<Prices> sortedPrices = pricesFromDb.stream().sorted((p1, p2) -> p1.getPriority().compareTo(p2.getPriority())).collect(Collectors.toList());
		log.info("Returned price: {}", sortedPrices.get(sortedPrices.size()-1).getPrice());
		//Se devuelve el último elemento de la lista(Mayor prioridad)
		return sortedPrices.get(sortedPrices.size()-1);
	}

}
