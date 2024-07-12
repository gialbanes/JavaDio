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

-- Normalização de endereços e migração de dados--
ALTER TABLE usuarios ADD rua VARCHAR(100), ADD numero VARCHAR(10), ADD cidade VARCHAR(50), ADD estado VARCHAR(50);

-- Copia os dados da tabela original para a nova tabela
UPDATE usuarios
SET rua = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 1), ',', -1), -- vai pegar as separações de vírgulas e o índice naquele array --
    numero = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 2), ',', -1),
    cidade = SUBSTRING_INDEX(SUBSTRING_INDEX(endereco, ',', 3), ',', -1),
    estado = SUBSTRING_INDEX(endereco, ',', -1);
    
SELECT * FROM usuarios;

ALTER TABLE usuarios DROP COLUMN endereco;

-- Junções --
SELECT * FROM usuarios us 
INNER JOIN reservas rs ON us.id = rs.id_usuario
INNER JOIN destinos ds ON rs.id_destino = ds.id; 

-- agora esse usuário não tem retorno pq ele não está referenciado na tabela reservas --
INSERT INTO usuarios (nome, email, data_nasc, rua, numero, cidade, estado) VALUES 
('Usuario sem reservas', 'semreservar@teste.com', '1990-10-10', 'Rua','123','cidade','estado');

-- left join --
SELECT * FROM usuarios us 
left JOIN reservas rs ON us.id = rs.id_usuario;

-- Right join --
INSERT INTO destinos ( nome, descricao) VALUES 
('Deestino sem reserva', 'Uma bela praia com areias brancas e mar cristalino');

SELECT * FROM reservas rs
RIGHT JOIN destinos ds
ON rs.id_destino = ds.id;

-- Sub-consultas -- 
SELECT * FROM destinos 
WHERE id NOT IN(SELECT id_destino FROM reservas); -- trouxe os destinos que não tem reservas --

SELECT * FROM usuarios 
WHERE id NOT IN(SELECT id_usuario FROM reservas); -- usuarios que não fizeram consultas --

-- Agrupamento --
SELECT COUNT(*) as total_usuarios FROM usuarios us
INNER JOIN reservas rs ON us.id = rs.id_usuario;

SELECT nome, (SELECT COUNT(*) FROM reservas WHERE id_usuario = usuarios.id) AS total_reservas FROM usuarios; -- reservas por usuário -- 

SELECT MAX(TIMESTAMPDIFF(YEAR, data_nasc, CURRENT_DATE())) AS maiorIdade FROM usuarios; -- maior idade --

INSERT INTO reservas (id_usuario, id_destino) VALUES 
(1, 3);

SELECT COUNT(*) id_destino FROM reservas
GROUP BY  id_destino;

-- Ordenação -- 
SELECT COUNT(*) AS qtd_reservas, id_destino FROM reservas
GROUP BY  id_destino
ORDER BY qtd_reservas ASC, id_destino desc;
