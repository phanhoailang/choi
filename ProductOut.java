package Demo;
	public class ProductOut extends Product{
		private double extraOut;
		private String origin;	
		public ProductOut() {
			// TODO Auto-generated constructor stub
		}
		public ProductOut(int id, String name,double price ,double extraOut, String origin) {
			super(id, name, price);
			this.extraOut = extraOut;
			this.origin = origin;
		}
		public double getExtraOut() {
			return extraOut;
		}
		public void setExtraOut(double extraOut) {
			this.extraOut = extraOut;
		}
		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		
		@Override
		public double priceForSale() {
			return super.priceForSale() + extraOut * 1.1;
		}
		@Override
		public String toString() {
			return "ProductOut ["+ super.toString() + ", extraOut=" + extraOut + ", origin=" + origin + "]";
		}
		
	}


