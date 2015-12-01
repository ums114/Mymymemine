import java.util.Random;
import java.util.Scanner;

public class RandomGame1 {

	public static void main(String args[]) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int na, com;

		System.out.println("무엇을 내겠습니까? 1 : 가위, 2: 바위 , 3: 보 ");

		na = sc.nextInt();
		com = r.nextInt(3);

		if (com == 1) {
			System.out.println("컴퓨터는 가위를 냈습니다.");
		} else if (com == 2) {
			System.out.println("컴퓨터는 바위를 냈습니다.");
		} else {
			System.out.println("컴퓨터는 보를 냈습니다.");
		}
		int result = (na - com + 3) % 3;

		switch (result) {
		case 0:
			System.out.print("비겼습니다. ");
			break;
		case 1:
			System.out.print("당신이 이겼습니다.");
			break;
		case 2:
			System.out.println("당신이 졌습니다 ㅠㅠ");
			break;

		}

	}
}
