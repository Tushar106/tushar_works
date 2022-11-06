                    package com.company;

                    import java.util.regex.*;
                    import java.util.*;

                    public class banking {
                          static String name;
                        static String password;
                        static int amount;
                    //    public banking()
                    //    {
                    //        name="";
                    //        amount=0;
                    //    }
                        public  static void  enter_name(String name1)
                        {
                            name=name1;
                    //        setPassword(password);
                        }
                        public static void deposite(int amount1)
                        {
                            amount=amount+amount1;
                            System.out.println("AMOUNT:-"+ amount);
                        }
                        public static void withdraw(int amount1)
                        {
                            if(amount1<=amount){
                            amount=amount-amount1;
                                System.out.println(amount);}
                            else
                                System.out.println("NULL!!");
                        }
                        public static void check_amount()
                        {
                            System.out.println(amount);
                        }
                        public static void setPassword()
                        {
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the valid password:-");
                            System.out.println("Containing atleast one upper case:-");
                            System.out.println("Containing atleast one number");
                            System.out.println("Containing atleast one @");
                            System.out.println("It must contain at least 8 character");
                            String password1=sc.next();
                            password=password1;
                             password_check(password);
                        }
                        public static void password_check(String password1)
                        {
                            String regex = "^(?=.*[0-9])"
                                    + "(?=.*[a-z])(?=.*[A-Z])"
                                    + "(?=.*[@])"
                                    + "(?=\\S+$).{8,20}$";

                            // Compile the ReGex
                            Pattern p = Pattern.compile(regex);

                            // If the password is empty
                            // return false
                            if (password == null) {
                                System.out.println("Not valid");
                            }

                            // Pattern class contains matcher() method
                            // to find matching between given password
                            // and regular expression.
                            Matcher m = p.matcher(password1);

                            // Return if the password
                            // matched the ReGex
                            if(m.matches()) {
                               System.out.println("Valid");
                               password=password1;}
                            else{
                                System.out.println("NOt valid");
                                setPassword();
                        }}


                        }
                        class new_user extends banking
                        {
                            public static void main(String[] args) {
                                Scanner sc=new Scanner(System.in);
                                banking obj=new banking();
                                System.out.println("Enter the name");
                                obj.enter_name(sc.next());
                                obj.setPassword();
                                banking_service ob1=new banking_service();
                                ob1.main(null);
                            }
                        }
                        class banking_service extends new_user
                        {
                            public static void main(String[] args) {
                                Scanner sc=new Scanner(System.in);


                                System.out.println("Enter the thing which u have to do");
                                System.out.println("1.Deposite");
                                System.out.println("2.Withdraw");
                                System.out.println("3.CheckBanking");
                                System.out.println("4.To Exit");
                                int choice=sc.nextInt();
                                int x=0;

                                switch(choice)
                                {
                                    case 1:
                                        System.out.println("Enter the amount:-");
                                        int deposite_amount= sc.nextInt();
                                        deposite(deposite_amount);
                                        break;
                                    case 2:
                                        System.out.println("Enter the amount:-");
                                        int withdram_amount=sc.nextInt();
                                        withdraw(withdram_amount);
                                        break;
                                    case 3:
                                        System.out.println("Your amount:- ");
                                        check_amount();
                                        break;
                                    case 4:
                                        x=1;
                                        System.out.println("THANKS YOU!!");
                                        break;
                                    default:
                                        System.out.println("Enter the valid input");
                                }
                                if (x!=1)
                                main(null);
                            }
                        }
