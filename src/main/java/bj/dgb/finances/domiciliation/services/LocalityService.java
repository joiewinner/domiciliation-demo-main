package bj.dgb.finances.domiciliation.services;

import bj.dgb.finances.domiciliation.convertors.LocalityConvertor;
import bj.dgb.finances.domiciliation.models.agent.Locality;
import bj.dgb.finances.domiciliation.payloads.requests.LocalityRequest;
import bj.dgb.finances.domiciliation.payloads.responses.LocalityResponse;
import bj.dgb.finances.domiciliation.repositories.LocalityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class LocalityService {

    private final LocalityRepository localityRepository;

    private  final LocalityConvertor localityConvertor;

    public List<Locality> readAll() {
        log.info("Getting localities");
        return localityRepository.findAll();
    }

    public Locality readById(UUID id) {
        Optional<Locality> locality = localityRepository.findById(id);
        return locality.get();
    }

    public LocalityResponse create(LocalityRequest localityRequest) {
        Locality locality = localityConvertor.convert(localityRequest);
        locality = localityRepository.save(locality);
        log.info("Enregistrement effectue");
        return localityConvertor.convert(locality);
    }

    public Locality update(Long id, Locality locality) {
        return null;
    }

    public void delete(UUID id) {
        log.info("Suppression");
        localityRepository.deleteById(id);
        log.info("Suppression effectuee");
    }
}
