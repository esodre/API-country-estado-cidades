package com.esodre.citiesapi.countries.repository;

import com.esodre.citiesapi.countries.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
