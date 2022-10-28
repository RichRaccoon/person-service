-- - Написать запрос, выводящий список ФЛ c их родителями, у которых мед. статус отсутствует.

SET SEARCH_PATH = "medical";

SELECT person.last_name, person.first_name, person.age, parent.last_name, parent.first_name, parent.age
FROM person_data AS person JOIN person_data AS parent ON person.parent_id = parent.id
WHERE person.medical_card_id IN (SELECT id FROM medical_card WHERE med_status IS NULL);