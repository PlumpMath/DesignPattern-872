import game.Gamer;
import game.Memento;

public class Main {
	public static void main(String[] args) {
		//最初のお金
		Gamer gamer = new Gamer(100);
		//最初状態を保存
		Memento memento = gamer.createMemento();

		//100回bet
		for (int i = 0; i < 100; i++) {
			//回数表示
			System.out.println("==== " + i);
			System.out.println("現状:" + gamer);

			//ゲームを進める
			gamer.bet();

			System.out.println("所持金" + gamer.getMoney() + "円になりました。");

			// Mementoの読み込み
			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("だいぶ増えたので、現状を保存しておこう");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("だいぶ減ったので、以前の状態に回復しよう");
				gamer.restoreMemento(memento);
			}

			// 時間待ち
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("");
		}
	}
}
