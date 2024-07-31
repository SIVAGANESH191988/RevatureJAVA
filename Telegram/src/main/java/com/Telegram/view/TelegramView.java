package com.Telegram.view;

import java.util.Scanner;

import com.Telegram.controller.TelegramController;
import com.Telegram.controller.TelegramControllerInterface;

public class TelegramView {
	public static void main( String[] args )
    {
       System.out.println("Welcome");
       System.out.println( "press 1 to create profile " );
       System.out.println("press 2 to view profile");
       System.out.println("press 3 to search profile");
       System.out.println("press 4 to edit profile");
       System.out.println("press 5 to delete profile");
       System.out.println("press 6 to login profile");
       Scanner sc =new Scanner(System.in);
       int c=sc.nextInt();
       TelegramControllerInterface Tc=new TelegramController();
       switch(c)
       {
       case 1:
       	Tc.CreateProfile();
       	break;
       case 2:
       	break;
       case 3:
       	break;
       case 4:
       	break;
       case 5:
       	break;
       case 6:
       	break;
      default:
       	System.out.println("enter valid option");
       }
       
       
   
    }
}
