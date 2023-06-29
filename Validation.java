package com.regex;
import java.util.Scanner;
public class Validation {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Regex1  validation=new Regex1 ();
            System.out.println("Enter First Name : ");
            validation.checkFirstName();
            System.out.println("Enter Last Name : ");
            validation.checkLastName();
            System.out.println("Enter Email : ");
            validation.checkEmail();
            System.out.println("Enter PhoneNumber : "); //eg-- 91 4657574775
            validation.checkPhoneNumber();
            System.out.println("Enter Password as per Rule 1: "); //Rule1 -minimum 8 Characters
            validation.checkPasswordRule1();
            System.out.println("Enter Password as per Rule 2: "); //Rule2 -Should have at least 1 Upper Case
            validation.checkPasswordRule2();
            System.out.println("Enter Password as per Rule 3: "); //Rule3 – Should have at least 1 numeric number in the password
            validation.checkPasswordRule3();
            System.out.println("Enter Password as per Rule 4: "); //Rule4 – Has exactly 1 Special Character
            validation.checkPasswordRule4();
            System.out.println("Check All the Sample of Email Id: ");
            int choice;
            do {
                System.out.println("1.Check Email Id \n2.Exit  ");
                System.out.println("Enter Choise");                                     // 1. abc@yahoo.com
                choice = sc.nextInt();                                                  // 2. abc-100@yahoo.com
                switch (choice) {                                                       // 3. abc.100@yahoo.com
                    case 1:                                                             // 2. abc111@abc.com
                        validation.checkEmail2();                                       // 4. abc-100@abc.net
                        break;                                                          // 5. abc.100@abc.com.au
                    case 2:                                                             // 6. abc@1.com
                        System.out.println("exit");                                     //8. abc+100@gmail.com
                        break;                                                          // 7. abc@gmail.com.com
                    default:
                        System.out.println("Invalid Input: ");
                        break;
                }
            }while (choice != 1);
        }
    }

