package com.technicaltest.prices.project.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.technicaltest.prices.project.model.Prices;

@Mapper
public interface PricesMapper {

	@Select("SELECT brand_id, start_date, end_date, price_list, product_id, priority, price, curr FROM prices WHERE start_date <= #{date} AND end_date >= #{date} AND product_id = #{productId} AND brand_id = #{brandId}")
	List<Prices> getPricesByDateAndBrandAndProduct(Date date, Integer productId, Integer brandId);

}
