
public class Client {
	public static void main (String[] args) {
		Leaf1 one = new Leaf1();
		Leaf1 two = new Leaf1();
		Leaf2 three = new Leaf2();
		
		Composite firstList = new Composite();
		Composite secondList = new Composite();
		
		firstList.add(one);
		firstList.add(two);
		secondList.add(three);
		
		Composite thirdList = new Composite();
		
		thirdList.add(firstList);
		thirdList.add(secondList);
		
		thirdList.allTrigger();
		
		
	}
}
