CREATE DATABASE DBLibros;
USE DBLibros;

# -------------tabla libros--------------------
CREATE TABLE Tb_Tarea
(
	nombre varchar(150) PRIMARY KEY,
    descripcion varchar(300),
    autor varchar(150),
    ejemplares int,
    costo int
);

/* datos iniciales para la tabla libros*/
insert into Tb_Tarea(nombre, descripcion,autor,ejemplares,costo) values('Libro1','primer libro','autor1',5,4);
insert into Tb_Tarea(nombre, descripcion,autor,ejemplares,costo) values('Libro2','segundo libro','autor2',5,4);

select * from Tb_Tarea;

ALTER TABLE Tb_Tarea
ADD fecha date

