package com.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    Scanner sc = new Scanner(System.in);

        public void checkFirstName() {
            String firstName = sc.nextLine();
            if (Pattern.matches("^[A-Z]{1}[a-z]{3,}", firstName)) {
                System.out.println("First Name is Valid---!!");
            } else {
                System.out.println("First Name is Invalid--!!");
                checkFirstName();
            }
        }

        public void checkLastName() {
            System.out.println("-----------------");
            String lastName = sc.nextLine();
            if (Pattern.matches("^[A-Z]{1}[a-z]{3,}", lastName)) {
                System.out.println("LastName is Valid---!!");
            } else {
                System.out.println("LastName is Invalid--!!");
                checkLastName();
            }
        }

        public void checkEmail() {
            System.out.println("-----------------");
            String email = sc.nextLine();
            if (Pattern.matches("[a-zA-Z0-9.]{1,}[@]{1}[a-zA-Z]{1,}[.][c]{1}[o]{1}[m]{1}", email)) {
                System.out.println("Email is Valid---!!");
            } else {
                System.out.println("Email is Invalid--!!");
                checkEmail();
            }
        }

        public void checkPhoneNumber() {
            System.out.println("-----------------");
            String phoneNumber = sc.nextLine();
            if (Pattern.matches("[9][1][ ]{1}[0-9]{10}", phoneNumber)) {
                System.out.println("PhoneNumber is Valid---!!");
            } else {
                System.out.println("PhoneNumber is Invalid--!!");
                checkPhoneNumber();
            }
        }

        public void checkPasswordRule1() {
            System.out.println("-----------------");
            String password = sc.nextLine();
            if (Pattern.matches("^[a-zA-z]{8,}", password)) {
                System.out.println("Password is Valid---!!");
            } else {
                System.out.println("Password is Invalid--!!");
                checkPasswordRule1();
            }
        }

        public void checkPasswordRule2() {
            System.out.println("-----------------");
            String password = sc.nextLine();
            if (Pattern.matches("^[A-z]+[A-Za-z]{8,}", password)) {
                System.out.println("Password is Valid---!!");
            } else {
                System.out.println("Password is Invalid--!!");
                checkPasswordRule2();
            }
        }

        public void checkPasswordRule3() {
            System.out.println("-----------------");
            String password = sc.nextLine();
            if (Pattern.matches("^[A-Z]+[A-Za-z0-9]{8,}", password)) {
                System.out.println("Password is Valid---!!");
            } else {
                System.out.println("Password is Invalid--!!");
                checkPasswordRule3();
            }
        }

        public void checkPasswordRule4() {
            System.out.println("-----------------");
            String password = sc.nextLine();
            if (Pattern.matches("^[A-Z]+[A-Za-z0-9]{7,}[!@#$%^&*()=]+", password)) {
                System.out.println("Password is Valid---!!");
            } else {
                System.out.println("Password is Invalid--!!");
                checkPasswordRule4();
            }
        }

        public void checkEmail2() {
            System.out.println("-----------------");
            System.out.println("Enter Email Id: ");
            String email = sc.nextLine();
            if (Pattern.matches("^[a-zA-Z]{3,}[+-.]?[A-za-z0-9]*[@]{1}[a-z]+[.]?[a-z]*[.]?[a-z]", email)) {
                System.out.println("Email is Valid---!!");
                checkEmail2();
            } else {
                System.out.println("Email is Invalid--!!");
                checkEmail2();
            }
        }
    }
