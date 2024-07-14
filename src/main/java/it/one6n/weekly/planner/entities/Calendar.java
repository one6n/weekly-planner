package it.one6n.weekly.planner.entities;

import java.util.Date;
import java.util.List;

public interface Calendar {
	Date getStartDate();

	Date getEndDate();

	List<String> getParticipants();
}
