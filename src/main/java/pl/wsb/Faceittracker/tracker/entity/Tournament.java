package pl.wsb.faceittracker.tracker.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tournaments")
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private BigDecimal prizePool;
    private BigDecimal entryFee;
    private Integer maxTeams;
    private LocalDate startDate;

    public Tournament() {}

}