import java.util.Calendar;

public class CalendarEx {

	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();
		// int year = cal.get(Calendar.YEAR);
		// int today = cal.get(Calendar.DATE);
		//
		// int daynum = cal.get(Calendar.DAY_OF_MONTH);

		// cal.set(Calendar.DATE, 1);
		cal.set(2015, 10-1, 1);

		int yoil = cal.get(cal.DAY_OF_WEEK);
		int end = cal.getActualMaximum(cal.DATE);
		// int end = cal.getMaximum(cal.DATE);

		System.out.println("\t<<< " + end + ", " + yoil + "              >>>>");
		System.out.println();

		System.out.print("\t일\t월\t화\t수\t목\t금\t토");
		System.out.println();

		for (int i = 1; i < yoil + end; i++) {

			if (i < yoil) {
				System.out.print("\t");
				continue;
			}

			System.out.print("\t" + (i - yoil + 1));

			if (i % 7 == 0) {
				System.out.println();
			}

		}

	}
}
