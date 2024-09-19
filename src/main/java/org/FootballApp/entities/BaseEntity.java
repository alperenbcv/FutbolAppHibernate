package org.FootballApp.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@MappedSuperclass
public abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	@ColumnDefault("1")
	public  Integer state;
	@ColumnDefault("CURRENT_DATE")
	public LocalDate createdAt;
	@ColumnDefault("CURRENT_DATE")
	public LocalDate updatedAt;
	
	public BaseEntity() {
	}
	
	public int getId() {
		return id;
	}
	
	
}