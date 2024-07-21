package it.one6n.weekly.planner.models.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalendarResponseModel {
	String id;
	boolean saved;
}
