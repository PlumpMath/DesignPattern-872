//ColleagueのAPI
public interface Colleague {
	//相談役を設定
    public abstract void setMediator(Mediator mediator);

    //相談役からの指示（有効状態の制御）
    public abstract void setColleagueEnabled(boolean enabled);
}
