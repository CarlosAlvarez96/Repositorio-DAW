-- Ejercicio 1
SELECT 5*10,5+10,10-5,10/5;
-- Ejercicio 2
SELECT 5*10 AS "Multiplicación", 5+10 AS "Suma", 10-5 AS "Resta", 10/5 AS "División";
-- Ejercicio 3
SELECT nombre, apellido1, apellido2
FROM asistente apellido1
WHERE empresa = "BK Programación";
-- Ejercicio 4
SELECT *
FROM sala
ORDER BY capacidad DESC;
-- Ejercicio 5
SELECT *
FROM asistente
WHERE empresa = "Bigsoft"
ORDER BY capacidad DESC;
-- Ejercicio 6
SELECT empresa, COUNT(*) AS "Total asistentes por empresa"
FROM asistente
GROUP BY empresa;
--Ejercicio 7
SELECT nombre, apellido1, apellido2
FROM asistente
ORDER BY apellido1
LIMIT 5;