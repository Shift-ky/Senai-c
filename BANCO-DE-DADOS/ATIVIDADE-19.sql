CREATE DATABASE EMPRESA;

USE EMPRESA;

CREATE TABLE Funcionario(
	Codigo INT, 
	PrimeiroNome VARCHAR(50),
	SegundoNome VARCHAR(50), 
	UltimoNome VARCHAR(50),
	DataNasci VARCHAR(50), 
	CPF VARCHAR(20), 
	RG VARCHAR(20), 
	Endereco VARCHAR(100), 
	CEP VARCHAR(10),
	Cidade VARCHAR(50), 
	Fone VARCHAR(20), 
	CodigoDepartamento VARCHAR(20) PRIMARY KEY NOT NULL,
	Funcao VARCHAR(20), 
	Salario FLOAT
);

CREATE TABLE Departamento(
	Codigo INT PRIMARY KEY AUTO_INCREMENT, 
	Nome VARCHAR(50),
	Localizacao VARCHAR(50),
	CodigoFuncionarioGerente VARCHAR(10)
);
