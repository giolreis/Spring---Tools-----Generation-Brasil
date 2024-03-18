SELECT * FROM db_blogpessoal.tb_postagens;
USE db_blogpessoal;

-- Limpar a tabela
-- TRUNCATE TABLE tb_postagens;

-- Inserindo os valores a nossa tabela de postagens
INSERT INTO tb_postagens(data, texto, titulo)
VALUES(current_timestamp(), "Finalizei curso de C# Basico através do IFSP", "Diploma C# Basico"),
(current_timestamp(), "Graduação em Ciencia de da Dados", "Graduação Cientista de Dados"),
(current_timestamp(), "Concluido o Exame TOEFL", " CERTIFICADO TOEFL"),
(current_timestamp(), "Estagiei por 2 anos co CEPETRO - UNICAMP", "CEPETRO-UNICAMP");
