package fil.coo.character;
import java.util.*;
import fil.coo.direction.*;
import java.util.*;
import fil.coo.item.*;
import org.junit.*;
import static org.junit.Assert.*;



public abstract class CharacterTest{

    protected Character ch;
    protected Character ch2;


  @Before
  public void init(){

    ch=createCharacter();
    ch2=createCharacter();
  }

public abstract Character createCharacter();

@Test
public void characterTest(){
  assertNotNull(ch);
}

@Test
public void addLPTest(){
    ch.addLP(5);
    assertEquals(ch.getLP(),15);
}


@Test
public void removeLPTest(){
  ch.removeLP(5);
  assertEquals(ch.getLP(),5);
}

@Test
public void addStrengthTest(){
  ch.addStrength(5);
  assertEquals(ch.getStrength(),15);
}

@Test
public void removeStrengthTest(){
  ch.removeStrength(5);
  assertEquals(ch.getStrength(),5);

}

@Test
public void addGoldTest(){
  ch.addGold(5);
  assertEquals(ch.getGold(),15);
}

@Test
public void removeGoldTest(){
  ch.removeGold(5);
  assertEquals(ch.getGold(),5);
}

@Test
public void getGoldTest(){
  assertEquals(ch.getGold(),10);
}

@Test
public void getLPTest(){
  assertEquals(ch.getLP(),10);
}


@Test
public void getStrengthTest(){
  assertEquals(ch.getStrength(),10);
}

@Test
public void isDeadTest(){
  ch.removeLP(10);
  assertTrue(ch.isDead());
}

@Test
public void attackTEst(){
  ch.attack(ch2);
  assertTrue(ch2.isDead());
}













}
