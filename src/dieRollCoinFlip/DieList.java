package dieRollCoinFlip;

import java.util.ArrayList;

public class DieList extends ArrayList<Die> {
	
	private static final long serialVersionUID = 1L;
	
	public DieList() {
		super();
	}

	public DieList(int ic) {
		this(ic, 6);
	}
	
	public DieList(int ic, int s) {
		super(ic);
		fillDieList(ic , s);
	}
	
	public void fillDieList(int ic, int s) {
		for(int i = 0; i < ic; i++)
			add(new Die(s));
	}
	
	public void rollDie() {
		for(Die d: this)
			d.roll();
	}
	
	public void delete() {
		clear();
		Die.setTotalDie(0);
	}
	
	public boolean isAllOneSided() {
		int initialSide = get(0).getCurrentSide();
		for(Die d: this)
			if(d.getCurrentSide() != initialSide)
				return false;
		return true;
	}
	
	public int rollUntilAllAreSameSide() {
		int totalRolls = 1;
		while(!isAllOneSided()) {
			rollDie();
			totalRolls++;
			System.out.println(this);
		}
		System.out.println("The DieList was flipped " + totalRolls + " times.");
		return totalRolls;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		for(Die d: this)
			s.append(d + "\n");
		return s.toString();
	}

}
