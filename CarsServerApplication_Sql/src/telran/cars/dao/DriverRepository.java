package telran.cars.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.cars.entities.DriverJpa;

public interface DriverRepository extends
JpaRepository<DriverJpa, Long> {

	

}
