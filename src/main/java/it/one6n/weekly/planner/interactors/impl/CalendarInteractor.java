package it.one6n.weekly.planner.interactors.impl;

import org.springframework.stereotype.Service;

import it.one6n.weekly.planner.entities.Calendar;
import it.one6n.weekly.planner.factories.CalendarFactory;
import it.one6n.weekly.planner.gateways.CalendarGateway;
import it.one6n.weekly.planner.interactors.CalendarInputBoundaries;
import it.one6n.weekly.planner.models.requests.CalendarRequestModel;
import it.one6n.weekly.planner.models.responses.CalendarResponseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Service // TODO remove after self bean injection implementation
public class CalendarInteractor implements CalendarInputBoundaries {

	private final CalendarGateway calendarGateway;
	private final CalendarFactory calendarFactory;

	@Override
	public CalendarResponseModel create(CalendarRequestModel request) {
		Calendar calendar = getCalendarFactory().createCalendar(request.getStartDate(), request.getEndDate(),
				request.getParticipants());

		getCalendarGateway().save(calendar);

		return new CalendarResponseModel(calendar.buildId(), true);
	}

}
