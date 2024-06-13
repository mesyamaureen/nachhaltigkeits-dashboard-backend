package masys.nachhaltigkeits_dashboard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {
    @Autowired

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/")
    public String index(){ return "Dashboard"; }

}
