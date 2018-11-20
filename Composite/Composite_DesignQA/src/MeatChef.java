

public class MeatChef implements Chef{
	
	private String name;


	public MeatChef(String name) {
		 this.name = name;
	}
 	@Override
 	public void mealMade() {
 		System.out.print("I'm " + name + " and I brought the meat! \n");
 	}

}