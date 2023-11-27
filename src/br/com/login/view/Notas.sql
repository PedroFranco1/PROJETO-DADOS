create table Notas 
(
id_livro int ,
id_cliente int ,
nota int check (nota >= 1 and nota <=10),
FOREIGN KEY (id_cliente) references Clientes(id_cliente),
FOREIGN KEY (id_livro) references Livros(id_livro)

);
insert into Clientes (id_livro,id_cliente,nota)
values (1,2,10);