package it.one6n.weekly.planner.factories;

import java.util.Date;
import java.util.List;

import it.one6n.weekly.planner.entities.Calendar;

public interface CalendarFactory {
	Calendar createCalendar(Date startDate, Date endDate, List<String> participants);
}
