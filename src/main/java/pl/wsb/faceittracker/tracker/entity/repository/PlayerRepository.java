package pl.wsb.faceittracker.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wsb.faceittracker.tracker.entity.Player;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByTeamName(String teamName);
}