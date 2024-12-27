// Pet.java
package com.clinic.pet.model;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String species;
    private int age;
    
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
}