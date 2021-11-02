package com.usti.question;

import com.usti.question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/question")
    public String index(Model model) {
        model.addAttribute("question", questionService.findAll());
        return "question";
    }
}