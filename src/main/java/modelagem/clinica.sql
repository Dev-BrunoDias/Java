CREATE DATABASE clinica;

USE clinica;

CREATE TABLE medico(
idMedico INTEGER PRIMARY KEY AUTO_INCREMENT,
crmMedico INTEGER UNIQUE NOT NULL,
nome VARCHAR(30) NOT NULL,
endereco VARCHAR(50)  NOT NULL,
telefone VARCHAR(15) UNIQUE NOT NULL,
especialidade VARCHAR(50) NOT NULL

);

CREATE TABLE paciente(
idPaciente INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(30) NOT NULL,
endereco VARCHAR(50)  NOT NULL,
telefone VARCHAR(15) UNIQUE NOT NULL,
idMedico INTEGER NOT NULL,
);

CREATE TABLE consultas (
idConsulta INTEGER PRIMARY KEY AUTO_INCREMENT,
dia DATE NOT NULL,
observacao VARCHAR(50) NOT NULL,
idPaciente INTEGER NOT NULL,
idResponsavel INTEGER NOT NULL,
FOREIGN KEY(idResponsavel) REFERENCES medico(idMedico)
);

INSERT INTO medico VALUES (NULL, "22345", "Flavio Campos", "Rua Andrade Neves, 52", 999993234, "Cardiologista");
INSERT INTO medico VALUES (NULL, "22379", "João Paulo", "Rua Tupiniquins, 184", 988723456, "Pediátra");
INSERT INTO medico VALUES (NULL, "22987", "Carlos Roberto", "Rua Nilo Peçanha, 122", 994553311, "Fisioterapeuta");

SELECT * FROM medico;

INSERT INTO paciente VALUES (NULL, "Manoel dos Santos", "Rua Moreira Cesar, 34", 987326677, "1");
INSERT INTO paciente VALUES (NULL, "Julieta Amim", "Rua Pereira Nunes, 21", 98798677, "2");
INSERT INTO paciente VALUES (NULL, "Flavio Pina", "Rua carlota, 324", 922476577, "3");
INSERT INTO paciente VALUES (NULL, "Leo Kienen", "Rua Tolipas, 24", 922428709, "2");
INSERT INTO paciente VALUES (NULL, "João Vamondes", "Rua Projetada, 39", 966432345, "3");

SELECT * FROM paciente;

INSERT INTO consultas VALUES (NULL, "2022-11-10", "Teste de esforço", "1", "3");
INSERT INTO consultas VALUES (NULL, "2022-11-12", "Raio x ", "2", "1");
INSERT INTO consultas VALUES (NULL, "2022-11-12", "Consulta de rotina ", "3", "2");
INSERT INTO consultas VALUES (NULL, "2022-11-13", "Eletro Cardiograma ", "4", "1");
INSERT INTO consultas VALUES (NULL, "2022-11-16", "Massagem no joelho ", "5", "3");

DELETE FROM  consultas; 

UPDATE paciente
SET nome = "Joaquim da SIlva"
WHERE idPaciente = 4; 

    
SELECT * FROM medico
	INNER JOIN paciente 
	ON medico.idMedico = paciente.idMedico;

SELECT * FROM consultas;

SELECT * FROM paciente WHERE idpaciente = 3 



   




