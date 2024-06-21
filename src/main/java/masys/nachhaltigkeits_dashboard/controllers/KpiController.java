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

    @PostMapping
    public Kpi createKpi(@RequestBody Kpi kpi){
        return kpiRepository.save(kpi);
    }

    @GetMapping
    public List<Kpi> getAllKpis(){
        return kpiRepository.findAll();
    }

    // Kennzahl: Ressourcen
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/ressourcen")
    public String getRessourcen(){ return "Ressourcen"; }

    // Kennzahl: CI/CD
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/pipeline")
    public String getPipeline(){ return "Pipeline"; }

    // Kennzahl: Code
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/code")
    public String getCode(){ return "Code"; }

    // Kennzahl: Büro
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/organisatorisch")
    public String getOrganisatorisch(){ return "Organisatorisch"; }
}
