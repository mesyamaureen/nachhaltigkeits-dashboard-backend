package masys.nachhaltigkeits_dashboard.service;

import masys.nachhaltigkeits_dashboard.entities.Kpi;
import masys.nachhaltigkeits_dashboard.entities.Organisatorisch;
import masys.nachhaltigkeits_dashboard.repositories.KpiRepository;
import masys.nachhaltigkeits_dashboard.repositories.OrganisatorischRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisatorischService {
    @Autowired
    private OrganisatorischRepository organisatorischRepository;

    public Organisatorisch save(Organisatorisch organisatorisch) {
        return organisatorischRepository.save(organisatorisch);
    }

    public Organisatorisch get(Long id) {
        return organisatorischRepository.findById(id).orElseThrow(() -> new RuntimeException());
    }

    public List<Organisatorisch> getAllOrganisatorische() {
        return organisatorischRepository.findAll();
    }


}
