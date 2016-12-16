import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
	private ArrayList observers = new ArrayList();

	// 観察者を追加
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	// 観察者を削除
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	// 観察者に通知
	public void notifyObservers() {
		Iterator it = observers.iterator();
		while (it.hasNext()) {
			Observer o = (Observer) it.next();
			o.update(this);
		}
	}

	// 数を取得
	public abstract int getNumber();

	// 数を生成
	public abstract void execute();
}
