
class Main {

	public static void main(String args[]) {
		for(int i = 1; i <= 100; i++) {
			String str = "";

			// ここから記述

			//15の倍数の場合の処理
			//if文の最初に持ってくることで、15(3と5の最小公倍数)の処理を先に処理できる
			if (i%15 ==0) {
				System.out.print("FizzBuzz");
			}else if(i%3 == 0) { //3の倍数の場合の処理
				System.out.print("Fizz");
			}else if(i%5 == 0) { //５の倍数の場合の処理
				System.out.print("Buzz");
			}else {
				System.out.print(i);
			}
			// ここまで記述
			System.out.println(str);
		}
	}
}
