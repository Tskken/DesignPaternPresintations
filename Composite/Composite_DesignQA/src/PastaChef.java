

public class PastaChef implements Chef{
	
	private String name;


	public PastaChef(String name) {
		 this.name = name;
	}
 	@Override
 	public void mealMade() {
 		System.out.print("I'm " + name + " and I brought the pasta! \n");
 	}

}