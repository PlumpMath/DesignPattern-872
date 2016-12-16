package QA21_1;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "Printer");
        System.out.println("���O�͌���" + p.getPrinterName() + "�ł��B");
        p.setPrinterName("Bob");
        System.out.println("���O�͌���" + p.getPrinterName() + "�ł��B");
        p.print("Hello, world.");
    }
}
