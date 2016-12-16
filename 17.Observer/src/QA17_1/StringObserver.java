package QA17_1;

//問題17-2　観察者追加
//観察した数を説明として文字列で表示する
public class StringObserver implements Observer {
	public void update(NumberGenerator generator) {
		System.out.print("StringObserver:");
		int count = generator.getNumber();

			if (count <= 10) {
				System.out.print("子供");
			} else if (10 < count && count <= 20) {
				System.out.print("少年");
			}else if (20 < count && count <= 30) {
				System.out.print("青年");
			}else if (30 < count && count <= 60) {
				System.out.print("中年");
			}else if (count > 60){
				System.out.print("老年");
			}else{
				System.out.print("Error!");
			}


		System.out.println("");

		// 表示様子をよく見れるため、スピードを遅く
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
