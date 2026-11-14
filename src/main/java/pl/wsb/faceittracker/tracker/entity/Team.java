package pl.wsb.faceittracker.tracker.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String tag;
    private String region;
    private Integer teamElo;

    // Relacja 1:N - jedna drużyna ma wielu graczy ("team" to nazwa pola w klasie Player)
    @OneToMany(mappedBy = "team")
    private List<Player> players = new ArrayList<>();

    public Team() {}
}