
import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;
import idcard_4_2.IDCardFactory_4_2;

public class main {

	public static void main(String[] args) {

		Factory factory = new IDCardFactory();

		// 5.Singletonの確認
		// Factory factory3 = new IDCardFactory();
		//
		// if (factory!=factory3){
		// System.out.println("違うインスタンス");
		// }

		Product card1 = factory.create("John");
		Product card2 = factory.create("Mick");
		Product card3 = factory.create("Tom");

		// IDCardはidcard以外からnewできない
		// 必ずIDCardFactoryを経由する
		// IDCard idcard = new IDCard("AAA");

		card1.use();
		card2.use();
		card3.use();

		System.out.println();

		Factory factory2 = new IDCardFactory_4_2();
		Product card4 = factory2.create("John");
		Product card5 = factory2.create("Systena");
		Product card6 = factory2.create("Micky");
		card4.use();
		card5.use();
		card6.use();
	}

}
