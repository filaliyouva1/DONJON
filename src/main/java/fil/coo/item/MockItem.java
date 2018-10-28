package fil.coo.item;
import fil.coo.character.*;
/**
*Item Mock.
*/
public class MockItem implements Item{
  public MockItem(){

  }

  public int getBonus(){
    return 9999;
  }
  
  public void usedBy(Player p){
  }

  public String toString(){
    return "Mock Item";
  }
}
