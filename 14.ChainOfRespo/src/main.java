
public class main {

	public static void main(String[] args) {
		Support Alice = new NoSupport("Alice");
		Support Bob= new LimitSupport("Bob", 100);
		Support Charlie= new SpecialSupport("Charlie", 429);
		Support Diana= new LimitSupport("Diana", 200);
		Support Elmo= new OddSupport("Elmo");
		Support Fred= new LimitSupport("Fred", 300);

		//連鎖の形成
		Alice.setNext(Bob).setNext(Charlie).setNext(Diana).setNext(Elmo).setNext(Fred);
		//さまざまなトラブル発生
		for(int i=0;i<=500;i+=33){
			Alice.support(new Trouble(i));
		}

	}

}
