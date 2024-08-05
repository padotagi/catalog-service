package com.poloarbookshop.catalogservice;

import com.poloarbookshop.catalogservice.config.PolarProperties;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    private final PolarProperties polarProperties;

    public HomeController(PolarProperties polarProperties) {
        this.polarProperties = polarProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        return polarProperties.getGreeting();
    }
}
