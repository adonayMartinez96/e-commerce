create database pruebaTecnica;


insert into categoria (id_categoria,cat_imagen, cat_nombre, cat_orden) values 
(10, 'url..', 'Entradas', 1);
 
insert into categoria (id_categoria,cat_imagen, cat_nombre, cat_orden) values 
(20, 'url..', 'Bebidas', 2);

insert into categoria (id_categoria,cat_imagen, cat_nombre, cat_orden) values 
(30, 'url..', 'Platos fuertes', 3);

insert into categoria (id_categoria,cat_imagen, cat_nombre, cat_orden) values 
(40, 'url..', 'Postres', 4);



insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(1, 'Alitas Búfalo ba', '../img/descarga1.jpeg', 'Alitas Búfalo',5.50,10);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(2, 'Deditos de Queso', '../img/descarga2.jpeg', 'Deditos de Queso',6.25,10);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(3, 'Nachos', '../img/descarga1.jpeg', 'Nachos',4.75,10);


insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(4, 'Soda', '../img/descarga3.jpeg', 'Soda',2.50,20);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(5, 'jugo de naranja', '../img/descarga3.jpeg', 'jugo de naranja',2.25,20);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(6, 'Licuados de fruta', '../img/descarga3.jpeg', 'Licuados de fruta',2.75,20);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(7, 'agua embotellada', '../img/descarga3.jpeg', 'agua embotellada',1.75,20);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(8, 'cafe', '../img/descarga3.jpeg', 'Licuados de fruta',1.75,20);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(9, 'Hamburguesa', '../img/descarga4.jpeg', 'Hamburguesa',8.75,30);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(10, 'Hot dog', '../img/descarga4.jpeg', 'Hot dog',7.75,30);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(11, 'Pizza de jamon', '../img/descarga4.jpeg', 'Pizza de jamon',12.75,30);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(12, 'pollo empanizado', '../img/descarga4.jpeg', 'pollo empanizado',8.75,30);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(13, 'club sandiwch', '../img/descarga4.jpeg', 'club sandiwch',6.75,30);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(14, 'crepas', '../img/descarga4.jpeg', 'crepas',9.75,30);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(15, 'sandiwch de jamon', '../img/descarga4.jpeg', 'sandiwch de jamon',8.75,30);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(16, 'flan de queso', '../img/descarga5.jpeg', 'flan de queso',5.75,40);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(17, 'tres leches', '../img/descarga5.jpeg', 'tres leches',9.75,40);

insert into producto (prd_id,prd_descripcion, prd_imagen, prd_nombre,prd_precio,cat_id) values 
(18, 'sorbete', '../img/descarga5.jpeg', 'sorbete',10.75,40);
