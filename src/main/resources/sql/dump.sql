drop table characters;

create table characters (
    id int not null auto_increment,
    name varchar(128) not null,
    media varchar(128),
    franchise varchar(128),
    species varchar(128),
    alignment varchar(128),
    primary key (id)
);

insert into characters (name, media, franchise, species, alignment) values ('Gandalf', 'book', 'Lord of the Rings', 'Maia', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Gollum', 'book', 'Lord of the Rings', 'Maia', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Ripley', 'movie', 'Alien', 'Human', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Bishop', 'movie', 'Alien', 'Android', 'Unknown');
insert into characters (name, media, franchise, species, alignment) values ('David 8', 'movie', 'Alien', 'Android', 'Evil');
insert into characters (name, media, franchise, species, alignment) values ('Luke Skywalker', 'movie', 'Star Wars', 'Human', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Neo', 'movie', 'The Matrix', 'Human', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Tetsuo Shima', 'anime', 'Akira', 'Human', 'Evil');
insert into characters (name, media, franchise, species, alignment) values ('Kei', 'anime', 'Akira', 'Human', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('John Wick', 'movie', 'John Wick', 'Human', 'Anti-hero');
insert into characters (name, media, franchise, species, alignment) values ('Rocket Racoon', 'various', 'Guardians of the Galaxy', 'Raccoon', 'Anti-hero');
insert into characters (name, media, franchise, species, alignment) values ('Peter Jason Quill', 'various', 'Guardians of the Galaxy', 'Raccoon', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Cloud Strife', 'video game', 'Final Fantasy', 'Human', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Barret Wallace', 'video game', 'Final Fantasy', 'Human', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Rufus Shinra', 'video game', 'Final Fantasy', 'Human', 'Evil');
insert into characters (name, media, franchise, species, alignment) values ('Sephiroth', 'video game', 'Final Fantasy', 'Human', 'Evil');
insert into characters (name, media, franchise, species, alignment) values ('Spongebob Squarepants', 'cartoon', 'Spongebob Squarepants', 'Sponge', 'Good');
insert into characters (name, media, franchise, species, alignment) values ('Scott Pilgrim', 'comic', 'Scott Pilgrim', 'Human', 'Hero');
insert into characters (name, media, franchise, species, alignment) values ('Ramona Flowers', 'comic', 'Scott Pilgrim', 'Human', 'Hero');
insert into characters (name, media, franchise, species, alignment) values ('Kim Pine', 'comic', 'Scott Pilgrim', 'Human', 'Hero');
insert into characters (name, media, franchise, species, alignment) values ('Gideon Graves', 'comic', 'Scott Pilgrim', 'Human', 'Evil');
