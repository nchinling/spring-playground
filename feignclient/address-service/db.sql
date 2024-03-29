-- Create the address table
CREATE TABLE address (
    id INT PRIMARY KEY AUTO_INCREMENT,
    city VARCHAR(255),
    state VARCHAR(255),
    employee_id INT,
    FOREIGN KEY (employee_id) REFERENCES employee(id)
);

-- Insert sample data
INSERT INTO address (city, state, employee_id) VALUES
('New York', 'New York', 1),
('Los Angeles', 'California', 2),
('Chicago', 'Illinois', 3),
('Houston', 'Texas', 4),
('Queenstown', 'Singapore',5 );


