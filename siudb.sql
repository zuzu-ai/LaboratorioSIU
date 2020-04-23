create database siu;
use siu;

create table Alumnos
(
carnet_Alumnos varchar(15) primary key not null,
nombre_Alumnos varchar(45) not null,
direccion_Alumnos varchar(45) not null,
telefono_Alumnos varchar(45) not null,
email_Alumnos varchar(20) not null,
status_Alumnos varchar(1) not null
)engine=InnoDB;

create table Maestros
(
carnet_Maestros varchar(5) primary key not null,
nombre_Maestros varchar(45) not null,
direccion_Maestros varchar(45) not null,
telefono_Maestros varchar(45) not null,
email_Maestros varchar(20) not null,
status_Maestros varchar(1) not null
)engine=InnoDB;

create table Facultad
(
codigo_Facultad varchar(5) primary key not null,
nombre_Facultad varchar(45) not null,
estado_Facultad varchar(1) not null
)engine=InnoDB;

create table Secciones
(
codigo_Secciones varchar(5) primary key not null,
nombre_Secciones varchar(45) not null,
estado_Secciones varchar(1) not null
)engine=InnoDB;

create table Carreras
(
codigo_Carreras varchar(5) primary key not null,
nombre_Carreras varchar(45) not null,
estado_Carreras varchar(1) not null
)engine=InnoDB;

create table Cursos
(
codigo_Cursos varchar(5) primary key not null,
nombre_Cursos varchar(45) not null,
estado_Cursos varchar(1) not null
)engine=InnoDB;

create table Asignacion_A
(
codigo_A varchar(15) primary key not null,
codigo_C varchar(5) not null,
codigo_S varchar(5) not null,
codigo_Ca varchar(5) not null,
codigo_F varchar(5) not null,

codigo_Se varchar(5) not null,


foreign key (codigo_A) references
Alumnos(carnet_Alumnos),
foreign key (codigo_C) references
Cursos(codigo_Cursos),
foreign key (codigo_S) references
Secciones(codigo_Secciones),
foreign key (codigo_Ca) references
Carreras(codigo_Carreras),
foreign key (codigo_F) references
Facultad(codigo_Facultad)
)engine=InnoDB;

create table Asignacion_M
(
codigo_M varchar(15) primary key not null,
codigo_C varchar(5) not null,
codigo_S varchar(5) not null,
codigo_Ca varchar(5) not null,
codigo_F varchar(5) not null,

codigo_Se varchar(5) not null,


foreign key (codigo_M) references
Maestros(carnet_Maestros),
foreign key (codigo_C) references
Cursos(codigo_Cursos),
foreign key (codigo_S) references
Secciones(codigo_Secciones),
foreign key (codigo_Ca) references
Carreras(codigo_Carreras),
foreign key (codigo_F) references
Facultad(codigo_Facultad)
)engine=InnoDB;

drop database siu;

select * from facultad;
