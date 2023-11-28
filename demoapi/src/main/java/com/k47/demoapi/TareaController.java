package com.k47.demoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TareaController {

    private final TareaRepository tareaRepository;

    public TareaController(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }
    @GetMapping("/api/tareas")
    public Iterable<Tarea> listar(){
        return tareaRepository.findAll();
    }
}
