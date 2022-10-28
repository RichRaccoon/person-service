-- - Написать запрос, удаляющий повторяющиеся (без учета id) строки с таблице.

SET SEARCH_PATH = "medical";

DELETE FROM contact WHERE id NOT IN (
    SELECT id FROM (
        SELECT MIN(id) as id, phone_number, email, profile_link FROM contact
        GROUP BY phone_number, email, profile_link
    ) AS unique_id
);