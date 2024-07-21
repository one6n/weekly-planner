package it.one6n.weekly.planner.factories.impl;

import java.security.InvalidParameterException;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import it.one6n.weekly.planner.entities.Calendar;
import it.one6n.weekly.planner.entities.impl.CalendarImpl;
import it.one6n.weekly.planner.factories.CalendarFactory;

@Service // TODO remove after self bean injection implementation
public class CalendarFactoryImpl implements CalendarFactory {

	@Override
	public Calendar createCalendar(Date startDate, Date endDate, List<String> participants) {
		if (startDate == null || endDate == null)
			throw new InvalidParameterException(
					"startDate and EndDate must be not null, but was: startDate=%s, endDate=%s".formatted(startDate,
							endDate));
		if (participants == null || participants.isEmpty())
			throw new InvalidParameterException("parecipants must be not Empty");

		return new CalendarImpl(startDate, endDate, participants);
	}
}
