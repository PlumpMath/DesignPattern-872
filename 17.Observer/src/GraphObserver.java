//観察した数を****のような「簡易グラフ」で表示する
public class GraphObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.print("GraphObserver:");
		int count = generator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println("");

		// 表示様子をよく見れるため、スピードを遅く
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
