package singleton_5_2;
public class main {

	public static void main(String[] args) {
		System.out.println("Start.");
		//生成されるインスタンス
		Singleton obj1 = Singleton.getInstance(1);
		Singleton obj2 = Singleton.getInstance(2);
		Singleton obj3 = Singleton.getInstance(3);

		//生成されないインスタンス
		Singleton obj4 = Singleton.getInstance(4);

		// 外からインスタンスされないため
		// コンストラクタをprivateにする
		// Singleton obj3 = new Singleton();

		if (obj1 == obj2) {
			System.out.println("obj1とobj2は同じインスタンス");
		} else {
			System.out.println("obj1とobj2は同じインスタンスではない");
		}
	}
}
