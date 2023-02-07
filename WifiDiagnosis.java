/*
 * Class: CMSC203 CRN 31569
 * Instructor: Professor Tarek
 * Description: a program that assists the user in completing a Wifi diagnosis
 *              through a few questions
 * Due: 2/7/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Fikir Seifu 
 */
import java.util.Scanner;
public class WifiDiagnosis {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 
	 //opening statement
	 System.out.println("If you have a problem with internet connectivity, "
	 		+ "this Wifi Diagnois might work.\n");
	 
	 //If/else statements that display instructions based on user input
	 System.out.println("First step: reboot your computer");
	 System.out.println("Are you able to connect with the internet? (yes or no)");
	 
	 //accepts user's input
	 String step1=scan.nextLine();
	 if(step1.equalsIgnoreCase("yes")) {
		 System.out.println("Rebooting your computer seemed to work.");
		 System.exit(0);
	 }
	 else if(step1.equalsIgnoreCase("no")){
		 System.out.println("Second step: reboot your router");
		 System.out.println("Now are you able to connect with the internet? (yes or no)");
	 }
	 else {
		 System.out.print("Invalid input");
		 System.exit(0);
	 }
	 
	 String step2=scan.nextLine();
	 if(step2.equalsIgnoreCase("yes")) {
		 System.out.println("Rebooting your router seemed to work.");
		 System.exit(0);
	 }
	 else if(step2.equalsIgnoreCase("no")){
		 System.out.println("Third step: make sure the cables to your router are plugged in "
		 		+ "firmly and your router is getting power");
		 System.out.println("Now are you able to connect with the internet? (yes or no)");
	 }
	 else {
		 System.out.print("Invalid input");
		 System.exit(0);
	 }
	 
	 String step3=scan.nextLine();
	 if(step3.equalsIgnoreCase("yes")) {
		 System.out.println("Plugging your cables to the router seemed to work.");
		 System.exit(0);
	 }
	 else if(step3.equalsIgnoreCase("no")){
		 System.out.println("Fourth step: move your computer closer to your router");
		 System.out.println("Now are you able to connect with the internet? (yes or no)");
	 }
	 else {
		 System.out.print("Invalid input");
		 System.exit(0);
	 }
	 
	 String step4=scan.nextLine();
	 if(step4.equalsIgnoreCase("yes")) {
		 System.out.println("Moving your computer closer to the router seemed to work.");
		 System.exit(0);
	 }
	 else if(step4.equalsIgnoreCase("no")) {
		 System.out.println("Fifth step: contact your ISP");
		 System.out.println("Make sure your ISP is hooked up to your router.");
	 }
	 //closes Scanner
	 scan.close();
 }
}


