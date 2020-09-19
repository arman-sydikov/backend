package com.videovocabulary.backend.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class WordController {

    @GetMapping("/{word}")
    public String getWord(@PathVariable("word") String word) {
        return "Can't find word " + word;
    }
}
