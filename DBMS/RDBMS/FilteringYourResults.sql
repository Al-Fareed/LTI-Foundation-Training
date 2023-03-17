--                      FILTERING YOUR RESULTS
-- Refer Electricity DB
-- 1. Write a query to display the details of the building whose owner_name is 'Nicholas'.
SELECT * FROM building 
WHERE owner_name='Nicholas';

-- 2. Write a query to display the details of all the bills whose 'total_units' greater than 10000, sorted by total_units in descending order.
SELECT * FROM bill
WHERE total_units>10000
ORDER BY total_units DESC;

-- 3. Write a query to display the details of all the bills with the due_date on '2017-10-01', sorted by payable_amount in descending order.
SELECT * FROM bill
WHERE due_date='2017-10-01'
ORDER BY payable_amount DESC;

-- 4. Write a query to display all the details of all the bills whose payment_date is on the year 2018, sorted by payable_amount in descending order.
SELECT * FROM bill
WHERE payment_date LIKE"2018%"
ORDER BY payable_amount  DESC;

-- 5, Write a query to display the owner_name, address and contact_number of the buildings which does not have an email_address, sorted by owner_name in ascending order.
SELECT owner_name, address, contact_number FROM building
WHERE email_address  IS NULL
ORDER BY owner_name  ;

-- 6. Write a query to display the entire details of the building whose owner_name starts with the letter 'M', sorted by owner_name in ascending order.
SELECT *FROM building
WHERE owner_name LIKE 'M%'
ORDER BY owner_name  ;

-- 7. Write a query to display the entire details of the building whose building_type_id is 2, sorted by owner_name in ascending order.
SELECT *FROM building
WHERE building_type_id =2
ORDER BY owner_name  ;

-- 8.Write a query to display the details of the electricity_reading whose total_units per day is between 500 and 1000, sorted by total_units in ascending order.
select * from electricity_reading 
where total_units between 500 and 1000 
order by total_units;

-- 9. Write a query to display the details of the bill whose payment is not completed, sorted by due_date in ascending order.
SELECT * FROM bill 
WHERE is_payed=0
ORDER BY due_date ;

-- 10. Write a query to display the meter_id and total_units of electricity_reading whose 13th hour reading is lesser than the 14th hour reading, sorted by total_units in descending order.
SELECT meter_id , total_units 
FROM electricity_reading
WHERE h13<h14
ORDER BY total_units DESC;

-- 11. Write a query to display the details of the meter whose meter_number starts with 'S' and ends with '6'.
SELECT * FROM meter 
WHERE meter_number LIKE 'S%6';

-- 12.Write a query to display the name of all building types that ends with letter 'L'.Display the record in ascending order based on building type name.
SELECT name FROM building_type
WHERE name LIKE '%L'
ORDER BY name;

-- 13. Write a query to display all the details of the buildings whose owner name contains 'di' in it. Display the records sorted in ascending order based on the owner name of the building.
SELECT * 
FROM building
WHERE owner_name LIKE '%di%'
ORDER BY owner_name;

-- 14. Write a query to display all the details of bills whose payment date is on 2nd of the month and also display the record in  descending order based on the total units.
SELECT * 
FROM bill
WHERE payment_date LIKE"%02"
ORDER BY total_units DESC;

-- 15. Write a query to display the due date and  payable amount  of all the payment dates that are all not fall in between '2017-09-10' to '2017-10-10'.
SELECT  due_date ,  payable_amount
FROM bill
WHERE payment_date NOT  BETWEEN '2017-09-10'  AND '2017-10-10';

-- 16. Write a query to display the due_date ,payment_date,difference between the due date and the payment date of the bill in days and amount paid, whose payment  date is not exceeding the  due date.Give an alias name for difference between the due date and the payment date as 'date_difference'.
SELECT due_date ,payment_date,  DATEDIFF(due_date,payment_date) AS date_difference,payable_amount
FROM bill
WHERE DATEDIFF(payment_date,due_date)<=0;