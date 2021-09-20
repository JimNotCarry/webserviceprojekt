-- Använd (USE) databasen accounts
USE accounts;

-- Skapar table Persons

CREATE TABLE Accounts (
     ID int NOT NULL AUTO_INCREMENT,
     Name varchar(255) NOT NULL,
     Email varchar(255) NOT NULL,
     Password varchar(255),
     lastUpdate DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP, 
     PRIMARY KEY (ID)
)AUTO_INCREMENT=100;


-- Kastar in lite random accounts

INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1001', 'Hannes Andersson', 'hannes@andersson.se', 'hannes123', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1002', 'James Gossling', 'james@gossling.se', 'james123', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1003', 'Johan Falk', 'johan@falk.se', 'hannes123', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1004', 'Tim Andersson', 'tim@andersson.se', 'tim123', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1005', 'Linus Gustafsson', 'linus@gustafsson.se', 'linus123', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1006', 'Lars Krantz', 'lars@krantz.se', 'lars123', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1007', 'Lars Andersson', 'lasse@andersson.se', 'lasse123', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1008', 'Linus Hellberg', 'linus@hellberg.se', 'sunflower', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1009', 'Johanna Salmi Sunnerdahl', 'johanna@sunnerdahl.se', 'hummingbird', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1010', 'Alexander Qvist Carlsson', 'alexander@carlsson.se', 'rainclouds', CURRENT_TIMESTAMP);
INSERT INTO Accounts (ID, Name, Email, Password, lastUpdate)
VALUES ('1011', 'Lucas Holm', 'lucas@holm.se', 'pleasedonthack', CURRENT_TIMESTAMP);

SELECT * FROM Accounts;

SELECT * FROM Accounts WHERE ID = '1001';

SELECT * FROM Accounts WHERE Name LIKE '%Lars%';