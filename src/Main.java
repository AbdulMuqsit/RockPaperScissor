// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import  java.util.Scanner;
import  java.util.Random;
public class Main {
    public static void main(String[] args) {
        //For rock choose 0
        //For paper choose 1
        //For scissor 2
        System.out.println("Enter Your Choice ");
        System.out.println("i.Press 0 for Rock ");
        System.out.println("ii.Press 1 for Paper");
        System.out.println("iii.Press 2 for Scissor");
        Scanner sc=new Scanner(System.in);
        int userchoice=sc.nextInt();
        Random rnd=new Random();
        int computerInput=rnd.nextInt(3);
        if(computerInput==userchoice)
        {
            System.out.println("Draw!");
        }
        else if(userchoice==0&&computerInput==2 || userchoice==1 && computerInput==0 ||userchoice==3&&computerInput==1)
        {
            System.out.println("User won!");
        }
        else
            System.out.println("Computer won!");

        System.out.println("Computer choosed "+computerInput);


    }
}