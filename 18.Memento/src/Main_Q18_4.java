import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import Q18_3.Gamer;
import Q18_3.Memento;

public class Main_Q18_4 {
	//ファイル名定義
	// TODO 問題18_4
	public static final String SAVEFILENAME="game.dat";

	public static void main(String[] args) {
		//最初のお金
		Gamer gamer = new Gamer(100);
		//最初状態を保存
		// TODO 問題18_4
		//Memento memento = gamer.createMemento();
		Memento memento = loadMemento();
		if(memento!=null){
			System.out.println("前回保存した結果からスタートします。");
			gamer.restoreMemento(memento);
		}else{
			System.out.println("新規にスタートします。");
			memento = gamer.createMemento();
		}

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

				//ファイル保存
				// TODO 問題18_4
				saveMemento(memento);

			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("だいぶ減ったので、以前の状態に回復しよう");
				gamer.restoreMemento(memento);
			}

			// 時間待ち
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			System.out.println("");
		}
	}

	public static void saveMemento(Memento memento) {
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
            out.writeObject(memento);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Memento loadMemento() {
        Memento memento = null;
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
            memento = (Memento)in.readObject();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
