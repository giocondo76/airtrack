package com.solution.airtrack.Repository;

import com.solution.airtrack.Models.Locations.Period;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PeriodRepository extends JpaRepository<Period, Integer> {
}
