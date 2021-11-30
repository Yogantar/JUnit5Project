package testcode;

import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

import businesscode.ScheduleService;

class ScheduleServiceJunit5Test {

//	assuming current timezone is IST.. then only test should continue
	@Test
	void testDoSchedule() {
		TimeZone tzone = TimeZone.getDefault();
		assumeTrue(tzone.getDisplayName().equals("India Standard Time"));
		
//		test doschedule method
		ScheduleService ss = new ScheduleService();
		assertTrue(ss.doSchedule());
	}

	@Test
	public void doScheduleLocaleNonUS() {

	// Assume that the current locale is India
	Locale currentLocale = Locale.getDefault();
	assumeFalse(currentLocale.equals(Locale.US));

	// Test doSchedule method
	ScheduleService scheduleService = new ScheduleService();
	assertTrue(scheduleService.doSchedule());

	}
//	assume current OS is Windows
	@Test
	void testBackupCalendar() {
		
		assumeTrue(System.getProperty("os.name").startsWith("Windows"));

		// Test doSchedule method
		ScheduleService scheduleService = new ScheduleService();
		assertTrue(scheduleService.backupCalendar());
	}

}
