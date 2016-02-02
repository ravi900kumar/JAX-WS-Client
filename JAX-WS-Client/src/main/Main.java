package main;
import ws.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			try {
				
				DemoImplService demoImplService = new DemoImplServiceLocator();
				Demo demo = demoImplService.getDemoImplPort();
				
				System.out.println(demo.helloworld());
				System.out.println("xyz");
				
				
				ProductWSImplService productWSImplService =new ProductWSImplServiceLocator();
				
				ProductWS productWS= productWSImplService.getProductWSImplPort();
				
				
				Product product=productWS.find();
				
				System.out.println("id - " + product.getId());
				System.out.println("name - " + product.getName());
				System.out.println("price - " + product.getPrice());
				System.out.println("--------------------------");
				Product [] listp=productWS.findAll();
				for(Product p:listp){
					
					System.out.println("id - " + p.getId());
					System.out.println("name - " + p.getName());
					System.out.println("price - " + p.getPrice());
					System.out.println("--------------------------");
				}
				
				
			} catch (Exception e) {
				
			}
	}

}
