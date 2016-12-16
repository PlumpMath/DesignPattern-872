package QA20_1;
public class Main {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java Main digits");
			System.out.println("Example: java Main 1212123");
			System.exit(0);
		}

		memoryOutput();

		//共有
		BigString bs1 = new BigString(args[0],true);
		bs1.print();

		memoryOutput();

		//共有しない
		BigString bs2 = new BigString(args[0],false);
		bs2.print();

		memoryOutput();
	}

	public static void memoryOutput(){
		Runtime.getRuntime().gc();
		long used =Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("使用メモリ："+used);
	}
}
