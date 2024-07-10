package masys.nachhaltigkeits_dashboard.repositories;

import masys.nachhaltigkeits_dashboard.entities.Kpi;
import masys.nachhaltigkeits_dashboard.entities.Organisatorisch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisatorischRepository extends JpaRepository<Organisatorisch, Long> {}
