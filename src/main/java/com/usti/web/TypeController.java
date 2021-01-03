package com.usti.web;

import com.usti.service.TypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class TypeController {
    private final TypeService typeService;

    @GetMapping("/result/{tid}")
    public String findByTid(@PathVariable int tid, Model model) {
        model.addAttribute("type", typeService.findByTid(tid));
        return "result";
    }
}