package masys.nachhaltigkeits_dashboard.controllers;

import masys.nachhaltigkeits_dashboard.entities.Kpi;
import masys.nachhaltigkeits_dashboard.repositories.KpiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @RequestMapping("/kpis")

public class KpiController {
    @Autowired
    private KpiRepository kpiRepository;

    @PostMapping("/kpi")
    @CrossOrigin(origins = "https://nachhaltigkeits-dashboard-frontend.onrender.com")
    public Kpi createKpi(@RequestBody Kpi kpi){
        return kpiRepository.save(kpi);
    }

    @GetMapping("/kpis")
    @CrossOrigin(origins = "https://nachhaltigkeits-dashboard-frontend.onrender.com")
    public List<Kpi> getAllKpis(){
        return kpiRepository.findAll();
    }

    @GetMapping("/kpis/{kpiId}")
    @CrossOrigin(origins = "https://nachhaltigkeits-dashboard-frontend.onrender.com")
    public Kpi getKpi(@PathVariable Long kpiId){
        return kpiRepository.findById(kpiId).orElseThrow();
    }


/**
    @PutMapping("/{kpiId}")
    public Kpi updateKpi(@PathVariable Long kpiId, @RequestBody Kpi kpiDetails){
        Kpi kpi = kpiRepository.findById(kpiId).orElseThrow();
        kpi.setName(kpiDetails.getName());
        kpi.setco2(kpiDetails.getco2());
        return kpiRepository.save(kpi);
    }

    @DeleteMapping("/{kpiId}")
    public void deleteKpi(@PathVariable Long kpiId){
        Kpi kpi = kpiRepository.findById(kpiId).orElseThrow();
        kpiRepository.delete(kpi);
    }
    */
}
