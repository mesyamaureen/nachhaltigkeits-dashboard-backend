package masys.nachhaltigkeits_dashboard.controllers;

import masys.nachhaltigkeits_dashboard.entities.Kpi;
import masys.nachhaltigkeits_dashboard.entities.Organisatorisch;
import masys.nachhaltigkeits_dashboard.repositories.KpiRepository;
import masys.nachhaltigkeits_dashboard.repositories.OrganisatorischRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @RequestMapping("organisatorisch")
public class OrganisatorischController {
    @Autowired
    private OrganisatorischRepository organisatorischRepository;

    @PostMapping("/neu-metrik-organisatorisch")
    public Organisatorisch createOrganisatorisch(@RequestBody Organisatorisch organisatorisch){
        return organisatorischRepository.save(organisatorisch);
    }

    @GetMapping("/organisatorisch")
    public List<Organisatorisch> getAllOrganisatorische(){
        return organisatorischRepository.findAll();
    }

    @GetMapping("/organisatorisch/{organisatorisch-metrik-id}")
    public Organisatorisch getOrganisatorisch(@PathVariable Long organisatorischMetrikId){
        return organisatorischRepository.findById(organisatorischMetrikId).orElseThrow();
    }
}
