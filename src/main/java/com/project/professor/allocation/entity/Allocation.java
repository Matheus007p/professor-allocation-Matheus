package com.project.professor.allocation.entity;

import java.time.DayOfWeek;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Allocation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	
	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false, unique = false)
	private DayOfWeek dayofweek;
	
	@Temporal(value = TemporalType.TIME)
	@Column(nullable = false, unique = false)
	private Date start;
	
	@Temporal(value = TemporalType.TIME)
	@Column(nullable = false, unique = false)
	private Date end;
		
		public Allocation() {
			super();
		}
		public Allocation(Long id, DayOfWeek dayofweek, Date start, Date end) {
			super();
			this.id = id;
			this.dayofweek = dayofweek;
			this.start = start;
			this.end = end;
		}
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public DayOfWeek getDayofweek() {
			return dayofweek;
		}

		public void setDayofweek(DayOfWeek dayofweek) {
			this.dayofweek = dayofweek;
		}

		public Date getStart() {
			return start;
		}

		public void setStart(Date start) {
			this.start = start;
		}

		public Date getEnd() {
			return end;
		}

		public void setEnd(Date end) {
			this.end = end;
		}
}
