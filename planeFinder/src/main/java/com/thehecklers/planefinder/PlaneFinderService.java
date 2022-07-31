package com.thehecklers.planefinder;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PlaneFinderService {
    private final PlaneRepository repo;

    @SneakyThrows
    public PlaneFinderService(PlaneRepository repo) {
        this.repo = repo;
    }

    public Iterable<Aircraft> getAircraft() throws IOException {
        return saveSamplePositions();
    }

    private Iterable<Aircraft> saveSamplePositions() {
        repo.deleteAll();

        var ac1 = new Aircraft("SAL001", "N12345", "SAL001", "LJ",
                30000, 280, 440,
                39.2979849, -94.71921);
        var ac2 = new Aircraft("SAL002", "N54321", "SAL002", "LJ",
                40000, 65, 440,
                39.8560963, -104.6759263);
        var ac3 = new Aircraft("SAL002", "N54321", "SAL002", "LJ",
                40000, 65, 440,
                39.8412964, -105.0048267);

        return repo.saveAll(List.of(ac1, ac2, ac3));
    }
}

