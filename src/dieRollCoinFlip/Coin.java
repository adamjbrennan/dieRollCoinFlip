package dieRollCoinFlip;

public class Coin {
	
	private static int totalCoins = 0;
	private int coinID;
	private boolean isHeads;
	
	public Coin() {
		totalCoins++;
		coinID = totalCoins;
		flipCoin();
	}
	
	public void flipCoin() {
		int side = (int)(Math.random() * 2);
		if(side == 0)
			isHeads = true;
		else
			isHeads = false;
	}
	
	public String toString() {
		if(isHeads)
			return "Coin #" + coinID + " last flipped heads.";
		else
			return "Coin #" + coinID + " last flipped tails.";
	}
	
	public int getCoinId() {
		return coinID;
	}
	
	public static int getTotalCoins() {
		return totalCoins;
	}
	
	public boolean getCurrentSide() {
		return isHeads;
	}
	public void setTotalCoins(int i) {
		totalCoins = i;
	}
}
