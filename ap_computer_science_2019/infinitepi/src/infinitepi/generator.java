package infinitepi;
	public class generator {
		public static void main(String[] args) {
			int it=0, input, div;
			double pi=0;
			boolean toggle = true;
				div=0;
				int i=1;
				while (i==1) {
					if (toggle) {
					pi += (double)1 / (1+2*it);
					toggle = false;
					} else {
					pi -= (double)1 / (1+2*it);
					toggle = true;
					}
					it++;
					System.out.println(pi*4);
				}
				
		}
	}
