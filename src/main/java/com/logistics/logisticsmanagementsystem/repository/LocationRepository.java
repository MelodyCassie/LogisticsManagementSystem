package com.logistics.logisticsmanagementsystem.repository;

import com.logistics.logisticsmanagementsystem.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
