# Schemat bazy danych

Plik generują reguły projektu (panel Maven → Lifecycle → verify). Nie edytujcie go ręcznie.

Tabele: 6 · kolumny: 39 · relacje: 4 × @ManyToOne, 1 × @OneToMany, 1 × @OneToOne, 0 × @ManyToMany

| Tabela | Encja | Kolumny | Klucze obce |
|---|---|---|---|
| faceit_matches | FaceitMatch | 7 | tournament_id |
| player_match_stats | PlayerMatchStat | 6 | match_id, player_id |
| players | Player | 10 | team_id, user_account_id |
| teams | Team | 5 | — |
| tournaments | Tournament | 6 | — |
| user_account | UserAccount | 5 | — |

```mermaid
erDiagram
    faceit_matches {
        Long id PK
        CsMap map_name
        String match_code
        LocalDateTime played_at
        Integer score_team_a
        Integer score_team_b
        Long tournament_id FK
    }
    player_match_stats {
        Long id PK
        Integer deaths
        Double headshot_percentage
        Integer kills
        Long match_id FK
        Long player_id FK
    }
    players {
        Long id PK
        String country
        String discord_tag
        Integer elo
        Integer faceit_level
        String nickname
        String steam_id
        Long team_id FK
        String twitch_url
        Long user_account_id FK
    }
    teams {
        Long id PK
        String name
        String region
        String tag
        Integer team_elo
    }
    tournaments {
        Long id PK
        BigDecimal entry_fee
        Integer max_teams
        String name
        BigDecimal prize_pool
        LocalDate start_date
    }
    user_account {
        Long id PK
        LocalDateTime created_at
        String display_name
        String email
        AccountRole role
    }
    faceit_matches ||--o{ player_match_stats : "match_id"
    players ||--o{ player_match_stats : "player_id"
    teams |o--o{ players : "team_id"
    tournaments |o--o{ faceit_matches : "tournament_id"
    user_account |o--o| players : "user_account_id"
```
