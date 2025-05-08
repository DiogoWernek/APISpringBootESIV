-- Inserindo users
INSERT INTO users (id, username, password) VALUES (1, 'Diogo Wernek', '123');
INSERT INTO users (id, username, password) VALUES (2, 'Ana Linda', '123');

-- Inserindo companies
INSERT INTO companies (
    id, fantasy_name, cnpj, address_street, address_district, legal_name, store_id_number,
    type, cep, state, city_code, city, region, country_description, country_id, phone_code,
    phone, birth_date, home_page, email, is_active
) VALUES
(1, 'Paulo Fagundes', '11223344000155', 'Rua Antônio Primo Nalesso', 'Vila Rubens', 'Tech top', 1,
 'f', '18207385', 'SP', '3550308', 'Itapetininga', 'Sudeste', 'Brasil', '1058', '11',
 '40028922', '2010-03-24', 'www.techbr.com', 'techbrasil@tech.com.br', true),

(2, 'Luana Ribeiro', '99988877766', 'Rua das Palmeiras 321', 'Vila Nova', 'Luana da Silva Ribeiro', 1,
 'r', '88000-000', 'Santa Catarina', '4205407', 'Florianópolis', 'Sul', 'Brasil', '1058', '48',
 '32223344', '1990-07-28', '', 'luana.ribeiro@gmail.com', true),

(3, 'Soluções Alfa', '12345678000100', 'Avenida Central 500', 'Industrial', 'Alfa Soluções em TI Ltda.', 1,
 'r', '70000-000', 'Distrito Federal', '5300108', 'Brasília', 'Centro-Oeste', 'Brasil', '1058', '61',
 '33445566', '2015-11-05', 'www.solucaoalfa.com.br', 'suporte@solucoesalfa.com.br', false),

(4, 'Carlos Moura', '11122233344', 'Rua das Laranjeiras 67', 'Zona Norte', 'Carlos Alberto Moura', 1,
 'r', '05000-000', 'São Paulo', '3550308', 'São Paulo', 'Sudeste', 'Brasil', '1058', '11',
 '911223344', '1987-02-11', 'www.techbr.com', 'carlos.moura@outlook.com', true),

(5, 'Oficina do Saber', '99887766000112', 'Rua do Conhecimento 89', 'Educacional', 'Oficina do Saber Cursos Ltda.', 1,
 'r', '60000-000', 'Ceará', '2304400', 'Fortaleza', 'Nordeste', 'Brasil', '1058', '85',
 '988776655', '2018-09-10', '', 'jow123.wernek@gmail.com', true),

(6, 'Julia Almeida', '23456789000', 'Avenida das Rosas 1040', 'Jardins', 'Julia de Almeida Costa', 1,
 'r', '01311-000', 'São Paulo', '3550308', 'São Paulo', 'Sudeste', 'Brasil', '1058', '11',
 '998877665', '1993-08-12', '', '', true),

(7, 'Paulo top', '54321098700', 'Rua Professor Tostes', 'Central', 'Lucas Lindão', 1,
 'r', '68900022', 'AP', '3304557', 'Macapá', 'Sudeste', 'Brasil', '1058', '21',
 '973004500', '1990-05-12', '', '', true),

(8, 'Nina Borges', '33221100055', 'Rua das Hortências 90', 'Flores', 'Nina Pereira Borges', 1,
 'f', '88001-300', 'Santa Catarina', '4205407', 'Florianópolis', 'Sul', 'Brasil', '1058', '48',
 '984443322', '1996-12-21', '', '', true),

(9, 'Inova Móveis', '55667788000177', 'Avenida Industrial 300', 'Zona Industrial', 'Inova Indústria de Móveis Ltda.', 1,
 'x', '09999-000', 'São Paulo', '3513801', 'Diadema', 'Sudeste', 'Brasil', '1058', '11',
 '40409999', '2000-01-01', '', '', true),

(10, 'Delta Equipamentos', '44556677000122', 'Rua das Engenharias 500', 'Tecnologia', 'Delta Equipamentos Industriais Ltda.', 1,
 'f', '92900-000', 'Rio Grande do Sul', '4306767', 'Eldorado do Sul', 'Sul', 'Brasil', '1058', '51',
 '32445500', '1998-06-24', '', '', true),

(11, 'Gláucia Ribeiro', '11221122112', 'Rua Nova Esperança 20', 'Jardim América', 'Gláucia Maria Ribeiro', 1,
 'matriz', '04576-100', 'São Paulo', '3550308', 'São Paulo', 'Sudeste', 'Brasil', '1058', '11',
 '31998888', '1991-10-17', '', '', true),

(12, 'Montana Bikes', '99887766000111', 'Rua da Aventura 1024', 'Radical', 'Montana Bikes Brasil Ltda.', 1,
 'matriz', '09800-000', 'São Paulo', '3548708', 'São Bernardo do Campo', 'Sudeste', 'Brasil', '1058', '11',
 '43905000', '1995-03-24', '', '', true),

(13, 'Montana Bikes - Filial', '99887766000200', 'Rodovia Central KM 200', 'Zona Rural', 'Montana Bikes Brasil Ltda.', 2,
 'filial', '18540-000', 'São Paulo', '3540606', 'Porto Feliz', 'Sudeste', 'Brasil', '1058', '11',
 '43905781', '2018-07-03', '', '', true),

(14, 'VEGA AUTOS', '23456789000100', 'Rua dos Motores 6751', 'Automotiva', 'Vega Automóveis do Brasil Ltda.', 1,
 'r', '83090-901', 'Paraná', '4125506', 'São José dos Pinhais', 'Sul', 'Brasil', '1058', '41',
 '30412959', '2016-09-10', '', '', false),

(15, 'Diogo Araujo Wernek', '47245804885', 'Rua Antônio Primo Nalesso', 'Vila Rubens', '', 0,
 'f', '18207385', 'SP', '3550308', 'Itapetininga', 'Sudeste', 'Brasil', '15', '15',
 '997676890', '2005-06-17', 'github.com/diogowernek', 'diogo@wernek.com', true);
