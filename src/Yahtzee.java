
public class Yahtzee {
	private int[] dice;
	
	public Yahtzee() {
		dice = new int[5];
	}
	
	public static int ones(int d1, int d2, int d3, int d4, int d5) {
		int total = 0;
		
		if(d1 == 1) {
			total++;
		}
		if(d2 == 1) {
			total++;
		}
		if(d3 == 1) {
			total++;
		}
		if(d4 == 1) {
			total++;
		}
		if(d5 == 1) {
			total++;
		}
		
		return total;
	}
	
	public static int twos(int d1, int d2, int d3, int d4, int d5) {
		int total = 0;
		
		if(d1 == 2) {
			total += 2;
		}
		if(d2 == 2) {
			total += 2;
		}
		if(d3 == 2) {
			total += 2;
		}
		if(d4 == 2) {
			total += 2;
		}
		if(d5 == 2) {
			total +=2;
		}
		
		return total;
	}
	
	public static int threes(int d1, int d2, int d3, int d4, int d5) {
		int total = 0;
		
		if(d1 == 3) {
			total += 3;
		}
		if(d2 == 3) {
			total += 3;
		}
		if(d3 == 3) {
			total += 3;
		}
		if(d4 == 3) {
			total += 3;
		}
		if(d5 == 3) {
			total +=3;
		}
		
		return total;
	}
	
	public static int fours(int d1, int d2, int d3, int d4, int d5) {
		int total = 0;
		
		if(d1 == 4) {
			total += 4;
		}
		if(d2 == 4) {
			total += 4;
		}
		if(d3 == 4) {
			total += 4;
		}
		if(d4 == 4) {
			total += 4;
		}
		if(d5 == 4) {
			total +=4;
		}
		
		return total;
	}
	
	public static int fives(int d1, int d2, int d3, int d4, int d5) {
		int total = 0;
		
		if(d1 == 5) {
			total += 5;
		}
		if(d2 == 5) {
			total += 5;
		}
		if(d3 == 5) {
			total += 5;
		}
		if(d4 == 5) {
			total += 5;
		}
		if(d5 == 5) {
			total +=5;
		}
		
		return total;
	}
	
	public static int sixes(int d1, int d2, int d3, int d4, int d5) {
		int total = 0;
		
		if(d1 == 6) {
			total += 6;
		}
		if(d2 == 6) {
			total += 6;
		}
		if(d3 == 6) {
			total += 6;
		}
		if(d4 == 6) {
			total += 6;
		}
		if(d5 == 6) {
			total += 6;
		}
		
		return total;
	}
	
	public static int pair(int d1, int d2, int d3, int d4, int d5) {
		int[] count = new int[6];
		count[d1-1]++;
		count[d2-1]++;
		count[d3-1]++;
		count[d4-1]++;
		count[d5-1]++;
		for (int i = 1; i < 6; i++) {
			if (count[6-i-1] >= 2) {
				return ((6-i) *2) ;
			}
		}
		
		return 0;
	}
	
	public static int twoPair(int d1, int d2, int d3, int d4, int d5) {
		int[] count = new int[6];
		count[d1-1]++;
		count[d2-1]++;
		count[d3-1]++;
		count[d4-1]++;
		count[d5-1]++;
		int pairs = 0;
		int score = 0;
		for (int i = 1; i < 6; i++) {
			if (count[6-i-1] >= 2) {
				pairs++;
				score += (6-i);
			}
		}
		if(pairs == 2) {
			return score * 2;
		}else {
			return score;
		}
	}
	
	public static int threeOfAKind(int d1, int d2, int d3, int d4, int d5) {
		int[] count = new int[6];
		count[d1-1]++;
		count[d2-1]++;
		count[d3-1]++;
		count[d4-1]++;
		count[d5-1]++;
		
		for (int i = 1; i < 6; i++) {
			if (count[6-i-1] >= 3) {
				return ((6-i) + (6-i) + (6-i)) ;
			}
		}
		return 0;	
	}
	
	public static int fourOfAKind(int d1, int d2, int d3, int d4, int d5) {
		int[] count = new int[6];
		count[d1-1]++;
		count[d2-1]++;
		count[d3-1]++;
		count[d4-1]++;
		count[d5-1]++;
		
		for (int i = 1; i < 6; i++) {
			if (count[6-i-1] >= 4) {
				return ((6-i) + (6-i) + (6-i) + (6-i)) ;
			}
		}
		return 0;
	}
	
	public static int scoreYahtzee(int d1, int d2, int d3, int d4, int d5) {
		int[] count = new int[6];
		count[d1-1]++;
		count[d2-1]++;
		count[d3-1]++;
		count[d4-1]++;
		count[d5-1]++;
		
		for (int i = 1; i < 6; i++) {
			if (count[6-i-1] >= 5) {
				return 50;
			}
		}
		return 0;
	}

	public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
		int[] count = new int[6];
		count[d1-1]++;
		count[d2-1]++;
		count[d3-1]++;
		count[d4-1]++;
		count[d5-1]++;
		
		if(count[0] == 1 && count[1] == 1 && count[2] == 1 && count[3] == 1 && count[4] == 1) {
			return 15;
		}else {
			return 0;
		}
	}
	
	public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
		int[] count = new int[6];
		count[d1-1]++;
		count[d2-1]++;
		count[d3-1]++;
		count[d4-1]++;
		count[d5-1]++;
		
		if(count[1] == 1 && count[2] == 1 && count[3] == 1 && count[4] == 1 && count[5] == 1) {
			return 20;
		}else {
			return 0;
		}
	}
	
	
	public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
		int[] count = new int[6];
		count[d1-1]++;
		count[d2-1]++;
		count[d3-1]++;
		count[d4-1]++;
		count[d5-1]++;
		
		boolean twos = false;
		boolean threes = false;
		int pair2 = 0;
		int pair3 = 0;
		
		for (int i = 0; i < 6; i++) {
			if (count[i] == 2) {
				twos = true;
				pair2 = i+1;
			}
		}
		for (int i = 0; i < 6; i++) {
			if (count[i] == 3) {
				threes = true;
				pair3 = i+1;
			}
		}
	
		if(twos && threes) {
			return pair2 * 2 + pair3 * 3;
		}else {
			return 0;
		}
	}
	
	public static int chance(int d1, int d2, int d3, int d4, int d5) {
		int[] dice = {d1, d2, d3, d4, d5};
		int score = 0;
		for (int i = 0; i < 5; i++) {
			score += dice[i];
		}
		
		
		return score;
	}
}//class
