use FALL24SOF302

CREate table sinh_vien(
                          id int primary key identity(1,1),
                          name varchar(255),
                          address varchar(255),
                          age int,
                          status varchar(255)
)

    INSERT INTO sinh_vien (name, address, age, status) VALUES
('Nguyen Van A', 'Hanoi', 20, 'Active'),
('Le Thi B', 'Ho Chi Minh City', 22, 'Active'),
('Tran Van C', 'Da Nang', 21, 'Inactive'),
('Pham Thi D', 'Hue', 23, 'Active'),
('Vu Van E', 'Hai Phong', 19, 'Active'),
('Hoang Thi F', 'Can Tho', 24, 'Inactive'),
('Bui Van G', 'Quang Ninh', 20, 'Active'),
('Do Thi H', 'Vinh', 22, 'Inactive'),
('Nguyen Van I', 'Nha Trang', 21, 'Active'),
('Le Van K', 'Bac Ninh', 23, 'Inactive');

select * from sinh_vien