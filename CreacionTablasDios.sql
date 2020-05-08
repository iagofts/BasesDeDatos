create sequence seq_us_id_usuario;
create table usuario( 
    id_usuario integer default nextval('seq_us_id_usuario') not null primary key,
    nombre_usuario varchar(15) not null unique,
    nombre varchar(50) not null,
    clave varchar(10) not null,
    tipo varchar(15) Default 'Mortal' CHECK (tipo IN ('Mortal', 'Dios'))
);


create table mortal(
    id_mortal integer default currval('seq_us_id_usuario') not null primary key,
    fecha_nacimiento timestamp not null,
    fecha_muerte timestamp not null,
    lugar varchar(10) Default 'Tierra' CHECK (lugar IN ('Tierra', 'Cielo', 'Infierno', 'Limbo')),
    
    foreign key(id_mortal) references usuario(id_usuario)
    on delete cascade on update cascade
);

create table angel(
    id integer default currval('seq_us_id_usuario') not null primary key,
    foreign key (id) references mortal(id_mortal)
    on delete cascade on update cascade
);
create table demonio(
    id integer default currval('seq_us_id_usuario') not null primary key,
    foreign key (id) references mortal(id_mortal)
    on delete cascade on update cascade
);
create table vivo(
    id_vivo integer default currval('seq_us_id_usuario') not null primary key,
    ang_asignado integer not null,
    dem_asignado integer not null,
    puntuacion float not null Default 0,
    pendiente_juicio boolean Default FALSE,
    limbo_obligatorio boolean Default FALSE,
    localidad varchar(30),
    foreign key(id_vivo) references mortal(id_mortal)
    on delete cascade on update cascade,
    foreign key(ang_asignado) references angel(id)
    on delete restrict on update cascade,
    foreign key(dem_asignado) references demonio(id)
    on delete restrict on update cascade
);

create sequence seq_pecado_tipo_pecado;
create table tipoPecado(
    tipo_pecado integer default nextval ('seq_pecado_tipo_pecado') not null primary key,
    gravedad float not null,
    descrip_pecado varchar(200)
);
create sequence seq_BA_tipo_accion;
create table tipoBA(
    tipo_accion integer default nextval('seq_BA_tipo_accion') not null primary key,
    puntuacion float not null,
    descrip_accion varchar(200)
);
create table pecado(
    fecha_hora timestamp not null,
   confesado boolean Default 'FALSE',
confesion_solicitada boolean Default 'FALSE',
    usuario integer not null,
    tipo_pecado integer not null,
  
    primary key(fecha_hora, usuario),
    foreign key(usuario) references vivo(id_vivo)
     on delete cascade on update cascade,
    foreign key (tipo_pecado) references tipoPecado(tipo_pecado)
     on delete restrict on update cascade
);
create table buenaAccion(
    fecha_hora timestamp not null,
    usuario integer not null,
    tipo_accion integer not null,
    
    primary key(fecha_hora, usuario),
    foreign key(usuario) references vivo(id_vivo)
     on delete cascade on update cascade,
    foreign key(tipo_accion) references tipoBA(tipo_accion)
     on delete restrict on update cascade
);
create sequence seq_venganza_nivel;
create table venganza(
    nivel integer default nextval('seq_venganza_nivel') not null primary key,
    consecuencia varchar(300) not null
);

create table solicitar(
    fecha_solicitud timestamp not null,
    solicitante integer not null,
    victima integer not null,
    venganza integer not null,
    demonio integer not null,
    
    primary key(fecha_solicitud, solicitante, victima, venganza),
    foreign key(solicitante) references vivo(id_vivo)
     on delete cascade on update cascade,
    foreign key(victima) references vivo(id_vivo)
     on delete cascade on update cascade,
    foreign key(venganza) references venganza(nivel)
     on delete cascade on update cascade,
    foreign key(demonio) references demonio(id)
     on delete cascade on update cascade
);

 
