--                          COMPLEX MULTI TABLE JOINS
-- Electricity DB

-- 1. Write a query to display the meter number,owner name and address of the owner who paid second least  fine amount.Display the records in ascending order based on owner name.
SELECT m.meter_number, b.owner_name, b.address
FROM meter m
JOIN building b ON m.building_id = b.id
JOIN bill bi ON m.id = bi.meter_id
WHERE bi.fine_amount != 0
ORDER BY bi.fine_amount ASC
LIMIT 1 OFFSET 1;

-- 2. Write a query to display the building owner name ,address and number of connections present in each building. Display the records in ascending order based on owner name.Give an alias name as connection_count.
Select building.owner_name,building.address,count(*) as connection_count from building
INNER JOIN building_type on building.building_type_id=building_type.id
INNER JOIN electricity_connection_type c on c.id=building_type.connection_type_id
INNER JOIN meter on meter.building_id=building.id
Group by building.id
Order  by building.owner_name ASC;

-- 3. Write a query to display owner name,address ,meter number and payable amount of all the bill which are all not having fine amount that are generated for 2017 December.  Display the records in ascending order based on owner name.
select bd.owner_name,bd.address,m.meter_number,b.payable_amount
from building bd
join meter m on bd.id=m.building_id
join bill b on m.id=b.meter_id
where b.fine_amount is null and b.month='12' and b.year ='2017'
order by owner_name;

-- 4. Display building and meter details based on maximum fine amount condition using joins
-- Write a query to display owner name, address , meter number and payable amount of all the bills with the maximum fine amount. If there are multiple records display in ascending  order based on owner_name.
select bd.owner_name,bd.address,m.meter_number,b.payable_amount
from building bd
join meter m on bd.id=m.building_id
join bill b on m.id=b.meter_id
where b.id=(
select id from bill 
order by fine_amount desc
  limit 1
)
order by owner_name;

-- 5.Write a query to display the owner_name and total amount who paid the maximum bill amount in the year 2017.If there are multiple records display the record in ascending order based on owner_name Give an alias name as "TotalBillAmount".
select bd.owner_name, sum(b.payable_amount)as TotalBillAmount
from building bd
join meter m on bd.id=m.building_id
join bill b on m.id=b.meter_id
where b.year='2017'
group by owner_name
order by TotalBillAmount desc,
bd.owner_name asc
limit 1;

-- 6. Write a query to display the owner name,building type name,meter number and payment date of the bill which are raised in the month December 2017. If the payment is not done, then display it as 'Not Paid Yet'. Give an alias name for payment date as 'Payment_Status'. Display the record in ascending order based on owner name.
select bd.owner_name,bt.name,m.meter_number,
case
	when b.is_payed=0 then 'Not Paid Yet'
    else b.payment_date
   end  as Payment_Status
 from building_type bt
 join building bd on bt.id=bd.building_type_id
 join meter m on m.building_id=bd.id
 join bill b on b.meter_id=m.id
 where b.month="12" and b.year="2017"
 order by owner_name;

--  7.Write a query to display the building type name and the number of buildings under the type which has maximum number of buildings.Give an alias name as number_of_buildings. If there are multiple records sort in ascending order by name.
SELECT building_type.name AS building_type_name, COUNT(*) AS number_of_buildings
FROM building
INNER JOIN building_type ON building.building_type_id = building_type.id
GROUP BY building_type.name
HAVING COUNT(*) = (
  SELECT COUNT(*) AS building_count
  FROM building
  GROUP BY building_type_id
  ORDER BY building_count DESC
  LIMIT 1
)
ORDER BY building_type_name ASC;


-- 8.Write a query to display the meter number,owner name and address of the owner who paid fine most number of times.Display the records in ascending order based on owner name.
SELECT m.meter_number, b.owner_name, b.address
FROM building b
JOIN meter m ON b.id = m.building_id
JOIN bill bl ON m.id = bl.meter_id
WHERE bl.fine_amount > 0
GROUP BY b.owner_name
ORDER BY COUNT(bl.fine_amount) DESC, b.owner_name ASC
LIMIT 1;

-- 9.Write a query to display the meter number,owner name and address of the owner who paid second least  fine amount.Display the records in ascending order based on owner name.
SELECT m.meter_number, b.owner_name, b.address
FROM meter m
JOIN building b ON m.building_id = b.id
JOIN bill bi ON m.id = bi.meter_id
WHERE bi.fine_amount != 0
ORDER BY bi.fine_amount ASC
LIMIT 1 OFFSET 1;

-- 10. Write a query to display the meter number ,total unit, payable amount and hourly usage of by  morning ,Afternoon ,Evening and Night for the month December 2017 of each meter. Display the record in descending order by total units.
-- Note : Give alias name as month_total_unit for monthly total  unit, 6 to 11 as Morning give an alias name as morning,12 to 15 as Afternoon give an alias name as afternoon,16 to 19 as Evening give an alias name as evening and remaining as Night give an alias name as night .
select m.meter_number , sum(er.total_units) as month_total_unit , b.payable_amount , 
sum(er.h6+er.h7+er.h8+er.h9+er.h10+er.h11) as morning , 
sum(er.h12+er.h13+er.h14+er.h15) as afternoon,
sum(er.h16+er.h17+er.h18+er.h19) as evening,
sum(er.h20+er.h21+er.h22+er.h23+er.h24+er.h1+er.h2+er.h3+er.h4+er.h5) as night
from electricity_reading er 
join meter m on m.id= er.meter_id
join bill b on b.meter_id=m.id
where b.month = 12 and b.year=2017 
group by m.meter_number
order by month_total_unit desc;