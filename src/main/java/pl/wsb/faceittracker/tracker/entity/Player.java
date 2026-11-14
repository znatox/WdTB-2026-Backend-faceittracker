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

    @Embedded
    private PlayerSocials socials;

    private Integer elo;
    private Integer faceitLevel;
    private String country;
    private String steamId;

    // Relacja 1:1 - gracz jest powiązany z kontem użytkownika
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private pl.wsb.faceittracker.account.domain.UserAccount account;

    // Relacja N:1 - wielu graczy należy do jednej drużyny
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    public Player() {}
}