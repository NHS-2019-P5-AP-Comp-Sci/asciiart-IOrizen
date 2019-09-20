/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main(String[] args) {
		Tab(); headTop(); Tab(); headTop();
		New();
		System.out.print("               "); face1(); System.out.print("       "); face2();
		New();
		Tab(); headBottom(); Tab(); headBottom();
		New();
		Tab(); bigLayer();
		New();
		Tab(); bigArm();
		New();
		Tab(); bigArm();
		New();
		Tab(); bodyArm(); System.out.print("||||<>|||"); bodyArm();
		New();
		Tab(); bigArm();
		New();
		Tab(); bigArm();
		New();
		Tab(); bigLayer();
		New();
		Tab(); beltLayer();
		New();
		Tab(); legLayer();
		New();
		Tab(); legLayer();
		New();
		Tab(); legLayer();
		New();
		Tab(); legLayer();
		New();
		System.out.print("\n (((Good programming always starts with a handshake!)))");
	}
	public static void headTop() {
		System.out.print("/\"\"\"\"\"\\");
	}
	public static void headBottom() {
		System.out.print("\\-----/");
	}
	public static void face1() {
		System.out.print("(| *_* |)");
	}
	public static void face2() {
		System.out.print("(| ^-^ |)");
	}
	public static void New() {
		System.out.println();
	}
	public static void Tab() {
		System.out.print("\t\t");
	}
	public static void bodyLayer() {
		System.out.print("#######");
	}
	public static void bodyArm() {
		System.out.print("##___##");
	}
	public static void bigLayer() {
		bodyLayer(); Tab(); bodyLayer();
	}
	public static void bigArm() {
		bodyArm(); Tab(); bodyArm();
	}
	public static void belt() {
		System.out.print("HHHOHHH");
	}
	public static void beltLayer() {
		belt(); Tab(); belt();
	}
	public static void legs() {
		System.out.print("HHH HHH");
	}
	public static void legLayer() {
		legs(); Tab(); legs();
	}
}