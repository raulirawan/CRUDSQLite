DROP TABLE IF EXISTS `students`;

CREATE TABLE students(
student_id INT UNSIGNED NOT NULL PRIMARY KEY,
name VARCHAR(30)DEFAULT NULL,
mobile VARCHAR (15) DEFAULT NULL
);

INSERT INTO students VALUES (1, 'Raul Irawan Hermanto', '0878-4352-6655');
INSERT INTO students VALUES (2, 'Kevin Christe',    '0878-3253-5534');
INSERT INTO students VALUES (3, 'Raedi Hermawan',  '0831-4353-3344');
INSERT INTO students VALUES (4, 'Umar Faqih',   '0893-2356-3345');
INSERT INTO students VALUES (5, 'Angga Satya',    '0821-4258-2234');