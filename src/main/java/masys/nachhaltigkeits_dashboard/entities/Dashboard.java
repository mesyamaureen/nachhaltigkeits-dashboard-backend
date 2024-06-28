package masys.nachhaltigkeits_dashboard.entities;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Dashboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "dashboard_kpi",
            joinColumns = @JoinColumn(name = "dashboard_id"),
            inverseJoinColumns = @JoinColumn(name = "kpi_id"))
    private Set<Kpi> kpis = new HashSet<>();

    @ManyToOne
    private Benutzer benutzer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    public List<Kpi> getKpis() {
        return (List<Kpi>) kpis;
    }

    public void setKpis(List<Kpi> kpis) {
        this.kpis = (Set<Kpi>) kpis;
    }
}
