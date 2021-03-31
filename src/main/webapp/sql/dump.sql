create table characters (
    id int not null,
    name varchar(128) not null,
    media varchar(128),
    franchise varchar(128),
    species varchar(128),
    alignment varchar(128),
    primary key (id)
);

insert into characters (name, media, franchise, species, alignment) values ('Gandalf', 'book', 'Lord of the Rings', 'Maia', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Ripley', 'movie', 'Alien', 'Human', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Luke Skywalker', 'movie', 'Star Wars', 'Human', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Neo', 'movie', 'The Matrix', 'Human', 'Good');