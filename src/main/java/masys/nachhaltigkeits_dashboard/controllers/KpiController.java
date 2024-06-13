package masys.nachhaltigkeits_dashboard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KpiController {
    @Autowired

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
