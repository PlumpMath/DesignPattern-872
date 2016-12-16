package game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	int money; // お金
	ArrayList fruits; // フルーツ

	// お金を取得(narrow interface)
	public int getMoney() {
		return money;
	}

	// コンストラクタ(wide interface)
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList();
	}

	 // フルーツ追加(wide interface)
	void addFruit(String fruit) {
		fruits.add(fruit);
	}

	// フルーツ取得(wide interface)
	List getFruits() {
		return (List) fruits.clone();
	}
}
