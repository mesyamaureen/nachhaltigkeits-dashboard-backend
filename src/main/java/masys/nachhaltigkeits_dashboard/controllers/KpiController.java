package masys.nachhaltigkeits_dashboard.controllers;

import masys.nachhaltigkeits_dashboard.entities.Kpi;
import masys.nachhaltigkeits_dashboard.repositories.KpiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/kpis")
public class KpiController {
    @Autowired
    private KpiRepository kpiRepository;

    @PostMapping("/kpi")
    public Kpi createKpi(@RequestBody Kpi kpi){
        return kpiRepository.save(kpi);
    }

    @GetMapping
    public List<Kpi> getAllKpis(){
        return kpiRepository.findAll();
    }

    @GetMapping("/{kpiId}")
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
