-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('kacper.pukienas@student.merito.pl',   'Kacper',   'USER',    current_timestamp),
    ('dorian.ziemba@student.merito.pl',  'Dorian',  'USER',    current_timestamp),
    ('wojtek.prabucki@student.merito.pl',       'Wojtek', 'USER', current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);

-- Tabela: player_profile
INSERT INTO player_profile (nickname, current_elo, skill_level, region) VALUES ('s1mple', 3500, 10, 'EU');
INSERT INTO player_profile (nickname, current_elo, skill_level, region) VALUES ('ZywOo', 3450, 10, 'EU');
INSERT INTO player_profile (nickname, current_elo, skill_level, region) VALUES ('Stewie2K', 2800, 10, 'NA');

-- Tabela: match_performance
INSERT INTO match_performance (match_id, map_name, rounds_played, kills, deaths) VALUES ('match_uuid_1', 'de_mirage', 24, 25, 12);
INSERT INTO match_performance (match_id, map_name, rounds_played, kills, deaths) VALUES ('match_uuid_2', 'de_inferno', 30, 30, 20);
INSERT INTO match_performance (match_id, map_name, rounds_played, kills, deaths) VALUES ('match_uuid_3', 'de_nuke', 16, 10, 15);

-- Tabela: premium_subscription
INSERT INTO premium_subscription (plan_name, price, duration_months, is_active) VALUES ('FACEIT Premium', 9.99, 1, true);
INSERT INTO premium_subscription (plan_name, price, duration_months, is_active) VALUES ('FACEIT Plus', 5.99, 1, true);
INSERT INTO premium_subscription (plan_name, price, duration_months, is_active) VALUES ('Yearly Premium', 99.99, 12, false);