package singleton_5_2;

//本のP389参照
public class Singleton {

	// インスタンス化
	private static Singleton singleton1 = new Singleton();
	private static Singleton singleton2 = new Singleton();
	private static Singleton singleton3 = new Singleton();

	// コンストラクタ
	private Singleton() {
		System.out.println("インスタンスを生成しました");
	}

	public static Singleton getInstance(int id) {

		switch (id) {
		case 1:

			return singleton1;

		case 2:

			return singleton2;

		case 3:

			return singleton3;

		default:
			return null;
		}

	}

}
