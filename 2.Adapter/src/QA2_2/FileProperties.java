package QA2_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * プロパティの集合をファイルに保存する
 */
public class FileProperties extends Properties implements FileIO {

	public void readFromFile(String filename) throws IOException {
		load(new FileInputStream(filename));
	}

	public void writeToFile(String filename) throws IOException {
		store(new FileOutputStream(filename), "Write by FileProperties");
	}

	public void setValue(String key, String value) {
		setProperty(key, value);
	}

	public String getValue(String Key) {
		return getProperty(Key);
	}

}
