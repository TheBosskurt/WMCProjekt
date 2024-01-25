package net.at.spengergasse.springboot.controller;

import net.at.spengergasse.springboot.entity.Audit;
import net.at.spengergasse.springboot.entity.Question;
import net.at.spengergasse.springboot.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:5173/")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/questions")
    public List<Question> fetchLaws() {
        return questionRepository.findAll();
    }
}
