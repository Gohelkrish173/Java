public class StringBufferDemo{
	public static void main(String[] args) {
		StudentImmutable sm = new StudentImmutable();
		sm.spi = 5.2;
		sm.addInSpi(2);
		System.out.println("SPI = "+sm.spi);
	}
}

class StudentImmutable{
	double spi;
	double addInSpi(int n){
		return spi + n;
	}
}

class StudentMutable{
	double spi;
	void addInSpi(int n){
		spi = spi + n;
	}
}

