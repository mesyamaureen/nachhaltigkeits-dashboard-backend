package masys.nachhaltigkeits_dashboard.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
public class Organisatorisch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate datum;
    private String zeit;
    private Long dauer;
    private String transportweg;
    private String anlass;
    private Long energieverbrauch;
    private Long evTransportweg;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getDatum() { return datum; }
    public void setDatum(LocalDate datum) { this.datum = datum; }
    public String getZeit() { return zeit; }
    public void setZeit(String zeit) { this.zeit = zeit; }
    public Long getDauer() {
        return dauer;
    }
    public void setDauer(Long dauer) {
        this.dauer = dauer;
    }
    public String getTransportweg() { return transportweg; }
    public void setTransportweg(String transportweg) { this.transportweg = transportweg; }
    public String getAnlass() { return anlass; }
    public void setAnlass(String anlass) { this.anlass = anlass; }
    public Long getEnergieverbrauch() {
        return energieverbrauch;
    }
    public void setEnergieverbrauch(Long energieverbrauch) {
        this.energieverbrauch = energieverbrauch;
    }
    public Long getEvTransportweg() {
        return evTransportweg;
    }
    public void setEvTransportweg(Long evTransportweg) {
        this.evTransportweg = evTransportweg;
    }
}
