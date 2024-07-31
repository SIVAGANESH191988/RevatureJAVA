package com.Instagram.view;

import java.util.Scanner;

import com.Instagram.controller.InstagramController;
import com.Instagram.controller.InstagramControllerInterface;

/**
 * Hello world!
 *
 */
public class InstagramView
{
    public static void main( String[] args )
    {
        System.out.println( "press 1 to create profile " );
        System.out.println("press 2 to view profile");
        System.out.println("press 3 to search profile");
        System.out.println("press 4 to edit profile");
        System.out.println("press 5 to delete profile");
        System.out.println("press 6 to login profile");
        Scanner sc =new Scanner(System.in);
        int c=sc.nextInt();
        InstagramControllerInterface Ic=new InstagramController();
        switch(c)
        {
        case 1:
        	Ic.CreateProfile();
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
