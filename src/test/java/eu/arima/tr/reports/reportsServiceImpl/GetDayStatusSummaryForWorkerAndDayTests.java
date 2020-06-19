package eu.arima.tr.reports.reportsServiceImpl;

import static eu.arima.tr.reports.DayStatus.EXTRA_HOURS;
import static eu.arima.tr.reports.DayStatus.MISSING_HOURS;
import static eu.arima.tr.reports.DayStatus.RIGHT_HOURS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import eu.arima.tr.reports.DayStatus;
import eu.arima.tr.reports.DayStatusSummary;
import eu.arima.tr.reports.ReportsServiceImpl;
import eu.arima.tr.worklogs.Worklog;
import eu.arima.tr.worklogs.WorklogRepository;

@ExtendWith(MockitoExtension.class)
class GetDayStatusSummaryForWorkerAndDayTests {

	private static final LocalDate DAY = LocalDate.now();

	private static final String USERNAME = "USU";

	@InjectMocks
	ReportsServiceImpl reportsService;

	@Mock
	WorklogRepository worklogRepository;

	@Test
	void when_the_worklog_for_the_resquested_day_is_1_hours_the_status_is_MISSING_HOURS() {
		Worklog wl = mock(Worklog.class);
		when(wl.getDuration()).thenReturn(1);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(wl));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(MISSING_HOURS, result);

	}

	@Test
	void when_the_worklog_for_the_resquested_day_is_2_hours_the_status_is_MISSING_HOURS() {
		Worklog wl = mock(Worklog.class);
		when(wl.getDuration()).thenReturn(2);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(wl));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(MISSING_HOURS, result);

	}

	@Test
	void when_the_worklog_for_the_resquested_day_is_3_hours_the_status_is_MISSING_HOURS() {
		Worklog wl = mock(Worklog.class);
		when(wl.getDuration()).thenReturn(3);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(wl));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(MISSING_HOURS, result);

	}

	@Test
	void when_the_worklog_for_the_resquested_day_is_4_hours_the_status_is_MISSING_HOURS() {
		Worklog wl = mock(Worklog.class);
		when(wl.getDuration()).thenReturn(4);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(wl));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(MISSING_HOURS, result);

	}

	@Test
	void when_the_worklog_for_the_resquested_day_is_5_hours_the_status_is_MISSING_HOURS() {
		Worklog wl = mock(Worklog.class);
		when(wl.getDuration()).thenReturn(5);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(wl));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(MISSING_HOURS, result);

	}

	@Test
	void when_the_worklog_for_the_resquested_day_is_6_hours_the_status_is_MISSING_HOURS() {
		Worklog wl = mock(Worklog.class);
		when(wl.getDuration()).thenReturn(6);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(wl));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(MISSING_HOURS, result);

	}

	@Test
	void when_the_worklog_for_the_resquested_day_is_7_hours_the_status_is_MISSING_HOURS() {
		Worklog wl = mock(Worklog.class);
		when(wl.getDuration()).thenReturn(7);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(wl));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(MISSING_HOURS, result);

	}

	@Test
	void when_the_worklogs_for_resquested_day_are_5_1_1_hours_the_status_is_MISSING_HOURS() {
		Worklog fiveHoursWL = mock(Worklog.class);
		Worklog oneHourWL = mock(Worklog.class);
		when(fiveHoursWL.getDuration()).thenReturn(5);
		when(oneHourWL.getDuration()).thenReturn(1);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(fiveHoursWL, oneHourWL, oneHourWL));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(MISSING_HOURS, result);

	}

	@Test
	void when_the_worklog_for_the_resquested_day_is_8_hours_the_status_is_RIGHT_HOURS() {
		Worklog wl = mock(Worklog.class);
		when(wl.getDuration()).thenReturn(8);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(wl));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(RIGHT_HOURS, result);

	}

	@Test
	void when_the_worklogs_for_resquested_day_are_1_6_1_hours_the_status_is_RIGHT_HOURS() {
		Worklog sixHoursWL = mock(Worklog.class);
		Worklog oneHourWL = mock(Worklog.class);
		when(sixHoursWL.getDuration()).thenReturn(6);
		when(oneHourWL.getDuration()).thenReturn(1);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(oneHourWL, sixHoursWL, oneHourWL));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(RIGHT_HOURS, result);

	}

	@Test
	void when_the_worklog_for_the_resquested_day_is_9_hours_the_status_is_EXTRA_HOURS() {
		Worklog wl = mock(Worklog.class);
		when(wl.getDuration()).thenReturn(9);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(wl));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(EXTRA_HOURS, result);

	}

	@Test
	void when_the_worklogs_for_resquested_day_are_5_2_2_hours_the_status_is_EXTRA_HOURS() {
		Worklog fiveHoursWL = mock(Worklog.class);
		Worklog twoHoursWL = mock(Worklog.class);
		when(fiveHoursWL.getDuration()).thenReturn(5);
		when(twoHoursWL.getDuration()).thenReturn(2);
		when(worklogRepository.findByUsernameAndDate(ArgumentMatchers.anyString(),
				ArgumentMatchers.any(LocalDate.class))).thenReturn(Arrays.asList(fiveHoursWL, twoHoursWL, twoHoursWL));

		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertStatusEquals(EXTRA_HOURS, result);
	}

	@Test
	void the_status_result_belongs_to_the_requested_worker() {
		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, DAY);

		assertEquals(USERNAME, result.getWorkerUserName());

	}

	@Test
	void the_status_result_belongs_to_the_requested_day() {
		LocalDate day = DAY;
		DayStatusSummary result = reportsService.getDayStatusSummaryForWorkerAndDay(USERNAME, day);

		assertEquals(day, result.getDate());

	}

	private void assertStatusEquals(DayStatus dayStatus, DayStatusSummary result) {
		assertEquals(1, result.getStatusList().size());
		assertEquals(dayStatus, result.getStatusList().get(0));
	}
}
