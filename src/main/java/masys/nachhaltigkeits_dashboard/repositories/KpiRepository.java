package masys.nachhaltigkeits_dashboard.repositories;

import masys.nachhaltigkeits_dashboard.entities.Kpi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KpiRepository extends JpaRepository<Kpi, Long> {}
