--SELECT COUNT(*) FROM film
--WHERE length > 
--(SELECT AVG(length) FROM film)

--SELECT COUNT(*) FROM film
--WHERE rental_rate =
--(SELECT MAX(rental_rate) FROM film);

--SELECT * FROM film
--WHERE rental_rate = 
--(SELECT MIN(rental_rate) FROM film)
--AND replacement_cost = 
--(SELECT MIN(replacement_cost) FROM film);

--SELECT first_name,last_name FROM customer
--INNER JOIN payment ON customer.customer_id = ANY (
--SELECT customer_id FROM payment
--GROUP BY customer_id 
--ORDER BY COUNT(customer_id) DESC
--LIMIT 5)
--LIMIT 5