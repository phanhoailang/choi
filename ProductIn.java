package Demo;

public class ProductIn extends Product{
	private double extraIn;
	
	
	public ProductIn() {
		super();
	}
	
	public ProductIn(int id, String name, double price, double extraIn) {
		super(id, name, price);
		this.extraIn = extraIn;
	}

	public double getExtraIn() {
		return extraIn;
	}

	public void setExtraIn(double extraIn) {
		this.extraIn = extraIn;
	}

	@Override
	public String toString() {
		return "ProductIn [" + super.toString() +", extraIn=" + extraIn + "]";
	}
	
	@Override
	public double priceForSale() {
		return super.priceForSale() + extraIn;
	}
}
