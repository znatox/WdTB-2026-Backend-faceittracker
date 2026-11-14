package pl.wsb.faceittracker.tracker.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "faceit_matches")
public class FaceitMatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String matchCode;

    @Enumerated(EnumType.STRING)
    private CsMap mapName;

    private Integer scoreTeamA;
    private Integer scoreTeamB;
    private LocalDateTime playedAt;

    // Relacja N:1 - wiele meczów należy do jednego turnieju
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_id")
    private pl.wsb.faceittracker.tracker.entity.Tournament tournament;

    public FaceitMatch() {}
}