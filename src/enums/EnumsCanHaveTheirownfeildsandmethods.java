package enums;

enum enums3 {
	FIRST {
		int i = 10;

		void methodOfFirst() {
			System.out.println(i);
		}

		void abstractmethod() {
			methodOfFirst();
		}
	},
	SECOND {
		int k = 900;

		void methodOfSecond() {
			System.out.println(k);
		}

		void abstractmethod() {
			methodOfSecond();
		}

	};
	int j = 200;

	abstract void abstractmethod();
}

public class EnumsCanHaveTheirownfeildsandmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(enums3.FIRST.j);

		enums3.FIRST.abstractmethod();

		System.out.println(enums3.SECOND.j);

		enums3.SECOND.abstractmethod();
	}

}
