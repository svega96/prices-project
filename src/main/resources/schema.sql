CREATE TABLE IF NOT EXISTS `prices` (
  `brand_id` bigint(20) NOT NULL,
  `start_date` datetime NOT NULL,
  `end_date` datetime NOT NULL,
  `price_list` bigint(20) NOT NULL,
  `product_id` bigint(20) NOT NULL,
  `priority` bigint(1) NOT NULL,
  `price` double NOT NULL,
  `curr` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;