DROP TABLE IF EXISTS users;	

CREATE TABLE users (
   id 			INTEGER 	 NOT NULL AUTO_INCREMENT,
   name 		VARCHAR(255) NOT NULL,
   email		VARCHAR(255) NOT NULL,
   create_date  DATE		 NOT NULL,
   PRIMARY KEY(ID)
);