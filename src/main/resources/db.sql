use FALL24SOF302
DROP TABLE sinh_vien
-- Create the lop_hoc table first
CREATE TABLE lop_hoc (
                         id INT PRIMARY KEY IDENTITY(1,1),
                         class_name VARCHAR(255)
);

-- Create the sinh_vien table with a foreign key reference to lop_hoc
CREATE TABLE sinh_vien (
                           id INT PRIMARY KEY IDENTITY(1,1),
                           name VARCHAR(255),
                           address VARCHAR(255),
                           age INT,
                           status VARCHAR(255),
                           lop_hoc INT,
                           FOREIGN KEY (lop_hoc) REFERENCES lop_hoc(id)
);
-- Insert a few class records into the lop_hoc table
INSERT INTO lop_hoc (class_name)
VALUES ('Class A'), ('Class B'), ('Class C');
-- Insert 10 student records into the sinh_vien table
INSERT INTO sinh_vien (name, address, age, status, lop_hoc)
VALUES
    ('Nguyen Van A', 'Hanoi', 20, 'active', 1),
    ('Tran Thi B', 'Ho Chi Minh', 21, 'active', 1),
    ('Le Van C', 'Danang', 22, 'inactive', 2),
    ('Pham Thi D', 'Hue', 23, 'active', 2),
    ('Nguyen Van E', 'Can Tho', 20, 'inactive', 3),
    ('Do Thi F', 'Hai Phong', 21, 'active', 3),
    ('Hoang Van G', 'Ha Long', 22, 'inactive', 1),
    ('Bui Thi H', 'Vung Tau', 23, 'active', 2),
    ('Vo Van I', 'Nha Trang', 20, 'active', 3),
    ('Pham Van J', 'Da Lat', 21, 'inactive', 1);
