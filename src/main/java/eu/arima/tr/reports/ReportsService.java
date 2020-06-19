package eu.arima.tr.reports;

import java.time.LocalDate;

public interface ReportsService {

	/**
	 * Checks all worklogs for worker and date and calculates the status based on
	 * worked time, starting/ending work hours and worklog overlapping
	 * 
	 * @param workerUserName Workers username
	 * @param date           Date
	 * @return Status summary after checking all worker's worklogs for a date
	 */
	DayStatusSummary getDayStatusSummaryForWorkerAndDay(String workerUserName, LocalDate date);

}
