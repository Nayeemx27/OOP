/*Name: H M Naymur Rahman
ID: 2012020327
Section: 5(G)
Email: cse_2012020327@lus.ac.bd
Date:15/09/2021
*/

package naymur_rahman;

public class Main {

	public static void main(String[] args) {
		// Sports newSports = new Sports();
		Player newPlayer = new Player("Shakib", 75);
		Cricket newCricket = new Cricket("International match", 20, newPlayer);
		newCricket.display();
		Football football = new Football();
	}
}
