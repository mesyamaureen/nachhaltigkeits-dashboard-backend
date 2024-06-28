package masys.nachhaltigkeits_dashboard.controllers;

import masys.nachhaltigkeits_dashboard.entities.Benutzer;
import masys.nachhaltigkeits_dashboard.entities.BenutzerKpi;
import masys.nachhaltigkeits_dashboard.entities.Kpi;
import masys.nachhaltigkeits_dashboard.repositories.BenutzerKpiRepository;
import masys.nachhaltigkeits_dashboard.repositories.BenutzerRepository;
import masys.nachhaltigkeits_dashboard.repositories.KpiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("api/benutzer")
public class BenutzerController {
    @Autowired
    private BenutzerRepository benutzerRepository;

    @Autowired
    private KpiRepository kpiRepository;

    @Autowired
    private BenutzerKpiRepository benutzerKpiRepository;

    @PostMapping("signup")
    public void signup(@RequestBody Benutzer benutzer) {
        benutzerRepository.save(benutzer);
    }

    @PostMapping("{id}/kpis")
    public void addKpiToBenutzer(@PathVariable Long id, @RequestBody Long kpiId) {
        Benutzer benutzer = benutzerRepository.findById(id).orElseThrow();
        Kpi kpi = kpiRepository.findById(kpiId).orElseThrow();
        BenutzerKpi benutzerKpi = new BenutzerKpi();
        benutzerKpi.setBenutzer(benutzer);
        benutzerKpi.setKpi(kpi);
        benutzerKpiRepository.save(benutzerKpi);
    }

    @DeleteMapping("{id}/kpis/{kpiId}")
    public void removeKpiFromBenutzer(@PathVariable Long id, @PathVariable Long kpiId) {
        BenutzerKpi benutzerKpi = benutzerKpiRepository.findByBenutzerId(id)
                .stream()
                .filter(bk -> bk.getKpi().getId().equals(kpiId))
                .findFirst()
                .orElseThrow();
        benutzerKpiRepository.delete(benutzerKpi);
    }

    @GetMapping("{id}/kpis")
    public List<Kpi> getBenutzerKpis(@PathVariable Long id) {
        List<BenutzerKpi> benutzerKpis = benutzerKpiRepository.findByBenutzerId(id);
        return benutzerKpis.stream().map(BenutzerKpi::getKpi).toList();
    }
}
