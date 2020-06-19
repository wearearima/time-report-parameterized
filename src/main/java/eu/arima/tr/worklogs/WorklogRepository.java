package eu.arima.tr.worklogs;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface WorklogRepository extends Repository<Worklog, Integer> {

	@Query("SELECT DISTINCT wl FROM Worklog wl WHERE wl.worker.userName = :workerUserName AND wl.day = :date")
	@Transactional(readOnly = true)
	List<Worklog> findByUsernameAndDate(String workerUserName, LocalDate date);

}
