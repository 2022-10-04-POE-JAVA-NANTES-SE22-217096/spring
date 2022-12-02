DROP TABLE IF EXISTS etudiant;
 
CREATE TABLE etudiant (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nom VARCHAR(250) NOT NULL,
  prenom VARCHAR(250) NOT NULL
);

INSERT INTO etudiant (nom, prenom) VALUES
  ('Balasko', 'Josiane'),
  ('Minet', 'Bernard');
  
