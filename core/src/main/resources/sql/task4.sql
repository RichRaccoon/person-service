-- - Написать запрос, выводящий первые 50% записей из таблицы (первые значит те где наименьший id).

SET SEARCH_PATH = "medical";

SELECT * FROM contact
LIMIT (SELECT COUNT(id) / 2 FROM contact);