package masys.nachhaltigkeits_dashboard.controllers;

import masys.nachhaltigkeits_dashboard.entities.Dashboard;
import masys.nachhaltigkeits_dashboard.entities.Kpi;
import masys.nachhaltigkeits_dashboard.repositories.BenutzerRepository;
import masys.nachhaltigkeits_dashboard.repositories.DashboardRepository;
import masys.nachhaltigkeits_dashboard.repositories.KpiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("api/dashboards")
public class DashboardController {

    @Autowired
    private DashboardRepository dashboardRepository;

    @Autowired
    private KpiRepository kpiRepository;

    @Autowired
    private BenutzerRepository benutzerRepository;

    @PostMapping
    public Dashboard createDashboard(@RequestBody Dashboard dashboard , Principal principal) {
        dashboard.setBenutzer(benutzerRepository.findByUsername(principal.getName()));
        return dashboardRepository.save(dashboard);
    }

    @PostMapping("/{dashboardID}/kpis")
    public Dashboard addKpiToDashboard(@PathVariable Long dashboardID, @RequestBody Long kpiId) {
        Dashboard dashboard = dashboardRepository.findById(dashboardID).orElseThrow();
        Kpi kpi = kpiRepository.findById(kpiId).orElseThrow();
        dashboard.getKpis().add(kpi);
        return dashboardRepository.save(dashboard);
    }

    @Autowired

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/")
    public String index(){ return "Dashboard"; }

}
