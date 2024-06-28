package masys.nachhaltigkeits_dashboard.repositories;

import masys.nachhaltigkeits_dashboard.entities.BenutzerKpi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BenutzerKpiRepository extends JpaRepository<BenutzerKpi, Long> {
    List<BenutzerKpi> findByBenutzerId(Long benutzerId);
}
