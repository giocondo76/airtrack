package com.solution.airtrack.Repository;

import com.solution.airtrack.Models.Devices.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
