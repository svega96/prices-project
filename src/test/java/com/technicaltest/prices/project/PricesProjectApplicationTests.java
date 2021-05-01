package com.technicaltest.prices.project;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.technicaltest.prices.project.business.PricesManager;
import com.technicaltest.prices.project.controller.dto.RequestDTO;
import com.technicaltest.prices.project.model.Prices;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class PricesProjectApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private PricesManager pricesManager;
	
	@Test
	public void test1() throws Exception {
		
		Integer brandId = 1;
		Integer productId = 35455;
		String dateString = "2020-06-14 10:00:00";
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
		
		RequestDTO request = new RequestDTO();
		request.setBrandId(brandId);
		request.setProductId(productId);
		request.setDate(date);
		
		Prices price1 = pricesManager.getPrice(request);
		
		ObjectMapper mapper = new ObjectMapper();
	    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String requestJson=ow.writeValueAsString(request);
		this.mockMvc.perform(post("/v1/prices/checkPrice").contentType(MediaType.APPLICATION_JSON_VALUE).content(requestJson)).andExpect(jsonPath("$.price", is (price1.getPrice())));
	}
	
	@Test
	public void test2() throws Exception {
		
		Integer brandId = 1;
		Integer productId = 35455;
		String dateString = "2020-06-14 16:00:00";
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
		
		RequestDTO request = new RequestDTO();
		request.setBrandId(brandId);
		request.setProductId(productId);
		request.setDate(date);
		
		Prices price1 = pricesManager.getPrice(request);
		
		ObjectMapper mapper = new ObjectMapper();
	    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String requestJson=ow.writeValueAsString(request);
		this.mockMvc.perform(post("/v1/prices/checkPrice").contentType(MediaType.APPLICATION_JSON_VALUE).content(requestJson)).andExpect(jsonPath("$.price", is (price1.getPrice())));
	}
	
	@Test
	public void test3() throws Exception {
		
		Integer brandId = 1;
		Integer productId = 35455;
		String dateString = "2020-06-14 21:00:00";
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
		
		RequestDTO request = new RequestDTO();
		request.setBrandId(brandId);
		request.setProductId(productId);
		request.setDate(date);
		
		Prices price1 = pricesManager.getPrice(request);
		
		ObjectMapper mapper = new ObjectMapper();
	    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String requestJson=ow.writeValueAsString(request);
		this.mockMvc.perform(post("/v1/prices/checkPrice").contentType(MediaType.APPLICATION_JSON_VALUE).content(requestJson)).andExpect(jsonPath("$.price", is (price1.getPrice())));
	}
	
	@Test
	public void test4() throws Exception {
		
		Integer brandId = 1;
		Integer productId = 35455;
		String dateString = "2020-06-15 10:00:00";
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
		
		RequestDTO request = new RequestDTO();
		request.setBrandId(brandId);
		request.setProductId(productId);
		request.setDate(date);
		
		Prices price1 = pricesManager.getPrice(request);
		
		ObjectMapper mapper = new ObjectMapper();
	    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String requestJson=ow.writeValueAsString(request);
		this.mockMvc.perform(post("/v1/prices/checkPrice").contentType(MediaType.APPLICATION_JSON_VALUE).content(requestJson)).andExpect(jsonPath("$.price", is (price1.getPrice())));
	}
	
	@Test
	public void test5() throws Exception {
		
		Integer brandId = 1;
		Integer productId = 35455;
		String dateString = "2020-06-16 21:00:00";
		Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
		
		RequestDTO request = new RequestDTO();
		request.setBrandId(brandId);
		request.setProductId(productId);
		request.setDate(date);
		
		Prices price1 = pricesManager.getPrice(request);
		
		ObjectMapper mapper = new ObjectMapper();
	    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
		ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
	    String requestJson=ow.writeValueAsString(request);
		this.mockMvc.perform(post("/v1/prices/checkPrice").contentType(MediaType.APPLICATION_JSON_VALUE).content(requestJson)).andExpect(jsonPath("$.price", is (price1.getPrice())));
	}

}
