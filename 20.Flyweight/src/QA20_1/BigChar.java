package QA20_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 大きいな文字を表すクラス
 */
public class BigChar {
	//文字の名前
	private char charname;
	//大きな文字を表現する文字列(# - \n　の列)
	private String fontdata;
	//共有フラグ
	private boolean shared;

	//コンストラクタ
	public BigChar(char charname) {
		this.charname = charname;
		this.shared = shared;
		try {
			//大きな文字をファイルから読み込む
			BufferedReader reader = new BufferedReader(new FileReader("src/big" + charname + ".txt"));
			String line;
			StringBuffer buf = new StringBuffer();
			//読みにくいので、改行を追加する
			while ((line = reader.readLine()) != null) {
				buf.append(line);
				buf.append("\n");
			}
			reader.close();
			this.fontdata = buf.toString();
		} catch (IOException e) {
			this.fontdata = charname + "?";
		}
	}

	public void print() {
		System.out.print(fontdata);
	}
}
