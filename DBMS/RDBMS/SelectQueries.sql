--              SELECT QUERIES
-- Refer Electricity DB

--1. Write a query to display the entire contents of the 'electricity_connection_type'.Display the records in ascending order based on their connection name.
SELECT  * FROM electricity_connection_type
ORDER BY connection_name;

-- 2. Write a query to display the entire contents of the building_type table, sorted by name in ascending order.
SELECT * FROM building_type ORDER BY name;

-- 3. Write a query to display the entire contents of the 'building'.Display the records in ascending order based on owner name.
SELECT * FROM building ORDER BY owner_name;

-- 4.Write a query to display the entire contents of the  'electricity_reading', Display the records in descending order based on 'total_units'.
SELECT * FROM electricity_reading ORDER BY total_units DESC;

--5. Write a query to display all 'meter_number' from meter table.
SELECT meter_number FROM meter;

-- 6. Write a query to display the owner_name and contact_number of all building, Display the records in ascending order based on owner_name.
SELECT owner_name ,contact_number  FROM building ORDER BY owner_name;

--7. Write a query to display the entire contents of the slab table, sorted by from_unit in ascending order.
SELECT * FROM slab ORDER BY from_unit ;

-- 8. Write a query to display the entire details of the building whose building_type_id is 2, sorted by owner_name in ascending order.
SELECT * FROM building 
WHERE building_type_id =2
ORDER BY owner_name ;

--9. Write a query to display the owner name and the length of the owner's name of the buildings.Display the records in ascending order based on owner name. Give an alias as name_length to the length of the owner names.
-- Use the inbuilt function length().
SELECT owner_name,length(owner_name) AS  name_length FROM building
ORDER BY owner_name ;

-- 10. Write a query to display all the owner_name and the concatenated contact_number and email  with hyphen(-) separated . Display the records in descending order based on owner_name .Give an alias name as contact_details.
select owner_name, concat(contact_number ,'-',email_address)as contact_details from building 
order by owner_name desc ;

-- 11. Write a query to display the first 3 characters of every meter_number.Give an alias name for the meter number as 'meter_code'.Display the records sorted by meter_code in descending order.
-- Use the inbuilt function substr().
SELECT SUBSTRING(meter_number,1,3) AS meter_code FROM meter
ORDER BY meter_code DESC;

-- 12. Write a query to display the first 3 characters of the owner names and the contact number of all buildings in ascending order based on the owner name of the building. Give an alias to the first 3 characters as 'name_code'.
-- Use the inbuilt function left().
SELECT LEFT(owner_name,3)AS name_code, contact_number  FROM building
ORDER BY owner_name;

-- 13. Write a query to display the name of all building types that ends with letter 'L'.Display the record in ascending order based on building type name.
SELECT name FROM building_type 
WHERE name LIKE '%L'
ORDER BY name;

-- 14. Write a query to display all the details of the buildings whose owner name contains 'di' in it. Display the records sorted in ascending order based on the owner name of the building.
SELECT * FROM building
WHERE owner_name LIKE '%di%'
ORDER BY owner_name;

-- 15. Write a query to display the due date and  payable amount  of all the payment dates that are all not fall in between '2017-09-10' to '2017-10-10'.
SELECT due_date, payable_amount 
FROM bill 
WHERE payment_date NOT BETWEEN '2017-09-10' AND '2017-10-10';