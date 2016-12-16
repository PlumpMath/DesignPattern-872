package Q18_3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//問題18_4：Serializableの機能を利用
public class Memento implements Serializable {
	int money; // お金
	ArrayList fruits; // フルーツ
	//問題18_3
	private int number;

	// お金を取得(narrow interface)
	public int getMoney() {
		return money;
	}

	// コンストラクタ(wide interface)
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList();
		this.number = number;
	}

	// フルーツ追加(wide interface)
	void addFruit(String fruit) {
		fruits.add(fruit);
	}

	// フルーツ取得(wide interface)
	List getFruits() {
		return (List) fruits.clone();
	}

	int getNumber() {
		return number;
	}
}
