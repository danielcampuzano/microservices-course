INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES ('daniel', '1234', true, 'Daniel', 'Campuzano', 'campuzanobedoyadaniel@gmail.com');
INSERT INTO usuarios(username, password, enabled, nombre, apellido, email) VALUES ('admin', '1234', true, 'John', 'Doe', 'admin@gmail.com');

INSERT INTO roles(nombre) VALUES('ROLE_USER');
INSERT INTO roles(nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(1,1);
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2,2);
INSERT INTO usuarios_roles(usuario_id, role_id) VALUES(2,1);