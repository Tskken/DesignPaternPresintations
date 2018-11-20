import java.util.ArrayList; 
import java.util.List; 
  
public class Composite implements Component{
    private List<Component> componentList = new ArrayList<Component>(); 
       
    @Override
    public void allTrigger()  
    { 
        for(Component component:componentList) 
        { 
            component.allTrigger(); 
        } 
    } 
       
    public void add(Component component) 
    { 
        componentList.add(component); 
    } 
       
    public void remove(Component component) 
    { 
        componentList.remove(component); 
    } 
} 


