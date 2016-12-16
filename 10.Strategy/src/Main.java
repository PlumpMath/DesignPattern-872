
public class Main {

	public static void main(String[] args) {
		//二つパラメータ
		if (args.length != 2) {
			System.out.println("Usage:java Main randomseed1 randomseed2");
			System.out.println("Example:java Main 314 15");
			System.exit(0);
		}

		int seed1=Integer.parseInt(args[0]);
		int seed2=Integer.parseInt(args[1]);

		//選手を作成
		Player player1= new Player("Taro", new WinningStrategy(seed1));
		Player player2= new Player("Hana", new ProbStrategy(seed2));

		for(int i=0;i<10000;i++){
			Hand nextHand1=player1.nextHand();
			Hand nextHand2=player2.nextHand();
			if(nextHand1.isStrongerThan(nextHand2)){
				System.out.println("Winner:"+player1);
				player1.win();
				player2.lose();
			}else if(nextHand2.isStrongerThan(nextHand1)){
				System.out.println("Winner:"+player2);
				player2.win();
				player1.lose();
			}else{
				System.out.println("Even..");
				player1.even();
				player2.even();
			}
		}

		System.out.println("Total result:");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		System.out.println();

		//問題10-1
		Player player3= new Player("Gil", new RandomStrategy(seed1));
		Player player4= new Player("Gil", new RandomStrategy(seed2));
		for(int i=0;i<10;i++){

			Hand nextHand3=player3.nextHand();
			Hand nextHand4=player4.nextHand();

			if(nextHand3.isStrongerThan(nextHand4)){
				System.out.println("Winner:"+player1);
				player3.win();
				player4.lose();
			}else if(nextHand4.isStrongerThan(nextHand3)){
				System.out.println("Winner:"+player2);
				player4.win();
				player3.lose();
			}else{
				System.out.println("Even..");
				player3.even();
				player4.even();
			}
		}
		System.out.println("Total result:");
		System.out.println(player3.toString());
		System.out.println(player4.toString());
		System.out.println();

	}

}
