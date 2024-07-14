package it.one6n.weekly.planner.entities.impl;

import java.util.Date;
import java.util.List;

import it.one6n.weekly.planner.entities.Calendar;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalendarImpl implements Calendar {
	private Date startDate;
	private Date endDate;
	private List<String> participants;
}
