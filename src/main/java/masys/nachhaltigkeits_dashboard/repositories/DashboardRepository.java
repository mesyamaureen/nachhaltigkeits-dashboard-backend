package masys.nachhaltigkeits_dashboard.repositories;

import masys.nachhaltigkeits_dashboard.entities.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepository extends JpaRepository<Dashboard, Long> {}
