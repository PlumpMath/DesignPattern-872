
public class LimitSupport extends Support {
	// この番号未満なら解決できる
	private int limit;

	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	// 解決用メソッド
	protected boolean resolve(Trouble trouble) {
		if(trouble.getNumber()<limit){
			return true;
		}else{
			return false;
		}
	}

}
