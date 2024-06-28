package masys.nachhaltigkeits_dashboard.repositories;

import masys.nachhaltigkeits_dashboard.entities.Benutzer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenutzerRepository extends JpaRepository<Benutzer, Long> {
    public Benutzer findByUsername(String username);
}
