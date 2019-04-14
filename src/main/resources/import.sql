insert into cidade (id, nome, latitude, longitude) values (1, 'Rio de janeiro',  -22.9035, -43.2096);
insert into cidade (id, nome, latitude, longitude) values (2, 'Minas Gerais',  -18.5122, -44.555);
insert into cidade (id, nome, latitude, longitude) values (3, 'Parana',  -25.4284, -49.2733);

insert into dia_semana (id, nome) values (1, 'Domingo');
insert into dia_semana (id, nome) values (2, 'Segunda-feira');
insert into dia_semana (id, nome) values (3, 'Terça-feira');
insert into dia_semana (id, nome) values (4, 'Quarta-feira');
insert into dia_semana (id, nome) values (5, 'Quinta-feira');
insert into dia_semana (id, nome) values (6, 'Sexta-feira');
insert into dia_semana (id, nome) values (7, 'Sabado');

insert into previsao (id, id_dia_semana, temperatura_minima, temperatura_maxima, humidade_relativa, descricao, id_cidade) values (1, 7, 30.0, 40.0,20.0,'Sol com muitas nuvens. Pancadas de chuva à tarde e à noite', 3);

insert into previsao (id, id_dia_semana, temperatura_minima, temperatura_maxima, humidade_relativa, descricao, id_cidade) values (2, 2, 19.0, 22.0,40.0,'Sol e aumento de nuvens de manhã. Pancadas de chuva à tarde e à noite.', 1);

insert into previsao (id, id_dia_semana, temperatura_minima, temperatura_maxima, humidade_relativa, descricao, id_cidade) values (3, 3, 17.0, 26.0,80.0,'Sol com muitas nuvens durante o dia. Períodos de nublado, com chuva a qualquer hora.', 2);

insert into previsao (id, id_dia_semana, temperatura_minima, temperatura_maxima, humidade_relativa, descricao, id_cidade) values (4,4, 15.0, 30.0,90.0,'Chuvoso durante o dia e à noite.', 3);

insert into usuario (id, login, senha) values (1, 'admin','admin');