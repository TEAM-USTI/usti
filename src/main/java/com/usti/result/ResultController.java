package com.usti.result;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
public class ResultController {
    private final ResultService resultService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("count", resultService.count());
        return "index";
    }

    @PostMapping("/result")
    public String save(@RequestBody Result result) {
        resultService.save(result);
        return "question";
    }
}