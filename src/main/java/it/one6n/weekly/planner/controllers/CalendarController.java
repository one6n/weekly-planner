package it.one6n.weekly.planner.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.one6n.weekly.planner.interactors.CalendarInputBoundaries;
import it.one6n.weekly.planner.models.requests.CalendarRequestModel;
import it.one6n.weekly.planner.models.responses.CalendarResponseModel;
import it.one6n.weekly.planner.utils.ControllersUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@RestController
@RequestMapping(ControllersUtils.CALENDAR_CONTROLLER_BASE_PATH)
public class CalendarController {

	private CalendarInputBoundaries interactor;

	public CalendarController(CalendarInputBoundaries interactor) {
		this.interactor = interactor;
	}

	// TODO remove this
	@GetMapping("/example")
	public ResponseEntity<Object> getExample() {

		return new ResponseEntity<Object>("Success", HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<CalendarResponseModel> create(@RequestBody CalendarRequestModel request) {

		log.info("request={}", request);
		return new ResponseEntity<CalendarResponseModel>(getInteractor().create(request), HttpStatus.OK);
	}
}
