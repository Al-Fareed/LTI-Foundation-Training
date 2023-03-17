--                      SET OPERATORS
-- Electricity DB

-- 1. Write a query to display the details of the buildings whose owner name is 'Muzzammil' and 'Nicholas' in ascending order based on the owner name and then by email address.
-- Note: Use union
SELECT * FROM building WHERE owner_name = 'Muzzammil'
UNION
SELECT * FROM building WHERE owner_name = 'Nicholas'
ORDER BY owner_name ASC, email_address ASC;

-- 2. Write a query to display the number of bills paid with respect to payment date in the month of october and number of bills with payment date in the month of december.Give an alias name to the number of bills as no_of_bills.Display the record in descending order based on no_of_bills .
-- Note: Use union
select count(*)as no_of_bills   from bill
where is_payed=1 and month(payment_date) in (10)
union 
select count(*)as no_of_bills   from bill
where is_payed=1 and month(payment_date) in (12)
group by  month(payment_date)
order by no_of_bills desc ;