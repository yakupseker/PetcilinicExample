package com.javaegitimleri.petclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class PetClinicConfiguraiton {
    @Autowired
    private PetClinicProperties petClinicProperties;

    @PostConstruct
    public void init() {
        System.out.println("Display owners with pets :" + petClinicProperties.isDisplayOwnersWithPets());

    }
}
