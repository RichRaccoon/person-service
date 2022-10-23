SET SEARCH_PATH = "medical";

INSERT INTO medical_card VALUES (1, 'A', 'C', '2022-11-21', 'test comment 1');
INSERT INTO medical_card VALUES (2, 'A', 'D', '2021-01-11', 'test comment 2');
INSERT INTO medical_card VALUES (3, 'B', 'C', '2006-10-23', 'test comment 3');
INSERT INTO medical_card VALUES (4, 'A', 'D', '2018-05-16', 'test comment 4');
INSERT INTO medical_card VALUES (5, 'B', 'D', '2019-07-30', 'test comment 5');
INSERT INTO medical_card VALUES (6, 'B', 'D', '2013-07-12', 'test comment 6');
INSERT INTO medical_card VALUES (7, 'A', 'C', '2016-09-22', 'test comment 7');
INSERT INTO medical_card VALUES (8, 'B', 'D', '2018-03-21', 'test comment 8');
INSERT INTO medical_card VALUES (9, 'A', 'D', '2012-10-14', 'test comment 9');
INSERT INTO medical_card VALUES (10, 'A', 'C', '2020-11-15', 'test comment 10');

INSERT INTO illness VALUES (1, 1, 42, 'A', '2022-09-12', '2022-10-20');
INSERT INTO illness VALUES (2, 5, 11, 'B', '2022-08-12', '2022-09-20');
INSERT INTO illness VALUES (3, 2, 2, 'A', '2022-02-24', null);
INSERT INTO illness VALUES (4, 3, 20, 'A', '2012-02-22', '2012-05-10');
INSERT INTO illness VALUES (5, 4, 11, 'C', '2022-08-02', '2022-08-29');
INSERT INTO illness VALUES (6, 6, 15, 'A', '2021-08-10', '2021-09-01');
INSERT INTO illness VALUES (7, 9, 8, 'A', '2020-08-07', '2020-08-10');
INSERT INTO illness VALUES (8, 7, 16, 'D', '2022-01-01', '2022-01-14');
INSERT INTO illness VALUES (9, 8, 35, 'A', '2019-09-04', '2019-10-11');
INSERT INTO illness VALUES (10, 10, 19, 'E', '2022-07-19', null);

INSERT INTO contact VALUES (1, '89954567898', 'test1@gmail.com', 'profile link 1');
INSERT INTO contact VALUES (2, '89954567454', 'test2@gmail.com', null);
INSERT INTO contact VALUES (3, '84574957595', 'test3@gmail.com', 'profile link 2');
INSERT INTO contact VALUES (4, '84646464646', 'test4@gmail.com', null);
INSERT INTO contact VALUES (5, '84646223346', 'test5@gmail.com', 'profile link 3');
INSERT INTO contact VALUES (6, '89995935395', null, 'profile link 4');
INSERT INTO contact VALUES (7, '89954567898', 'test6@gmail.com', 'profile link 5');
INSERT INTO contact VALUES (8, '89954567823', 'test7@gmail.com', null);
INSERT INTO contact VALUES (9, '89954535321', 'test8@gmail.com', 'profile link 6');
INSERT INTO contact VALUES (10, '89935356666', null, 'profile link 7');

INSERT INTO address VALUES (1, 1, 10, 'Test city 1', null, 'Test street 1', 'Test building 1', 'Test flat 1');
INSERT INTO address VALUES (2, 3, 10, 'Test city 2', 606910, 'Test street 2', 'Test building 2', 'Test flat 2');
INSERT INTO address VALUES (3, 2, 11, 'Test city 3', 609305, 'Test street 3', 'Test building 3', 'Test flat 3');
INSERT INTO address VALUES (4, 4, 10, 'Test city 4', null, 'Test street 4', 'Test building 4', 'Test flat 4');
INSERT INTO address VALUES (5, 5, 10, 'Test city 5', null, 'Test street 5', 'Test building 5', 'Test flat 5');
INSERT INTO address VALUES (6, 7, 11, 'Test city 6', null, 'Test street 6', 'Test building 6', 'Test flat 6');
INSERT INTO address VALUES (7, 6, 10, 'Test city 7', 142142, 'Test street 7', 'Test building 7', 'Test flat 7');
INSERT INTO address VALUES (8, 8, 10, 'Test city 8', null, 'Test street 8', 'Test building 8', 'Test flat 8');
INSERT INTO address VALUES (9, 9, 11, 'Test city 9', null, 'Test street 9', 'Test building 9', 'Test flat 9');
INSERT INTO address VALUES (10, 10, 10, 'Test city 10', null, 'Test street 10', 'Test building 10', 'Test flat 10');

INSERT INTO person_data VALUES (1, 'last_name1', 'first_name1', '1995-04-12', 27, 'M', 1, 1, null);
INSERT INTO person_data VALUES (2, 'last_name2', 'first_name2', '1996-04-22', 26, 'M', 2, 2, null);
INSERT INTO person_data VALUES (3, 'last_name3', 'first_name3', '1998-01-05', 24, 'F', 3, 3, null);
INSERT INTO person_data VALUES (4, 'last_name4', 'first_name4', '1999-09-11', 23, 'M', 4, 4, null);
INSERT INTO person_data VALUES (5, 'last_name5', 'first_name5', '1996-11-10', 25, 'F', 5, 5, null);
INSERT INTO person_data VALUES (6, 'last_name6', 'first_name6', '1980-05-16', 42, 'M', 6, 6, null);
INSERT INTO person_data VALUES (7, 'last_name7', 'first_name7', '1994-02-19', 28, 'M', 7, 7, null);
INSERT INTO person_data VALUES (8, 'last_name8', 'first_name8', '1970-08-10', 52, 'F', 8, 8, null);
INSERT INTO person_data VALUES (9, 'last_name9', 'first_name9', '2001-03-15', 21, 'F', 9, 9, null);
INSERT INTO person_data VALUES (10, 'last_name10', 'first_name10', '1998-10-01', 24, 'M', 10, 10, null);

