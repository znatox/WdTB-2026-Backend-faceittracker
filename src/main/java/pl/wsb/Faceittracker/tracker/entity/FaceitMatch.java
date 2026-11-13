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

    private String mapName;
    private Integer scoreTeamA;
    private Integer scoreTeamB;
    private LocalDateTime playedAt;

    public FaceitMatch() {
    }
}