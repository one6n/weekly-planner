package it.one6n.weekly.planner.gateways.impl;

import org.springframework.stereotype.Service;

import it.one6n.weekly.planner.entities.Calendar;
import it.one6n.weekly.planner.gateways.CalendarGateway;
import it.one6n.weekly.planner.repos.CalendarRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Service // TODO remove after self bean injection implementation
public class CalendarGatewayImpl implements CalendarGateway {

	private CalendarRepository calendarRepository;

	@Override
	public void save(Calendar calendar) {
		// TODO implement the data mapper model
		getCalendarRepository().save(calendar);
	}
}
