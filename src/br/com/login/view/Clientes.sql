create table Clientes 
(
id_cliente int auto_increment,
nome Varchar(40),
sexo char(1),
idade smallint,
genero_favorito1 Varchar(25),
genero_favorito2 Varchar(25),
PRIMARY KEY (id_cliente)
);

insert into Clientes ( nome, sexo, idade, genero_favorito1, genero_favorito2)
values ( "Cauê", 'M',20 , "Aventura", "Fantasia"), ( "Pedro", 'M',21 , "Terror", "Ficção"), ( "Guilherme", 'M',20 , "Comédia", "Drama");

select * from Clientes;
drop table Clientes;