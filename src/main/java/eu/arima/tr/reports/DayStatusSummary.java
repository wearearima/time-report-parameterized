package eu.arima.tr.reports;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DayStatusSummary {

	private final LocalDate date;
	private final String workerUserName;
	private final List<DayStatus> statusList = new ArrayList<>();

	public DayStatusSummary(LocalDate date, String workerUserName) {
		this.date = date;
		this.workerUserName = workerUserName;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getWorkerUserName() {
		return workerUserName;
	}

	public List<DayStatus> getStatusList() {
		return Collections.unmodifiableList(statusList);
	}

	public void addDayStatus(DayStatus dayStatus) {
		this.statusList.add(dayStatus);
	}

}
