package questions;

public enum PrinterType {

	// 
	DOTMATRIX(5), INKJET(10), LASER(50); // #2 
	private int pagePrintCapacity; // #1
	
	private PrinterType(int pagePrintCapacity) { this.pagePrintCapacity = pagePrintCapacity; } 
	public int getPrintPageCapacity() { return pagePrintCapacity; }
}
