package net.at.spengergasse.springboot.controller;

import net.at.spengergasse.springboot.entity.Law;
import net.at.spengergasse.springboot.entity.Question;
import net.at.spengergasse.springboot.repository.LawsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173/")
public class LawController {


    @Autowired
    private LawsRepository lawsRepository;


    @GetMapping("/laws")
    public List<Law> fetchLaws(){
        return lawsRepository.findAll();
    }


    @DeleteMapping("/laws/{id}")
    public void deleteLawById(@PathVariable Long id) {
        System.out.println("Attempting to delete law with ID: " + id);
        lawsRepository.deleteById(id);
    }

    }


