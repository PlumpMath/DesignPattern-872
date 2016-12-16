import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.Reader;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		// ①ファイルからデータを読み込む
		Reader reader1 = new FileReader("src/datafile.txt");

		// ②ファイルからデータを読み込むときバッファリングを行う
		Reader reader2 = new BufferedReader(new FileReader("src/datafile.txt"));

		// ③でーたを読み込み先として、FileReaderクラスのインスタンスを指定していること
		// 次のようにすると、行番号を管理することができる
		Reader reader3 = new LineNumberReader(new BufferedReader(new FileReader("src/datafile.txt")));

	}
}
