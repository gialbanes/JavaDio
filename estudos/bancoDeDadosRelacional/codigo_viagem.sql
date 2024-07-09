CREATE DATABASE viagem_dio;

CREATE TABLE usuarios(
 id INT,
 nome VARCHAR(255) NOT NULL,
 email VARCHAR(100) NOT NULL, 
 endereco VARCHAR(50) NOT NULL,
 data_nasc DATE NOT NULL
 );
 
CREATE TABLE destinos(
id INT,
nome VARCHAR(255) NOT null,
descricao VARCHAR(255) NOT null
);

CREATE TABLE reservas(
id INT,
id_usuario INT,
id_destino INT,
data DATE,
STATUS VARCHAR(255) 
);

INSERT INTO usuarios (id, nome, email, data_nasc, endereco) VALUES 
(1, 'João Silva', 'joao@example.com', '1990-05-15', 'Rua A, 123, Cidade X, Estado Y'),
(2, 'Maria Santos', 'maria@example.com', '1985-08-22', 'Rua B, 456, Cidade Y, Estado Z'),
(3, 'Pedro Souza', 'pedro@example.com', '1998-02-10', 'Avenida C, 789, Cidade X, Estado Y');

INSERT INTO destinos (id, nome, descricao) VALUES 
(1, 'Praia das Tartarugas', 'Uma bela praia com areias brancas e mar cristalino'),
(2, 'Cachoeira do Vale Verde', 'Uma cachoeira exuberante cercada por natureza'),
(3, 'Cidade Histórica de Pedra Alta', 'Uma cidade rica em história e arquitetura');

INSERT INTO reservas (id, id_usuario, id_destino, data, status) VALUES 
(1, 1, 2, '2023-07-10', 'confirmada'),
(2, 2, 1, '2023-08-05', 'pendente'),
(3, 3, 3, '2023-09-20', 'cancelada');

SELECT * FROM usuarios;
SELECT nome, email FROM usuarios;
SELECT * FROM usuarios WHERE nome = 'João Silva';
SELECT * FROM usuarios WHERE data_nasc < '1990-01-01';
SELECT * FROM usuarios WHERE nome LIKE '%Silva%';
SELECT * FROM usuarios WHERE nome LIKE 'Jo_o%';

UPDATE usuarios SET endereco = 'Nova Rua, 123' WHERE email = 'joao@example.com';

DELETE FROM reservas WHERE status = 'cancelada';
SELECT * FROM reservas;


-- Migração de dados --
CREATE TABLE usuarios_nova (
  id INT,
  nome VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  data_nasc DATE NOT NULL,
  endereco VARCHAR(100) NOT NULL
);

INSERT INTO usuarios_nova (id, nome, email, data_nasc, endereco)
SELECT id, nome, email, data_nasc, endereco
FROM usuarios;

SELECT * FROM usuarios_nova;

drop TABLE usuarios;

ALTER TABLE usuarios_nova RENAME usuarios;

-- Alterando o tamanho de endereço na nova tabela --
ALTER TABLE usuarios MODIFY COLUMN endereco VARCHAR(150);

ALTER TABLE usuarios MODIFY COLUMN id INT AUTO_INCREMENT, ADD PRIMARY KEY (id);
ALTER TABLE destinos MODIFY COLUMN id INT AUTO_INCREMENT, ADD PRIMARY KEY (id);
ALTER TABLE reservas MODIFY COLUMN id INT AUTO_INCREMENT, ADD PRIMARY KEY (id);

ALTER TABLE reservas ADD CONSTRAINT fk_reservas_usuarios FOREIGN KEY (id_usuario) REFERENCES usuarios(id);
ALTER TABLE reservas ADD CONSTRAINT fk_reservas_destinos FOREIGN KEY (id_destino) REFERENCES destinos(id);


