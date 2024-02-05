package myNinthProject;
import java.util.Scanner;

public class UserLogin {
	public static void main(String[]args) {
		String userName,password;
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter your username:");
		userName=input.nextLine();
        System.out.print("Please enter your password:");
        password=input.nextLine();
        if(userName.equals("PatikaDev")&&password.equals("Java101")) {
        	System.out.println("Logged in");
        }
        	else {
        		System.out.print("Your info is wrong If you want to reset your password,please enter 0: ");
        		int resetKey=input.nextInt();
        		if(resetKey==0) {
        			Scanner input2=new Scanner(System.in);
        			System.out.print("Please enter your new password:");
        		
        		 String recentPassword=input2.nextLine();
        			if(recentPassword.equals("Java101")){
        				System.out.println("Password can not be created,please enter different password");
        			}
        		
        		
        				
        		
        			else {
        				System.out.println("Password was created");
        			}
        			}
        		
        		
        	}
        }
	}



