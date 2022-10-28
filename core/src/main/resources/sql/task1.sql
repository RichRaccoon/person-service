-- - Создать представление из нескольких таблиц.
SET SEARCH_PATH = "medical";

CREATE VIEW person_data_and_medical_card AS
    SELECT last_name, first_name, birth_dt, age, sex, client_status, med_status, registry_dt
    FROM person_data JOIN medical_card ON person_data.medical_card_id = medical_card.id;