package masys.nachhaltigkeits_dashboard.controllers;

import masys.nachhaltigkeits_dashboard.repositories.BenutzerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/benutzer")
public class BenutzerController {
    @Autowired
    private BenutzerRepository benutzerRepository;

}
