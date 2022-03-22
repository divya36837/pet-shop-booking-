CREATE TABLE PetDisplay
(	id INT AUTO_INCREMENT PRIMARY KEY,
	pet_name VARCHAR(76) NOT NULL UNIQUE,
	pet_price INT NOT NULL
	
);
SELECT * FROM PetDisplay;
INSERT INTO PetDisplay (pet_name,pet_price)VALUES('Dog',10000);
UPDATE PetDisplay SET pet_price=20000 WHERE pet_name='Dog';