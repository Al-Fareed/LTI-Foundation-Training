--              SQL QUERYING 
-- Refer Electricity DB

--1. Write a query to insert any 5 records into the 'building_type' table.
INSERT INTO building_type (id,name,connection_type_id) VALUES(1001,"AAA",1);
INSERT INTO building_type (id,name,connection_type_id)  VALUES(1002,"BBBBBb",2);
INSERT INTO building_type  (id,name,connection_type_id) VALUES(1003,"CCCCC",3);
INSERT INTO building_type  (id,name,connection_type_id) VALUES(1004,"SDDDD",4);
INSERT INTO building_type  (id,name,connection_type_id) VALUES(1005,"EEEEEe",5);

-- 2.Write a query to change the name 'Shopping Mall' to 'Mall' in the building_type table.
UPDATE  building_type
SET name="Mall"
WHERE name="Shopping Mall";

--3. Write a query to delete the rows from the table 'building_type' where the electricity connection is home .
-- Hint: The connection_type_id for home is 1.
DELETE FROM building_type WHERE connection_type_id=1;


