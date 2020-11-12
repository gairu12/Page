create sequence hibernate_sequence;

alter sequence hibernate_sequence owner to gairu;

create table usr
(
    id       serial  not null
        constraint usr_pk
            primary key,
    username text    not null,
    pswd     text    not null,
    active   boolean not null
);

alter table usr
    owner to gairu;

create table message
(
    id        serial not null
        constraint message_pk
            primary key,
    tag       text   not null,
    content   text,
    author_id bigint
        constraint message_author_key
            references usr
);

alter table message
    owner to gairu;

create table user_role
(
    user_id serial not null
        constraint user_role_pk
            primary key
        constraint user_role_user_id_key
            references usr,
    roles   text   not null
);

alter table user_role
    owner to gairu;

