// PetRepository.java
package com.clinic.pet.repository;
import com.clinic.pet.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}