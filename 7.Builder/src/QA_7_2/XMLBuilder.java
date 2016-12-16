package QA_7_2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// QA_7_3
public class XMLBuilder extends Builder {

	private String filename;
	private PrintWriter writer;

	protected void buildTitle(String title) {
		filename = title + ".xml";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}

		writer.println("<?xml version='1.0' encoding='UTF-8' ?>");
		writer.println("<venture>");
		writer.println("	<company>");
		writer.println("		<name>" + title + "</name>");

	}

	protected void buildString(String str) {
		writer.println("		<addInfo>");
		writer.println("			<value>" + str + "</value>");
		writer.println("		</addInfo>");
	}

	protected void buildItems(String[] items) {
		writer.println("		<attr>");
		for (int i = 0; i < items.length; i++) {
			writer.println("			<item>" + items[i] + "</item>");
		}
		writer.println("		</attr>");
	}

	protected void buildDone() {
		writer.println("	</company>");
		writer.println("</venture>");
		writer.close();
	}

	protected String getResult() {
		return filename;
	}

}
