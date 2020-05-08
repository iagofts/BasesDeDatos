Insert into tipoPecado (gravedad, descrip_pecado) values (0.5,'Mentir');
Insert into tipoPecado (gravedad, descrip_pecado) values (1.5,'Usar la violencia');
Insert into tipoPecado (gravedad, descrip_pecado) values (1.2,'Robar');
Insert into tipoPecado (gravedad, descrip_pecado) values (3.6,'Asesinar');

Insert into tipoBA (puntuacion, descrip_accion) values (1.8,'Realizar voluntariado');
Insert into tipoBA (puntuacion, descrip_accion) values (0.4,'Ayudar a una persona mayor');

Insert into venganza (consecuencia) values ('Reducir fecha de muerte');
Insert into venganza (consecuencia) values ('Reducir puntuación');
Insert into venganza (consecuencia) values ('Limbo obligatorio');

Insert into usuario (nombre_usuario,nombre,clave,tipo) values ('yisus','Jesús de Nazaret','yis251201','Dios');
Insert into usuario (nombre_usuario,nombre,clave,tipo) values ('budalord','Siddharta Gautama','tibet123','Dios');

Insert into usuario (nombre_usuario,nombre,clave,tipo) values ('mikemike','Mike Philips','mk400','Mortal');
Insert into mortal (fecha_nacimiento,fecha_muerte,lugar) values ('03/05/1935','11/11/2011','Infierno');
Insert into demonio (id) values ((select id_usuario from usuario where nombre_usuario='mikemike'));

Insert into usuario (nombre_usuario,nombre,clave,tipo) values ('john122','John Naickel','jhn','Mortal');
Insert into mortal (fecha_nacimiento,fecha_muerte,lugar) values ('14/08/1943','23/01/1999','Cielo');
Insert into angel (id) values ((select id_usuario from usuario where nombre_usuario='john122'));

Insert into usuario (nombre_usuario,nombre,clave,tipo) values ('neut23','Elneu Tral','nn00','Mortal');
Insert into mortal (fecha_nacimiento,fecha_muerte,lugar) values ('16/07/1952','05/06/2003','Limbo');
Insert into vivo (ang_asignado,dem_asignado) values ((select id_usuario from usuario where nombre_usuario='john122'),(select id_usuario from usuario where nombre_usuario='mikemike'));

Insert into usuario (nombre_usuario,nombre,clave,tipo) values ('casib40','Casib Ueno','cbcb','Mortal');
Insert into mortal (fecha_nacimiento,fecha_muerte,lugar) values ('02/10/1964','28/08/2005','Cielo');
Insert into angel (id) values ((select id_usuario from usuario where nombre_usuario='casib40'));

Insert into usuario (nombre_usuario,nombre,clave,tipo) values ('traps3','Elli Ante','ell333','Mortal');
Insert into mortal (fecha_nacimiento,fecha_muerte,lugar) values ('01/12/1915','30/11/2015','Infierno');
Insert into demonio (id) values ((select id_usuario from usuario where nombre_usuario='traps3'));

Insert into usuario (nombre_usuario,nombre,clave,tipo) values ('peterpark','Peter Parker','peet','Mortal');
Insert into mortal (fecha_nacimiento,fecha_muerte,lugar) values ('12/01/1980','11/11/2025','Tierra');
Insert into vivo (ang_asignado,dem_asignado) values ((select id_usuario from usuario where nombre_usuario='john122'),(select id_usuario from usuario where nombre_usuario='mikemike'));

Insert into pecado (fecha_hora,tipo_pecado,usuario) values ('10/10/2019',1,(select id_usuario from usuario where nombre_usuario='peterpark'));
Insert into buenaAccion(fecha_hora,tipo_accion,usuario) values ('14/03/1995',2,(select id_usuario from usuario where nombre_usuario='peterpark'));
Insert into buenaAccion(fecha_hora,tipo_accion,usuario) values ('02/05/1998',1,(select id_usuario from usuario where nombre_usuario='peterpark'));

Insert into usuario (nombre_usuario,nombre,clave,tipo) values ('luckyluck','Luck Davis','ll777','Mortal');
Insert into mortal (fecha_nacimiento,fecha_muerte,lugar) values ('23/02/1967','25/02/2020','Tierra');
Insert into vivo (ang_asignado,dem_asignado) values ((select id_usuario from usuario where nombre_usuario='john122'),(select id_usuario from usuario where nombre_usuario='mikemike'));
Insert into pecado (fecha_hora,tipo_pecado,usuario) values ('24/12/1999',2,(select id_usuario from usuario where nombre_usuario='luckyluck'));
Insert into pecado (fecha_hora,tipo_pecado,usuario) values ('25/12/1999',3,(select id_usuario from usuario where nombre_usuario='luckyluck'));
Insert into solicitar (fecha_solicitud,solicitante,victima,venganza,demonio) values ('26/12/1999',(select id_usuario from usuario where nombre_usuario='luckyluck'),(select id_usuario from usuario where nombre_usuario='peterpark'),2,(select id_usuario from usuario where nombre_usuario='mikemike'));