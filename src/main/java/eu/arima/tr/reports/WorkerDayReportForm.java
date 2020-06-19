package eu.arima.tr.reports;

import java.time.LocalDate;

public class WorkerDayReportForm {

	private String workerUserName;

	private LocalDate date = LocalDate.now();

	public String getWorkerUserName() {
		return workerUserName;
	}

	public void setWorkerUserName(String workerUserName) {
		this.workerUserName = workerUserName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
