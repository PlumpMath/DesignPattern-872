package Sort;

// 問題10-4
public class Main {

	public static void main(String[] args) {
		String[] data={"Dumpty","Bowman","Carroll","Elfland","Alice",};

		SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
		sap.execute();

		System.out.println();

		//追加
		String[] data2={"Dum","Bowman","Carrolll","Elflandddddd","Al",};

		SortAndPrint sap2=new SortAndPrint(data2, new LengthSorter());

		sap2.execute();

		System.out.println();

	}

}
