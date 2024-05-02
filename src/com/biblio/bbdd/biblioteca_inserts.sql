-- INSERT LIBROS
INSERT INTO `biblioteca`.`documento` (`codigo`, `titulo`, `anho_publicacion`, `tipo_documento`, `disponible`) VALUES ('3QW498F4', 'Pinocho', '2025', 'LIBRO', '1');
INSERT INTO `biblioteca`.`documento` (`codigo`, `titulo`, `anho_publicacion`, `tipo_documento`, `disponible`) VALUES ('2365F42', 'Cenicienta', '1990', 'LIBRO', '1');
INSERT INTO `biblioteca`.`documento` (`codigo`, `titulo`, `anho_publicacion`, `tipo_documento`, `disponible`) VALUES ('EG564EW', 'Caperucita', '1987', 'LIBRO', '1');
INSERT INTO `biblioteca`.`documento` (`codigo`, `titulo`, `anho_publicacion`, `tipo_documento`, `disponible`) VALUES ('3QW465T', 'Pipi calzas largas', '1984', 'LIBRO', '1');
INSERT INTO biblioteca.documento (codigo, titulo, anho_publicacion, tipo_documento, disponible) VALUES ('4g7h9d', 'Cien años de soledad', '1967', 'libro', '1');
INSERT INTO biblioteca.documento (codigo, titulo, anho_publicacion, tipo_documento, disponible) VALUES ('5h8j2k', 'Don Quijote de la Mancha', '1605', 'libro', '1');
INSERT INTO biblioteca.documento (codigo, titulo, anho_publicacion, tipo_documento, disponible) VALUES ('9a1b3c', 'El Gran Gatsby', '1925', 'libro', '1');
INSERT INTO biblioteca.documento (codigo, titulo, anho_publicacion, tipo_documento, disponible) VALUES ('2b3c4d', '1984', '1949', 'libro', '1');

-- INSERT REVISTAS
INSERT INTO `biblioteca`.`documento` (`codigo`, `titulo`, `anho_publicacion`, `tipo_documento`, `disponible`) VALUES ('34F513W', 'Magazine coches', '1988', 'REVISTA', '1');
INSERT INTO `biblioteca`.`documento` (`codigo`, `titulo`, `anho_publicacion`, `tipo_documento`, `disponible`) VALUES ('3G5434s', 'Tecnologias de la Informacion', '2020', 'REVISTA', '1');
INSERT INTO biblioteca.documento (codigo, titulo, anho_publicacion, tipo_documento, disponible) VALUES ('8j2k5f', 'National Geographic', '2021', 'revista', '1');
INSERT INTO biblioteca.documento (codigo, titulo, anho_publicacion, tipo_documento, disponible) VALUES ('1a9b3c', 'Vogue', '2022', 'revista', '1');
INSERT INTO biblioteca.documento (codigo, titulo, anho_publicacion, tipo_documento, disponible) VALUES ('7d4e6f', 'Time', '2023', 'revista', '1');
INSERT INTO biblioteca.documento (codigo, titulo, anho_publicacion, tipo_documento, disponible) VALUES ('5f6g7h', 'Scientific American', '2020', 'revista', '1');
INSERT INTO biblioteca.documento (codigo, titulo, anho_publicacion, tipo_documento, disponible) VALUES ('3h4i5j', 'Wired', '2019', 'revista', '1');

-- INSERT USUARIOS
INSERT INTO `biblioteca`.`usuario` (`dni`, `nombre`, `apellidos`, `tipo_usuario`) VALUES ('00000000t', 'Pepe', 'Navarro', 'OCASIONAL');
INSERT INTO `biblioteca`.`usuario` (`dni`, `nombre`, `apellidos`, `tipo_usuario`) VALUES ('44496125A', 'Ana', 'Gomez', 'SOCIO');
INSERT INTO biblioteca.usuario (dni, nombre, apellidos, tipo_usuario) VALUES ('12345678X', 'Carlos', 'Martínez', 'SOCIO');
INSERT INTO biblioteca.usuario (dni, nombre, apellidos, tipo_usuario) VALUES ('98765432Y', 'Laura', 'Rodríguez', 'OCASIONAL');
INSERT INTO biblioteca.usuario (dni, nombre, apellidos, tipo_usuario) VALUES ('56789012Z', 'Isabel', 'Fernández', 'SOCIO');
INSERT INTO biblioteca.usuario (dni, nombre, apellidos, tipo_usuario) VALUES ('11112222B', 'Pedro', 'López', 'OCASIONAL');
INSERT INTO biblioteca.usuario (dni, nombre, apellidos, tipo_usuario) VALUES ('33334444C', 'Sara', 'Pérez', 'SOCIO');
INSERT INTO biblioteca.usuario (dni, nombre, apellidos, tipo_usuario) VALUES ('55556666D', 'Javier', 'García', 'OCASIONAL');
INSERT INTO biblioteca.usuario (dni, nombre, apellidos, tipo_usuario) VALUES ('77778888E', 'Elena', 'Martín', 'SOCIO');
INSERT INTO biblioteca.usuario (dni, nombre, apellidos, tipo_usuario) VALUES ('99990000F', 'Antonio', 'Ruiz', 'OCASIONAL');

-- INSERT PRESTAMOS
INSERT INTO `biblioteca`.`prestamo` (`id_usuario`, `id_documento`, `fecha_prestamo`, `fecha_devolucion`, `devuelto`) VALUES ('4', '2', '2024-01-01', '2024-05-02', '0');
INSERT INTO `biblioteca`.`prestamo` (`id_usuario`, `id_documento`, `fecha_prestamo`, `fecha_devolucion`, `devuelto`) VALUES ('5', '3', '2024-01-01', '2024-05-02', '0');
INSERT INTO `biblioteca`.`prestamo` (`id_usuario`, `id_documento`, `fecha_prestamo`, `fecha_devolucion`, `devuelto`) VALUES ('6', '4', '2024-01-01', '2024-05-02', '0');
INSERT INTO `biblioteca`.`prestamo` (`id_usuario`, `id_documento`, `fecha_prestamo`, `fecha_devolucion`, `devuelto`) VALUES ('7', '5', '2024-01-01', '2024-05-02', '0');
INSERT INTO `biblioteca`.`prestamo` (`id_usuario`, `id_documento`, `fecha_prestamo`, `fecha_devolucion`, `devuelto`) VALUES ('8', '6', '2024-01-01', '2024-05-02', '0');