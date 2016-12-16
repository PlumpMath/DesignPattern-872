package QA_7_2;

public class Director {
	private Builder builder;

	public Director(Builder builder){
		this.builder = builder;
	}

	//文書を構築する
	public void construct() {
		// makeTitleを呼び出せず、ほかのメソッドも出力されない
		builder.makeTitle("Greeting");
		builder.makeString("朝から昼にかけて");
		builder.makeItems(new String[]{
				"おはようございます。",
				"こんにちは。",
		});

		builder.makeString("夜に");
		builder.makeItems(new String[]{
				"こんばんは。",
				"おやすみなさい。",
				"さようなら。",
		});

		builder.close();
	}
}
