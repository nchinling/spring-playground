CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    email VARCHAR(255),
    age INT
);


INSERT INTO employee (name, email, age) VALUES
('John Doe', 'john.doe@example.com', 30),
('Jane Smith', 'jane.smith@example.com', 25),
('Michael Johnson', 'michael.johnson@example.com', 35),
('Emily Brown', 'emily.brown@example.com', 28),
('David Wilson', 'david.wilson@example.com', 40);

