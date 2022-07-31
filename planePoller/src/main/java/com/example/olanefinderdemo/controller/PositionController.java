package com.example.olanefinderdemo.controller;

import com.example.olanefinderdemo.model.Aircraft;
import com.example.olanefinderdemo.repository.AircraftRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Controller
public class PositionController {
    @NonNull
    private final AircraftRepository repository;

    @GetMapping("/aircraft")
    public String getCurrentAircraftPosition(Model model) {
        model.addAttribute("currentPositions", repository.findAll());
        return "positions";
    }
}
