import java.util.Scanner;
public class Methods {

	public static void main(String[] args) {
		print(1);
        print("\nEnter a String to be displayed\n");
        print(inputString());
    }

    //This method does not return any value
    static void print(String message){
        System.out.print(message);
    }
    //This method overloading the pervios method
    static void print(int number){
        System.out.print(number);
    }
    //This method returns a value
    static String inputString(){
        Scanner in=new Scanner(System.in);
        return in.nextLine();
    }
}


	


