package com.videovocabulary.backend.rest;

import com.videovocabulary.backend.model.Tvshow;
import com.videovocabulary.backend.repo.TvshowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tvshow")
public class TvshowController {

    @Autowired
    private TvshowRepository repository;

    @GetMapping
    List<Tvshow> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Tvshow findById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not find employee " + id));
    }

    @PostMapping
    Tvshow save(@RequestBody Tvshow tvshow) {
        return repository.save(tvshow);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
