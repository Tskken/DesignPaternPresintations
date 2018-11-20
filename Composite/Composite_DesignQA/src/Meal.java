
public class Meal {
	public static void main (String[] args) {
		MeatChef Odie = new MeatChef("Odie");
		SoupChef Nermal = new SoupChef("Nermal");
		PastaChef Jon = new PastaChef("Jon");
		MeatChef Garfield = new MeatChef("Garfield");
		
		ChefRegistry soupChefList = new ChefRegistry();
		ChefRegistry pastaChefList = new ChefRegistry();
		ChefRegistry meatChefList = new ChefRegistry();
		
		meatChefList.addChef(Odie);
		soupChefList.addChef(Nermal);
		pastaChefList.addChef(Jon);
		meatChefList.addChef(Garfield);
		
		ChefRegistry chefList = new ChefRegistry();
		
		chefList.addChef(meatChefList);
		chefList.addChef(soupChefList);
		chefList.addChef(pastaChefList);
		
		chefList.mealMade();
		
		
	}
}
