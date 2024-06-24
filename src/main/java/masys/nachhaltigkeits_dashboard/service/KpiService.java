// src/main/java/com/example/demo/service/KennzahlService.java
package masys.nachhaltigkeits_dashboard.service;

import masys.nachhaltigkeits_dashboard.entities.Kpi;
import masys.nachhaltigkeits_dashboard.repositories.KpiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KpiService {
    @Autowired
    private KpiRepository kpiRepository;

    public List<Kpi> getAllKennzahlen() {
        return kpiRepository.findAll();
    }
}
