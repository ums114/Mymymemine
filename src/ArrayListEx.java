import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String args[]) {
		int kor, eng, math, total;
		double avg;
		String 이름[] = { "이한별", "김새롬", "노경아", "오서안", "정보문", "김영진", "박진수 ",
				"신영기", "노현수", "권영진" };

		int 국어[] = { 30, 20, 100, 50, 60, 80, 99, 81, 49, 56 };
		int 영어[] = { 100, 7, 100, 20, 70, 95, 90, 62, 68, 72 };
		int 수학[] = { 20, 50, 100, 25, 75, 95, 100, 32, 79, 60 };

		ArrayList v = new ArrayList();
		for (int i = 0; i < 이름.length; i++) {
			// 다양한 객체 추가 방법
			v.add(이름[i]);
			v.add(new Integer(국어[i]));
			v.add(new Integer(영어[i]));
			v.add(new Integer(수학[i]));

		}
		System.out.println("------------학생 성적 " + " 조회 프로그램 ------------");
		System.out.println(" 이름\t국어\t영어\t수학\t총정\t평균");

		Iterator enu = v.iterator();
		while (enu.hasNext()) {
			System.out.println("\n" + enu.next());
			Integer obj = (Integer) enu.next();
			kor = obj.intValue();
			eng = ((Integer) enu.next()).intValue();
			math = (Integer) enu.next();
			total = kor + eng + math;
			avg = total / 3;
			System.out.println("\t" + kor + "\t" + eng + "\t" + math);
			System.out.println("\t" + total + "\t" + avg);

		}

	}
}
