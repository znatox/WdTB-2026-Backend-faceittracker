package pl.wsb.faceittracker.tracker.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "player_match_stats")
public class PlayerMatchStat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "match_id", nullable = false)
    private FaceitMatch match;

    @Column(nullable = false)
    private Integer kills;

    private Integer deaths;
    private Double headshotPercentage;

    public PlayerMatchStat() {}
}