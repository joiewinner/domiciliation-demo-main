package bj.dgb.finances.domiciliation.controllers;

import bj.dgb.finances.domiciliation.models.agent.Locality;
import bj.dgb.finances.domiciliation.payloads.requests.LocalityRequest;
import bj.dgb.finances.domiciliation.payloads.responses.LocalityResponse;
import bj.dgb.finances.domiciliation.services.LocalityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("locality")
@RequiredArgsConstructor
@Slf4j
public class LocalityController {

    private final LocalityService localityService;

    @GetMapping()
    public List<Locality> readAll(){
        log.info("Getting localities");
        return localityService.readAll();
    }

    @GetMapping("/{id}")
    public Locality readById(UUID id){
        return localityService.readById(id);
    }

    @PostMapping()
    public LocalityResponse create(LocalityRequest localityRequest){
        return localityService.create(localityRequest);
    }

    @PutMapping("/update/{id}")
    public Locality update(Long id, Locality locality){
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(UUID id){
        System.out.println("Suppression");
        localityService.delete(id);
    }
}
