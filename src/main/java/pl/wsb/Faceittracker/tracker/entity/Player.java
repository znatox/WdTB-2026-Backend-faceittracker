package pl.wsb.faceittracker.tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nickname;

    private Integer elo;
    private Integer faceitLevel;
    private String country;
    private String steamId;

    public Player() {}

}