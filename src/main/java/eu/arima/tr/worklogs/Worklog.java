package eu.arima.tr.worklogs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import eu.arima.tr.model.BaseEntity;

@Entity
@Table(name = "worklogs")
public class Worklog extends BaseEntity {

	private static final long serialVersionUID = 2483864014759067247L;

	@ManyToOne
	@JoinColumn(name = "worker_id")
	private Worker worker;
	@ManyToOne
	@JoinColumn(name = "task_id")
	private Task task;
	@Column
	private LocalDate day;
	@Column
	private LocalTime fromTime;
	@Column
	private LocalTime toTime;
	@Column
	private String description;

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	public LocalTime getFromTime() {
		return fromTime;
	}

	public void setFromTime(LocalTime fromTime) {
		this.fromTime = fromTime;
	}

	public LocalTime getToTime() {
		return toTime;
	}

	public void setToTime(LocalTime toTime) {
		this.toTime = toTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return (int) fromTime.until(toTime, ChronoUnit.HOURS);
	}

}
