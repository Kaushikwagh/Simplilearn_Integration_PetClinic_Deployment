// OwnerRepository.java
package org.springframework.samples.petclinic.owner;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

public interface OwnerRepository extends Repository<Owner, Integer> {

	@Query("SELECT DISTINCT owner FROM Owner owner left join fetch owner.pets WHERE owner.lastName LIKE :lastName%")
	List<Owner> findByLastName(@Param("lastName") String lastName);

	@Query("SELECT owner FROM Owner owner left join fetch owner.pets WHERE owner.id =:id")
	Owner findById(@Param("id") Integer id);

	void save(Owner owner);
}
