package fil.coo.character;
/**
*Abstract Class Character.
*
*/
public abstract class Character {
	protected String name;
	protected int LP;
	protected int Strength;
	protected int Gold;
	/**
	*Class Constructor
	*@param name this Character's name.
	*@param LP this Character's Life Points.
	*@param Strength this Character's Strength.
	*@param Gold this Character's Gold.
	*/
	public Character(String name, int LP, int Strength,int Gold) {
		this.name=name;
		this.LP=LP;
		this.Strength=Strength;
		this.Gold=Gold;
	}
	/**
  *Adds LP to this Character.
  *@param l LP to be added to this Character.
  */
	public void addLP(int l){
		this.LP+=l;
	}
	/**
  *Removes LP to this Character.
  *@param l LP to be removed to this Character.
  */
	public void removeLP(int l){
		this.LP-=l;
	}
	/**
  *Adds Strength to this Character.
  *@param l Strength to be added to this Character.
  */
	public void addStrength(int l){
		this.Strength+=l;
	}
	/**
  *Removes Strength to this Character.
  *@param l Strength to be removed to this Character.
  */
	public void removeStrength(int l){
		this.Strength-=l;
	}
	/**
  *Adds Gold to this Character.
  *@param l Gold to be added to this Character.
  */
	public void addGold(int l){
		this.Gold+=l;
	}
	/**
  *Removes Gold to this Character.
  *@param l Gold to be removed to this Character.
  */
	public void removeGold(int l){
		this.Gold-=l;
	}
	/**
  *Returns this Character's LP.
  *@return this Character's LP.
  */
	public int getLP(){
		return this.LP;
	}
	/**
  *Returns this Character's Gold.
  *@return this Character's Gold.
  */
	public int getGold(){
		return this.Gold;
	}
	/**
  *Returns this Character's Strength.
  *@return this Character's Strength.
  */
	public int getStrength(){
		return this.Strength;
	}
	/**
  *Returns this Character's Name.
  *@return this Character's Name.
  */
	public String getName(){
		return this.name;
	}

	/**
	 * Returns true if this Character is dead and false if not.
	 * @return true if this Character is dead and false if not.
	 */
	public boolean isDead() {
		return this.getLP()<=0;
	}
	/**
	 * Makes this Character attack c if it's alive.
	 * @param c the Character to be attacked.
	 */
	public void attack(Character c) {
		if(!c.isDead())
			c.removeLP(this.Strength);
	}
}
