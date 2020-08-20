package dieRollCoinFlip;

public class Die {
	
		private static int totalDie = 0;
		private int DieID;
		private int currentSide;
		private int numSides;
	
	
		public Die() {
			this(6);
		}
		
		public Die(int ns) {
			totalDie++;
			DieID = totalDie;
			numSides = ns;
			roll();
		}
		
		public void roll() {
			currentSide = (int)(Math.random() * numSides + 1);
		}
		
		public String toString() {
			return "Die #" + DieID + " last rolled " + currentSide + ".";
		}
		
		public static int getTotalDie() {
			return totalDie;
		}
		
		public int getDieID() {
			return DieID;
		}
		
		public int getCurrentSide() {
			return currentSide;
		}
		
		public int getNumSides() {
			return numSides;
		}
		public static void setTotalDie(int i) {
			totalDie = i;
		}
		
}
