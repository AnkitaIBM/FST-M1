SELECT * FROM orders WHERE salesman_id IN(SELECT salesman_id FROM customers WHERE customer_id=3007);
SELECT * FROM orders WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');
SELECT grade,COUNT(*) FROM customers GROUP BY grade Having grade > (SELECT AVG(grade) FROM customers WHERE city='New York') ;
SELECT order_no,purchase_amount,order_date,salesman_id FROM orders WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE commission = (SELECT MAX(commission) FROM salesman) );
