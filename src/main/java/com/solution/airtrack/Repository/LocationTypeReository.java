package com.solution.airtrack.Repository;

import com.solution.airtrack.Models.Locations.LocationType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationTypeReository  extends JpaRepository<LocationType, Integer> {
}
