-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('kacper.pukienas@student.merito.pl',   'Kacper',   'USER',    current_timestamp),
    ('dorian.ziemba@student.merito.pl',  'Dorian',  'USER',    current_timestamp),
    ('wojtek.prabucki@student.merito.pl',       'Wojtek', 'USER', current_timestamp);

-- Tabela: players
INSERT INTO players (nickname, elo, faceit_level, country, steam_id) VALUES ('s1mple_pl', 2450, 10, 'PL', 'STEAM_0:1:11111');
INSERT INTO players (nickname, elo, faceit_level, country, steam_id) VALUES ('snax_fan', 1820, 8, 'PL', 'STEAM_0:1:22222');
INSERT INTO players (nickname, elo, faceit_level, country, steam_id) VALUES ('taz_junior', 1350, 5, 'PL', 'STEAM_0:1:33333');

-- Tabela: faceit_matches
INSERT INTO faceit_matches (match_code, map_name, score_teama, score_teamb, played_at) VALUES ('FACEIT-101', 'Mirage', 13, 9, '2026-11-10 18:30:00');
INSERT INTO faceit_matches (match_code, map_name, score_teama, score_teamb, played_at) VALUES ('FACEIT-102', 'Inferno', 11, 13, '2026-11-11 20:15:00');
INSERT INTO faceit_matches (match_code, map_name, score_teama, score_teamb, played_at) VALUES ('FACEIT-103', 'Nuke', 16, 14, '2026-11-12 21:00:00');

-- Tabela: tournaments
INSERT INTO tournaments (name, prize_pool, entry_fee, max_teams, start_date) VALUES ('Wrocław Open Cup', 5000.00, 50.00, 32, '2026-12-01');
INSERT INTO tournaments (name, prize_pool, entry_fee, max_teams, start_date) VALUES ('Weekend Faceit Night', 1000.00, 0.00, 16, '2026-12-05');
INSERT INTO tournaments (name, prize_pool, entry_fee, max_teams, start_date) VALUES ('Polish Pro Qualifier', 15000.00, 120.00, 64, '2026-12-15');