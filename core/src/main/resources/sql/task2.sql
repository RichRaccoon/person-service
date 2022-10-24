-- - Написать запрос, выводящий общие записи из 2 таблиц.
SET SEARCH_PATH = "medical";

SELECT last_name, first_name, age, phone_number, email, contact_id, c.id
FROM person_data AS pd JOIN contact AS c
ON pd.contact_id = c.id;