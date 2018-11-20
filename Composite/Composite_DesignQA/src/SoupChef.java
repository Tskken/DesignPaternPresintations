

public class SoupChef implements Chef{
	
	private String name;


	public SoupChef(String name) {
		 this.name = name;
	}
 	@Override
 	public void mealMade() {
 		System.out.print("I'm " + name + " and I brought the soup! \n");
 	}

}