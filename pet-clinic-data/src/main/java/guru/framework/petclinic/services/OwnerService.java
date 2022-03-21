package guru.framework.petclinic.services;

import guru.framework.petclinic.models.Owner;

import java.util.Set;

/**
 * @author zhenglu
 */
public interface OwnerService {
    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
