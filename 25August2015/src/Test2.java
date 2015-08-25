
	public class Test2 {

		public static void main(String[] args) {
			
			House h = new House();
			h.setFoundation("Concrete");
			h.setHasFantasticGarage(true);
			
			House h2 = new House();
			h2.setFoundation("raised");
			h2.setHasFantasticGarage(false);
			
			System.out.println(h.getFoundation());
			System.out.println(h2.getFoundation());
		}

	}
