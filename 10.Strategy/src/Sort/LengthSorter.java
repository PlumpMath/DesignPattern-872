package Sort;

public class LengthSorter implements Sorter{
	public void sort(Comparable[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < data.length; j++) {
				if (data[min].toString().getBytes().length > data[j].toString().getBytes().length) {
					min = j;
				}
			}
			Comparable passingplace = data[min];
			data[min] = data[i];
			data[i] = passingplace;
		}
	}
}
