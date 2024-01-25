package net.at.spengergasse.springboot.controller;


import net.at.spengergasse.springboot.entity.Audit;
import net.at.spengergasse.springboot.entity.Law;
import net.at.spengergasse.springboot.repository.AuditsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173/")
public class AuditController {

    @Autowired
    private AuditsRepository auditsRepository;

    @GetMapping("/audits")
    public List<Audit> fetchLaws() {
        return auditsRepository.findAll();
    }
}
