package com.solution.airtrack.Repository;
import com.solution.airtrack.Models.Devices.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceTypeRepository extends JpaRepository<DeviceType, Integer> {
}
