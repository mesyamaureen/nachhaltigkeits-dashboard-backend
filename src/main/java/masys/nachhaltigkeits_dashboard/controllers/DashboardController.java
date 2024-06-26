package masys.nachhaltigkeits_dashboard.controllers;

import masys.nachhaltigkeits_dashboard.entities.Dashboard;
import masys.nachhaltigkeits_dashboard.entities.Kpi;
import masys.nachhaltigkeits_dashboard.repositories.BenutzerRepository;
import masys.nachhaltigkeits_dashboard.repositories.DashboardRepository;
import masys.nachhaltigkeits_dashboard.repositories.KpiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

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
    public Dashboard createDashboard(@RequestBody Dashboard dashboard, Principal principal) {
        dashboard.setBenutzer(benutzerRepository.findByUsername(principal.getName()));
        return dashboardRepository.save(dashboard);
    }

    @PostMapping("kpi/{dashboardID}")
    public Dashboard addKpiToDashboard(@PathVariable Long dashboardID, @RequestBody Long kpiId) {
        Dashboard dashboard = dashboardRepository.findById(dashboardID).orElseThrow();
        Kpi kpi = kpiRepository.findById(kpiId).orElseThrow();
        dashboard.getKpis().add(kpi);
        return dashboardRepository.save(dashboard);
    }

    @DeleteMapping("kpi/{dashboardID}")
    public void removeKpiFromDashboard(@PathVariable Long dashboardID, @PathVariable Long kpiId) {
        Dashboard dashboard = dashboardRepository.findById(dashboardID).orElseThrow();
        dashboard.getKpis().removeIf(kpi -> kpi.getId().equals(kpiId));
        dashboardRepository.save(dashboard);
    }

    @GetMapping("/{dashboardID}")
    public Dashboard getDashboard(@PathVariable Long dashboardID) {
        return dashboardRepository.findById(dashboardID).orElseThrow();
    }

    @GetMapping
    public List<Dashboard> getAllDashboards() {
        return dashboardRepository.findAll();
    }
}
