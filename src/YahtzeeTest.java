import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YahtzeeTest {

	@Test
	void testOnes() {
		int expected = 4;
		int actual = Yahtzee.ones(3, 1, 1, 1, 1);
		assertEquals(expected, actual);
	}
	@Test
	void testTwos() {
		int expected = 10;
		int actual = Yahtzee.twos(2, 2, 2, 2, 2);
		assertEquals(expected, actual);
	}
	@Test
	void testThrees() {
		int expected = 15;
		int actual = Yahtzee.threes(3, 3, 3, 3, 3);
		assertEquals(expected, actual);
	}
	@Test
	void testFours() {
		int expected = 20;
		int actual = Yahtzee.fours(4, 4, 4, 4, 4);
		assertEquals(expected, actual);
	}
	@Test
	void testFives() {
		int expected = 25;
		int actual = Yahtzee.fives(5, 5, 5, 5, 5);
		assertEquals(expected, actual);
	}
	@Test
	void testSixes() {
		int expected = 30;
		int actual = Yahtzee.sixes(6, 6, 6, 6, 6);
		assertEquals(expected, actual);
	}
	
	@Test
	void testPair() {
		int expected = 10;
		int actual = Yahtzee.pair(3, 3, 5, 5, 5);
		assertEquals(expected, actual);
	}
	@Test
	void testTwoPair() {
		int expected = 8;
		int actual = Yahtzee.twoPair(1, 1, 2, 3, 3);
		assertEquals(expected, actual);
	}

	@Test
	void testThreeOfAKind() {
		int expected = 6;
		int actual = Yahtzee.threeOfAKind(3, 2, 2, 2, 5);
		assertEquals(expected, actual);
	}
	@Test
	void testFourOfAKind() {
		int expected = 8;
		int actual = Yahtzee.fourOfAKind(2, 2, 2, 2, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	void testYahtzee() {
		int expected = 50;
		int actual = Yahtzee.scoreYahtzee(2, 2, 2, 2, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testSmallStraight() {
		int expected = 15;
		int actual = Yahtzee.smallStraight(1, 2, 3, 4, 5);
		assertEquals(expected, actual);
	}
	@Test
	void testlargeStraight() {
		int expected = 20;
		int actual = Yahtzee.largeStraight(2, 3, 4, 5, 6);
		assertEquals(expected, actual);
	}
	
	@Test
	void testFullHouse() {
		int expected = 8;
		int actual = Yahtzee.fullHouse(1, 1, 2, 2, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testChance() {
		int expected = 16;
		int actual = Yahtzee.chance(2, 1, 1, 6, 6);
		assertEquals(expected, actual);
	}
	
	
}//class
