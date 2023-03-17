--                  TABLE ALIASES AND INNER JOINS
-- Metro DB

-- 1.Write a query to display all the bills with meter details. Display the records in ascending order based on payable amount.
SELECT *
FROM bill 
JOIN meter 
ON bill.meter_id = meter.id
order by bill.payable_amount ;

-- 2. Write a query to display the meter number,owner name,address and contact number of all the buildings. Display the records in ascending order based on owner name then by meter_number.
SELECT m.meter_number,b.owner_name,b.address,b.contact_number
FROM building b
JOIN  meter m
ON b.id = m.building_id
order by b.owner_name , m.meter_number ;

-- 3.Write a query to display the connection name ,from_unit,to_unit and rate of all the slabs.Display the records in ascending order based on rate.
SELECT connection_name,from_unit,to_unit,rate
FROM slab s
join electricity_connection_type e
on s.connection_type_id=e.id
order by rate ;

-- 4.Write a query to display owner name,address ,meter number and total units consumed by all the customers in the month december 2017.Display the records in descending order by total_units.
SELECT owner_name,address,meter_number,total_units
FROM building 
JOIN meter
on building.id=meter.building_id
JOIN bill
on meter.id=bill.meter_id
where bill.month=12
order by bill.total_units desc;

-- 5.Write a query to display the connection type name and number of connections under each connection name and give alias name as connection_count.Display the records in descending order based on connection_count.
select e.connection_name,count(*)as  connection_count 
from electricity_connection_type e
join building_type b
on e.id=b.connection_type_id
join building bd
on b.id=bd.building_type_id
group by b.connection_type_id
order by connection_count desc;
-- getting the solution, Not a right way

-- 6.Write a query to display all the route details with travel payment details.Display the records in ascending order based on route_name.
select
r.id,
  r.route_name,
  tp.id,
  tp.travel_card_id,
  tp.entry_station_id,
  tp.entry_time,
  tp.exit_station_id,
  tp.exit_time,
  tp.amount
FROM route r
join station_route sr
on r.id=sr.route_id
join station st
on sr.station_id=st.id
join travel_payment tp
on st.id=tp.entry_station_id
order by r.route_name;

-- 7.Write a query to display the route name whose station name is 'Woodlands MRT station'. Display the records sorted in ascending order based on route name.
select r.route_name
from route r
join station_route str
on r.id=str.route_id
join station st
on str.station_id=st.id
where st.name="Woodlands MRT station"
order by  r.route_name;

-- 8. Write a query to display the person_name,contact_number,balance,
-- entry_time and exit_time of persons who all  entered from the station 'Sengkang MRT station'. Display the records in ascending order based on person_name
select p.person_name,p.contact_number,p.balance, tp.entry_time, tp.exit_time
from travel_card p
join travel_payment tp
on p.id=tp.travel_card_id
join station st
on tp.entry_station_id=st.id
where st.name="Sengkang MRT station"
order by p.person_name;

-- 9.Write a query to display the details of all the travel cards with the payment greater than 25 whose exit time is on the date '2017-12-21'.Display the records in ascending order based on person name.
select tc.*,tp.*
from travel_card tc
join travel_payment tp
on tc.id=tp.travel_card_id
where amount>25 and date(exit_time)="2017-12-21"
order by tc.person_name;

-- 10. Write a query to display position,updated_time,forward,scheduled time and actual time details,which are belongs to the route 'North South line' or 'Circle line'.Display the records in ascending order based on position and then in descending order based on updated_time.
select mt.position,mt.updated_time,mt.forward,ts.scheduled_time,ta.actual_time
from route r
join metro_train mt
on r.id=mt.route_id
join train_arrival_time ta 
on mt.id=ta.metro_train_id
join train_schedule ts
on ta.train_schedule_id=ts.id
where r.route_name  in ("North South line","Circle line")
order by position,scheduled_time;

-- 11.Write a query to display the names and contact number of person whose destination station is on the route 'North East line' with the payment more than 25.Display the records in ascending order based on person name.
select tc.person_name,tc.contact_number
from travel_card tc
join travel_payment tp
on tc.id=tp.travel_card_id
join station st
on tp.exit_station_id=st.id
join station_route sr
on st.id=sr.station_id
join route r
on r.id=sr.route_id
where tp.amount>25 and r.route_name="North East line"
order by person_name;

-- 12. Write a query to display the name and locality of the stations with the metro trains scheduled to arrive on '2017-12-21' along the route 'Circle line'.Display the records in ascending order based on the station name.
select st.name,st.locality
from route r
join station_route sr
on r.id=sr.route_id
join station st
on sr.station_id=st.id
join train_schedule ts
on st.id=ts.station_id
where date(ts.scheduled_time) in ("2017-12-21")
and r.route_name="Circle line"
order by st.name;

-- 13. Write a query to display person name,contact number and balance of all the details, who have minimum amount in their travel_card. If there is multiple record display the record in descending order by person name.
select tc.person_name,tc.contact_number,tc.balance from travel_card tc
join travel_payment tp
on tc.id=tp.travel_card_id
WHERE tp.amount= (SELECT MIN(amount) FROM travel_payment)
order by person_name desc;

-- 14.Write a query to display the person name,contact number,balance,entry_time and exit_time of all the details, who is having the second highest balance in their travel cards.Display the records in ascending order based on their person_name.
select tc.person_name,tc.contact_number,tc.balance,tp.entry_time,tp.exit_time
from travel_payment tp
join travel_card tc
on tp.travel_card_id=tc.id
where tc.balance=(select balance 
                  from travel_card
                  order by balance desc
                 limit 1 offset 1
                 )
order by tc.person_name;

-- 15. Write a query to display person name,contact number and balance  of all the details, who traveled for maximum number of times. If there are multiple records then display the records in descending order by person name.
select tc.person_name, tc.contact_number,tc.balance
from travel_card tc
join travel_payment tp
on tc.id=tp.travel_card_id
group by tc.person_name
having count(*)=(select max(travel_count) from  (select count(*) as travel_count from travel_payment 
  group by travel_card_id
  )as count
)
order by  tc.person_name desc
;