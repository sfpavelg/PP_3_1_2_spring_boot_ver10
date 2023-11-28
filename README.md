

# https://github.com/sfpavelg/PP_3_1_2_spring_boot_ver10.git

В БД MySQL нужно создать БД my_db.user.
Если БД с таким именем уже есть, но столбцы не совпадают с полями Entity, то её нужно удалить и создать заново.
БД создаётся путём SQL запроса прямо в MySQL в поле Workbench:

CREATE TABLE my_db.user (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255),
surname VARCHAR(255),
age VARCHAR(255)
);

После этого её нужно заполнить:

INSERT INTO my_db.user (name, surname, age)
VALUES
('Zaur', 'Tregulov',  '38'),
('Oleg', 'Ivanov',  '40'),
('Nina', 'Sidorova', '25');