# Write your MySQL query statement below
SELECT product_name,year,price
FROM product join sales
where product.product_id=sales.product_id;