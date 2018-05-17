DROP TABLE ROOM if exists;
DROP TABLE BOOKING if exists;
DROP TABLE FEEDBACK if exists;

CREATE TABLE room (
   id INT IDENTITY NOT NULL,
   room_number VARCHAR(50) NOT NULL,
   room_type VARCHAR(50) NOT NULL,
   num_rooms INT NOT NULL,
   available BIT NOT NULL
);

CREATE TABLE booking (
   id INT IDENTITY NOT NULL,
   room_id INT NOT NULL,
   start_date  DATE NOT NULL,
   end_date DATE NOT NULL,
   booking_name VARCHAR(50) NULL,
   email VARCHAR(200) NULL,
   address VARCHAR(200) NULL,
   num_of_people INT
);

CREATE TABLE feedback (
   id INT IDENTITY NOT NULL,
   booking_id VARCHAR(50) NOT NULL,
   stars INT,
   text VARCHAR(300)
);

