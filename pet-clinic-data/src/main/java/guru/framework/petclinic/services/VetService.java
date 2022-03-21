package guru.framework.petclinic.services;

import guru.framework.petclinic.models.Vet;

import java.util.Set;

/**
 * @author zhenglu
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
