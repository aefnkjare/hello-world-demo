DROP TABLE IF EXISTS hotels;
DROP TABLE IF EXISTS floors;
DROP TABLE IF EXISTS rooms;

CREATE TABLE hotels(
    id int AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    totalFloors int,
    totalOccupancy int,
    PRIMARY KEY (id)
);

CREATE TABLE floors(
    id int AUTO_INCREMENT NOT NULL,
    numberOfFloors int,
    hotelId int,
    PRIMARY KEY (id)
);

CREATE TABLE rooms(
    id int AUTO_INCREMENT NOT NULL,
    numberOfRooms int,
    floorId int,
    PRIMARY KEY (id))
;

INSERT INTO hotels(name, totalFloors, totalOccupancy)
	VALUES('I am lonely', 23, 1000);