package game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
	private int money; // お金
	private List fruits = new ArrayList(); // フルーツ
	private Random random = new Random(); // 乱数発生器
	private static String[] fruitsname = { // フルーツ名のヒョウ
			"リンゴ", "ぶどう", "バナナ", "みかん", };

	// コンストラクタ
	public Gamer(int money) {
		this.money = money;
	}

	// お金を取得
	public int getMoney() {
		return money;
	}

	// ゲームの進行
	public void bet() {
		// サイコロを振る
		// 乱数を生成する
		int dice = random.nextInt(6) + 1;

		if (dice % 2 == 0) {
			if (dice == 6) {
				// 6の場合、フルーツを得る
				String f = getFruit();
				System.out.println("フルーツ（" + f + "）をもらいました。");
				fruits.add(f);
			} else {
				// 偶数の場合、お金を増える
				money += 100;
				System.out.println("所持金が増えました。");
			}
		} else if (dice % 2 == 1) {
			// 奇数の場合、お金を半分になる
			money /= 2;
			System.out.println("所持金が半分になりました。");
		} else {
			// それ以外の場合、かわらない
			System.out.println("何も起こりませんでした。");
		}
	}

	// スナップショットを撮る
	public Memento createMemento() {
		Memento m = new Memento(money);
		Iterator it = fruits.iterator();
		while (it.hasNext()) {
			String f = (String) it.next();
			// フルーツはおいしいものだけ保存
			if (f.startsWith("おいしい")) {
				m.addFruit(f);
			}
		}
		return m;
	}

	//アンドゥを行う（復元）
	public void restoreMemento(Memento memento) {
		this.money = memento.money;
		this.fruits = memento.getFruits();
	}

	//文字列表現
	public String toString() {
		return "[money = " + money + ", fruits = " + fruits + "]";
	}

	//フルーツを1個得る
	private String getFruit() {
		String prefix = "";
		if (random.nextBoolean()) {
			prefix = "おいしい";
		}
		return prefix + fruitsname[random.nextInt(fruitsname.length)];
	}
}
