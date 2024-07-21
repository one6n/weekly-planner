package it.one6n.weekly.planner.models.requests;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalendarRequestModel {
	private Date startDate;
	private Date endDate;
	private List<String> participants;
}
