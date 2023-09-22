CREATE DATABASE DBCOUNTRIES


CREATE TABLE Country (
    country_id INT PRIMARY KEY IDENTITY(1,1),
    country_name VARCHAR(255)
);

CREATE TABLE State (
    state_id INT PRIMARY KEY IDENTITY(1,1),
    state_name VARCHAR(255),
    country_id INT,
    FOREIGN KEY (country_id) REFERENCES Country(country_id)
);

CREATE TABLE City (
    CityID INT PRIMARY KEY IDENTITY(1,1),
    CityName VARCHAR(255),
    StateID INT,
    FOREIGN KEY (StateID) REFERENCES State(StateID)
);

drop table Country
drop table State
drop table City


-- Insert test data into the Countries table
INSERT INTO Country (country_name) VALUES ('USA');
INSERT INTO Country (country_name) VALUES ('Canada');
INSERT INTO Country (country_name) VALUES ('India');
-- Add more countries as needed

-- Insert test data into the States table
INSERT INTO State (state_name, countryid) VALUES ('New York', 1); -- Associate with USA
INSERT INTO State (state_name, countryid) VALUES ('California', 1); -- Associate with USA
INSERT INTO State (state_name, countryid) VALUES ('Ontario', 2); -- Associate with Canada
INSERT INTO State (state_name, countryid) VALUES ('Karnataka', 3); -- Associate with India
-- Add more states as needed

-- Insert test data into the Cities table
INSERT INTO Cities (CityName, StateID) VALUES ('New York City', 1); -- Associate with New York
INSERT INTO Cities (CityName, StateID) VALUES ('Los Angeles', 2); -- Associate with California
INSERT INTO Cities (CityName, StateID) VALUES ('Toronto', 3); -- Associate with Ontario
INSERT INTO Cities (CityName, StateID) VALUES ('Bangalore', 4); -- Associate with Karnataka
-- Add more cities as needed

SELECT * FROM Country
SELECT * FROM City
SELECT * FROM State