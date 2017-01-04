


public interface State {
	
	/**
	 * Insert money.
	 *
	 * @return the string
	 */
	public void insertMoney();
	
	/**
	 * Eject money.
	 *
	 * @return the string
	 */
	public void ejectMoney();
	
	/**
	 * dispense item.
	 *
	 * @return the string
	 */
	public void dispenseWater();
	
	
	
	/**
	 * 
	 * Refill Machine
	 * 
	 * @return the string
	 */
	public void refillMachine();
	
	
	/**
	 *
	 *Dispense coin
	 *
	 *@return string
	 */
	public void dispenseCoin();
	
	
	/**
	 * 
	 * Select Water
	 * 
	 * @ return string
	 */
	public void selectWater();
}
