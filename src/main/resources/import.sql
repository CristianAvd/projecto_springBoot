/* Populate tabla clientes */

INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamérica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamérica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamérica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceanía');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antártida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(1, 'Abdon', 'Huaricallo', 'abdon@gmail.com', '2018-01-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(2, 'Marcos', 'Doe', 'marcos@gmail.com', '2018-01-02');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Carlos', 'Pecho', 'carlos@gmail.com', '2018-01-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Richard', 'Lerdof', 'richard@gmail.com', '2018-01-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(4, 'Erich', 'Gamma', 'erich.gamma@gmail.com', '2018-02-01');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Richard', 'Helm', 'richard.helm@gmail.com', '2018-02-10');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Ralph', 'Johnson', 'ralph.johnson@gmail.com', '2018-02-18');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'John', 'Vlissides', 'john.vlissides@gmail.com', '2018-02-28');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(3, 'Dr. James', 'Gosling', 'james.gosling@gmail.com', '2018-03-03');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(5, 'Magma', 'Lee', 'magma.lee@gmail.com', '2018-03-04');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(6, 'Tornado', 'Roe', 'tornado.roe@gmail.com', '2018-03-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES(7, 'Jade', 'Doe', 'jane.doe@gmail.com', '2018-03-06');

/* Creamos algunos usuarios con sus roles */
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('Cristian','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1, 'Cristian', 'Huaricallo','crish@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',1, 'Admin', 'admin','admin@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2, 1);

insert into categorias(nombre) values ('BEBIDAS');
insert into categorias(nombre) values ('GOMITAS');
insert into categorias(nombre) values ('GALLETAS');
insert into categorias(nombre) values ('ABARROTES');
insert into categorias(nombre) values ('POLLOS');

/*GALLETAS*/
insert into productos (nombre, precio, imagen, categoria_id) values ('Vainilla ','0.50', 'https://plazavea.vteximg.com.br/arquivos/ids/1919985-1000-1000/243940.jpg', 3);
insert into productos (nombre, precio, imagen, categoria_id) values ('Oreo ','0.80', 'https://plazavea.vteximg.com.br/arquivos/ids/1919974-1000-1000/20020065.jpg', 3);
insert into productos (nombre, precio, imagen, categoria_id) values ('Margarita ','0.80', 'https://plazavea.vteximg.com.br/arquivos/ids/553940-1000-1000/189682.jpg', 3);
insert into productos (nombre, precio, imagen, categoria_id) values ('Morochas ','1.00', 'https://plazavea.vteximg.com.br/arquivos/ids/342264-1000-1000/20148176.jpg', 3);

/*GOMITAS*/
insert into productos (nombre, precio, imagen, categoria_id) values ('Frugelé','8.50', 'https://plazavea.vteximg.com.br/arquivos/ids/553697-1000-1000/115428.jpg', 2);
insert into productos (nombre, precio, imagen, categoria_id) values ('Trident','3.50', 'https://plazavea.vteximg.com.br/arquivos/ids/331519-1000-1000/20100094.jpg', 2);
insert into productos (nombre, precio, imagen, categoria_id) values ('Amoras Moras','4.50', 'https://plazavea.vteximg.com.br/arquivos/ids/1233585-1000-1000/20201050.jpg', 2);
insert into productos (nombre, precio, imagen, categoria_id) values ('Glowworms','4.90', 'https://plazavea.vteximg.com.br/arquivos/ids/553737-1000-1000/20027488.jpg', 2);
insert into productos (nombre, precio, imagen, categoria_id) values ('Grissly Delfin','3.30', 'https://plazavea.vteximg.com.br/arquivos/ids/553731-1000-1000/20017402.jpg', 2);

/*BEBIDAS*/
insert into productos (nombre, precio, imagen, categoria_id) values ('Inka Cola 3L', 10.50, "https://plazavea.vteximg.com.br/arquivos/ids/525928-1000-1000/21186.jpg", 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('Inka Cola 2L', 8.00, "https://plazavea.vteximg.com.br/arquivos/ids/529990-1000-1000/20116221.jpg", 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('Inka Cola 1.5L', 5.00, "https://plazavea.vteximg.com.br/arquivos/ids/525922-1000-1000/73035.jpg", 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('Inka Cola 1/2L', 2.50, "https://plazavea.vteximg.com.br/arquivos/ids/525959-1000-1000/497497.jpg?v=637418781925600000", 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('Coca Cola 3L', 10.50, "https://plazavea.vteximg.com.br/arquivos/ids/529991-1000-1000/20116220.jpg", 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('Coca Cola 2L', 8.00, "https://plazavea.vteximg.com.br/arquivos/ids/529991-1000-1000/20116220.jpg", 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('Coca Cola 1.5L', 5.00, "https://plazavea.vteximg.com.br/arquivos/ids/530006-1000-1000/987120.jpg", 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('Coca Cola 1/2L', 2.50, "https://plazavea.vteximg.com.br/arquivos/ids/530231-1000-1000/20139555.jpg", 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('Pepsi 3L', 6.50, "https://plazavea.vteximg.com.br/arquivos/ids/318906-1000-1000/gaseosa-pepsi-botella-3l.jpg", 1);
insert into productos (nombre, precio, imagen, categoria_id) values ('Seven Up Cola 3L', 5.50, "https://plazavea.vteximg.com.br/arquivos/ids/318907-1000-1000/gaseosa-seven-up-botella-3l.jpg", 1);

insert into productos (nombre, precio, imagen, categoria_id) values ('POLLO ENTERO', 18.50, "https://i.blogs.es/8ceb02/pollo_entero/450_1000.jpg", 5);

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura equipos de oficina', null, 1, NOW());

INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 1);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(2, 1, 4);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 5);
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id, create_at) VALUES('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO facturas_items (cantidad, factura_id, producto_id) VALUES(3, 2, 6);

INSERT INTO `compras`(create_at, usuario_id) VALUES ('2022/10/18', 2);