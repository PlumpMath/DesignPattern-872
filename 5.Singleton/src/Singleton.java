public class Singleton {

	//インスタンス化
	private static Singleton singleton = new Singleton();

	// コンストラクタ
	private Singleton(){
		System.out.println("インスタンスを生成しました");
	}

	public static Singleton getInstance(){
		return singleton;
	}

}
