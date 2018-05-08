DROP TABLE ROOM if exists;

CREATE TABLE room (
   id INT NOT NULL,
   room_number VARCHAR(50) NOT NULL,
   room_type VARCHAR(50) NOT NULL,
   num_rooms INT NOT NULL,
   available BIT NOT NULL
);
