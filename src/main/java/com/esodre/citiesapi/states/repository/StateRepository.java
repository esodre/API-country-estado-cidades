package com.esodre.citiesapi.states.repository;

import com.esodre.citiesapi.states.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
