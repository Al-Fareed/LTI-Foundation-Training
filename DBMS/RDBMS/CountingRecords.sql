--                      COUNTING RECORDS 
-- Refer Degree DB

-- 1. Write a query to display the number of electricity reading in which the total units per day is greater than 500.Give an alias name as 'count_total_units_500'.
select count(*) as count_total_units_500 from electricity_reading
where total_units>500;

-- 2. Write a query to display the number of skills in the skill table. Give an alias to the number of skills as skill_count.
select count(name) as skill_count from skill;

-- 3. Write a query to display the number of users who have not filled their profile yet. Give an alias to the number of users as user_count.
SELECT COUNT(*)as user_count FROM  user
where profile_id IS NULL;

-- 4.Write a query to display the number of alumni from 2008 batch who have registered in the system. Give an alias as alumni_2008_count.
select count(*)as alumni_2008_count from profile
where batch=2008;

-- 5. Write a query to display the number of male alumni from 2008 batch who have registered in the system. Give an alias as alumni_male_2008_count.
select count(*)as alumni_male_2008_count from profile
where batch=2008 and gender="male";

-- 6. Write a query to display the number of users who are currently working as 'Project Manager's. Give an alias as PM_Count.
select count(*) as PM_Count from profile
where designation="Project Manager";

-- 7. Write a query to display the batch of the senior most alumni working as 'Project Manager'. Give an alias as Senior_PM_Batch.
select min(batch) as Senior_PM_Batch from profile
where designation="Project Manager" ;

-- 8. Write a query to display the batch of the junior most alumni working as 'Project Manager'. Give an alias as Junior_PM_Batch.
select max(batch) as Junior_PM_Batch from profile
where designation="Project Manager" ;

-- 9. Write a query to display the number of projects in which the team size is more than 10. Give an alias as project_count.
select count(*) as project_count from project
where number_of_members>10;

-- 10. Write a query to display the number of queries raised / answered between 1 a.m and 5 a.m (both inclusive). Give an alias as number_of_queries.
select count(*) as number_of_queries  from query
where hour(date) between 1 and 5;

-- 11. Write a query to display the number of posts posted before 1st December, 2013. Give an alias as number_of_posts.
select count(*) as number_of_posts from post
where date<"2013-12-01";

-- 12.Write a query to display the number of posts posted after 1st December, 2013. Give an alias as number_of_posts.
select count(*) as number_of_posts from post
where date>"2013-12-01";

-- 13. Write a query to display the number of buildings having an email_address.Give an alias name as 'count_of_buildings_with_email'.
select count(*) as count_of_buildings_with_email from building
where email_address is not null;

-- 14. Write a query to display the number of bills having fine amount.Give an alias name as 'count_of_bills_with_fine'.
select count(*) as count_of_bills_with_fine from bill
where fine_amount is not null;

-- 15. Write a query to display the number of bills in which the bill payment is completed.Give an alias name as 'count_of_bills_with_payment'.
select count(*) as count_of_bills_with_payment from bill
where is_payed=1;

-- 16.Write a query to display the number of electricity reading in which the total units per day is greater than 500.Give an alias name as 'count_total_units_500'.
select count(*) as count_total_units_500 from electricity_reading
where total_units>500;