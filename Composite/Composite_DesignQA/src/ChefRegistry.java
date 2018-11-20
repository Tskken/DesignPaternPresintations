import java.util.ArrayList; 
import java.util.List; 
  
public class ChefRegistry implements Chef{
    private List<Chef> chefList = new ArrayList<Chef>(); 
       
    @Override
    public void mealMade()  
    { 
        for(Chef chef:chefList) 
        { 
            chef.mealMade(); 
        } 
    } 
       
    public void addChef(Chef chef) 
    { 
        chefList.add(chef); 
    } 
       
    public void removeChef(Chef chef) 
    { 
        chefList.remove(chef); 
    } 
} 


