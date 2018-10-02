package telran.cars.dao;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.cars.entities.RecordJpa;

public interface RecordsRepository extends
JpaRepository<RecordJpa, Integer> {

	RecordJpa findByCarRegNumberAndReturnDateNull(String carNumber);

	List<RecordJpa> findByCarFlRemovedTrueAndReturnDateBefore(LocalDate dateDelete);

}
