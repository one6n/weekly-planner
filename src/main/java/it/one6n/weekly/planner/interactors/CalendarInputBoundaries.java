package it.one6n.weekly.planner.interactors;

import it.one6n.weekly.planner.models.requests.CalendarRequestModel;
import it.one6n.weekly.planner.models.responses.CalendarResponseModel;

public interface CalendarInputBoundaries {

	public CalendarResponseModel create(CalendarRequestModel request);
}
