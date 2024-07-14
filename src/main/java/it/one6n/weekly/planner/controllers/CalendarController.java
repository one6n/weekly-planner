package it.one6n.weekly.planner.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.one6n.weekly.planner.utils.ControllersUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(ControllersUtils.CALENDAR_CONTROLLER_BASE_PATH)
public class CalendarController {

	@GetMapping("/example")
	public ResponseEntity<Object> getExample() {

		return new ResponseEntity<Object>("Success", HttpStatus.OK);
	}
}
