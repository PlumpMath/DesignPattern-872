package QA13_3;
import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element {

	public void accept(Visitor v) {
		Iterator it = iterator();
		while (it.hasNext()) {
			Element element = (Element) it.next();
			element.accept(v);
		}
	}

}
