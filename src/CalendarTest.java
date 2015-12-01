import java.util.Calendar;

public class CalendarTest {

	/*
	 * Calendar class는 1970년 1월 1일부터 특정 값으로 진보해 오면서 날짜와 시각에 대한 조작을 수행할 수 있도록
	 * abstract class이다. Object 생성 법은 다음과 같다. 1) Calendar cal =
	 */

	public static void main(String args[]) {
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = (cal.get(Calendar.MONTH) + 1);
		// 1월이 0을 기억한다.
		int date = cal.get(Calendar.DATE);

		System.out.println("년 : " + year);
		System.out.println("월 : " + month);
		;
		System.out.println("일 : " + date);
		;

		// 시,분,초 를 출력해 보세요.

		int day1 = cal.get(Calendar.DAY_OF_YEAR);
		int day2 = cal.get(Calendar.DAY_OF_MONTH);
		int day3 = cal.get(Calendar.DAY_OF_WEEK);
		int week = cal.get(Calendar.WEEK_OF_YEAR);

		System.out.println("오늘은 올해의 : " + day1 + "날입니다.");
		System.out.println("오늘은 이번달 : " + day2 + "일일입니다.");
		System.out.println("오늘은 이번주 : " + day3 + "요입니다..");
		System.out.println("오늘은 올해의 : " + week + "주입니다.\n");

		String[] yoil = { "일", "월", "화", "수", "목", "금", "토" };

		// 요일출력
		System.out.println("오늘은 요일은" + yoil[day3 - 1] + "요일 입니다.");

		// 달력 만들기

	}
}
