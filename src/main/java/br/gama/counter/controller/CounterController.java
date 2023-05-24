package br.gama.counter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gama.counter.service.CounterService;

@RestController
@RequestMapping("/counter")
public class CounterController {

    @Autowired
    private CounterService service;

    @GetMapping
    public String getCounter() {
        return "Contador acessado = " + service.getCounter() + " vez(es)";
    }
}
