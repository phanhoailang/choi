package Demo;
import java.util.ArrayList;
public class ProductList {

		ArrayList<Product> list = new ArrayList<>();
		public ProductList() {
			list.add(new ProductIn(1, "In-111", 200, 4.1));
			list.add(new ProductIn(2, "In-222", 400, 4.2));
			list.add(new ProductIn(3, "In-333", 800, 4.3));
			list.add(new ProductOut(4, "Out-444", 200, 4.4, "VN"));
			list.add(new ProductOut(5, "Out-555", 500, 4.5, "USA"));
		}
		public ArrayList<Product> getList() {
			return list;
		}
		public void setList(ArrayList<Product> list) {
			this.list = list;
		}
		public void display() {
			for (Product product : list) {
				System.out.println(product.toString());
			}
		}
	}


