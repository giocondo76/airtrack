package com.solution.airtrack.Repository;

import com.solution.airtrack.Models.Locations.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository  extends JpaRepository<Location, Integer> {
}

