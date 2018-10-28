package fil.coo.character ;
import java.util.*;
import fil.coo.direction.*;
import java.util.*;
import fil.coo.item.*;
import org.junit.*;
import static org.junit.Assert.*;



public class MonsterTest extends CharacterTest{


public Character createCharacter(){
  return new Monster("moha",10,10,10);
}
}
