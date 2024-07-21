package it.one6n.weekly.planner.entities.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import it.one6n.weekly.planner.entities.Calendar;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalendarImpl implements Calendar {
	private static final String ID_DATE_FORMAT = "yyyyMMddhhmmSSS";

	private Date startDate;
	private Date endDate;
	private List<String> participants;

	@Override
	public String buildId() {
		SimpleDateFormat formatter = new SimpleDateFormat(ID_DATE_FORMAT);
		int hashedPartecipants = StringUtils.join(participants, "_").hashCode();
		String id = StringUtils.join(formatter.format(this.startDate), formatter.format(this.endDate),
				hashedPartecipants, "_");
		return id;
	}
}
