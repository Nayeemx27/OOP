/*Name: H M Naymur Rahman
ID: 2012020327
Section: 5(G)
Email: cse_2012020327@lus.ac.bd
Date:15/09/2021
*/

package naymur_rahman;

public class Cricket extends Sports {
	String matchType;
	int over;
	Player player;

	Cricket(String matchType, int over, Player player) {
		this.matchType = matchType;
		this.over = over;
		this.player = player;
	}

	void display() {
		System.out.println("Match Type: " + matchType);
		System.out.println("Over of the Match: " + over);
		System.out.println("Name of the Player: " + player.playerName);
		System.out.println("Jersey No. of the Player: " + player.jerseyNumber);
	}
}
