package com.videovocabulary.backend.rest;

import com.videovocabulary.backend.model.Tvshow;
import com.videovocabulary.backend.repo.TvshowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tvshow")
public class TvshowController {

    @Autowired
    private TvshowRepository tvshowRepository;

    @GetMapping
    public Iterable<Tvshow> getTvshows() {
        return tvshowRepository.findAll();
    }
}
