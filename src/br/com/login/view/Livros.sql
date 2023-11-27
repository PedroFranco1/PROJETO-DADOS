create table Livros 
(
id_livro int auto_increment,
nome Varchar(40),
autor Varchar(40),
genero Varchar(40),
PRIMARY KEY (id_livro)
);

insert into Livros ( nome, autor, genero)
values ( "Senhor dos Anéis","J R R Tolkien" , "Fantasia"),( "Diário de um Banana","Jeff Kiney" , "Comédia"),( "As crônicas de Nárnia","C. S. Lewis" , "Aventura");

drop table Livros;

select*from livros;