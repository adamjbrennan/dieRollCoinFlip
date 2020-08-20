package dieRollCoinFlip;

import java.util.ArrayList;

public class CoinList extends ArrayList<Coin> {
	
	private static final long serialVersionUID = 1L;
	
	public CoinList() {
		super();
	}

	public CoinList(int ic) {
		super(ic);
		for(int i = 0; i < ic; i++)
			add(new Coin());
	}
	
	public void flipCoins() {
		for(Coin c: this)
			c.flipCoin();
	}
	
	public boolean isAllOneSided() {
		boolean firstSide = get(0).getCurrentSide();
		for(Coin c: this)
			if(c.getCurrentSide() != firstSide)
				return false;
		return true;
	}
	
	public int flipUntilAllAreOneSide() {
		int totalFlips = 1;
		while(!isAllOneSided()) {
			flipCoins();
			totalFlips++;
			System.out.println(this);
		}
		System.out.println("The CoinList was flipped " + totalFlips + " times.");
		return totalFlips;
	}
	
	public void delete() {
		clear();
		
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(Coin c: this) {
			s.append(c.toString() + "\n");
		}
		return s.toString();
	}
	

}
