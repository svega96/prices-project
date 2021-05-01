package com.technicaltest.prices.project.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Prices {
	
	private Integer brandId;
	
	private Date startDate;
	
	private Date endDate;
	
	private Integer priceList;
	
	private Integer productId;
	
	private Integer priority;
	
	private Double price;
	
	private String curr;

}
