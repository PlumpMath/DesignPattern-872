import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDisplayImpl extends DisplayImpl {

	private String fileName;
	private File file;
	private BufferedReader br;
	private String str;

	private int width;

	public FileDisplayImpl(String fileName) {
		this.fileName = fileName;

		// ファイルを読み込む
		try {
			file = new File(fileName);
			br = new BufferedReader(new FileReader(file));
			str = br.readLine();

			// 行を読み込む
			while (str != null) {

				str = br.readLine();

				// 最大行桁数
				if (str != null && str.length() > width) {
					this.width = str.length();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void rawOpen() {
		printLine();
	}

	public void rawPrint() {

		try {

			// 行を読み込む
			br = new BufferedReader(new FileReader(file));
			str = br.readLine();

			while (str != null) {
				str = br.readLine();

				if (str != null) {

					// 最大行桁数
					if (str.length() > width) {
						this.width = str.length();
					}

					// 空白補足
					String space = "";
					for (int i = 0; i < width - str.length(); i++) {
						space += "　";
					}

					System.out.println("|" + str + space + "|");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void rawClose() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
			System.out.print("-");
		}
		System.out.println("+");
	}

}
