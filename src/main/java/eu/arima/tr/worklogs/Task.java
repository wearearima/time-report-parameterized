package eu.arima.tr.worklogs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import eu.arima.tr.model.BaseEntity;

@Entity
@Table(name = "tasks")
public class Task extends BaseEntity {
	
	private static final long serialVersionUID = 6528175782958457559L;
	
	@Column(unique = true)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
