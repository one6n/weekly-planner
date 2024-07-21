package it.one6n.weekly.planner.repos;

import org.springframework.stereotype.Service;

import it.one6n.weekly.planner.entities.Calendar;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service // TODO remove after self bean injection implementation
public class CalendarRepository {

	// TODO add MongoRepository
	public void save(Calendar calendar) {
		log.info("saved calendar={}", calendar);
	}
}
