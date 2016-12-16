//相談役（API）
public interface Mediator {
	//Colleagueを生成
    public abstract void createColleagues();

    //Colleagueから呼び出せるメソッド
    //相談役への「相談」
    public abstract void colleagueChanged();
}
