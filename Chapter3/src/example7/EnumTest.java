package example7;

public class EnumTest {

	PrinterType printerType;

	public EnumTest(PrinterType printerType) {
		this.printerType = printerType;
	}

	public void feature() {
		// switch based on the printer type passed in the constructor
		switch (printerType) {
		case TOSHIBA:
			System.out.println("Toshiba is number 1");
			break;
		case LG:
			System.out.println("Toshiba is number 2");
			break;
		case SAMSUNG:
			System.out.println("Toshiba is number 3");
			break;
		}
	}
}
