package fund;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import junit.framework.TestCase;

public class Java8TestCase extends TestCase {
	@Test
	public void testDateTime() {
		final Clock clock = Clock.systemUTC();
		final LocalDate date = LocalDate.now();
		final LocalDate dateFromClock = LocalDate.now( clock );
		         
		System.out.println( date );
		System.out.println( dateFromClock );
		         
		// Get the local date and local time
		final LocalTime time = LocalTime.now();
		final LocalTime timeFromClock = LocalTime.now( clock );
		         
		System.out.println( time );
		System.out.println( timeFromClock );
	}
}
