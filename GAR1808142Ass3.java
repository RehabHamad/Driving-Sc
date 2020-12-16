// By  Rehab Hamad

// Program Number: # 3
//*****************************************************
package gar1808142ass3;

import java.util.Scanner;
 
public class GAR1808142Ass3 {

    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);  
      String Summary="";// هذا المتغير لل Summary
       while(true) {// loop 1  
     System.out.println("------Jeddah Driving School Welcomes You ------");
     System.out.println();
     System.out.println("-----Choose one of the following-----");
     System.out.println();
     System.out.println("1: Advanced Driving Skills with expired driver's license");
     System.out.println("2: Intermediate Driving Skills without prior driving license");
     System.out.println("3: Novice Driving Skills without any previous driving knowledge");
     System.out.println("4: Display summary and Exit");
     int Choose=input.nextInt();
     
        if(Choose==1||Choose==2||Choose==3||Choose==4){
        }else 
         
      System.out.println("            ----- Wrong Entry. Try Again -----    ");
       System.out.println("");
      
    // في حال اختار ثلاثه 
     if(Choose==3){
        while(true) {//loop 2
      System.out.println("----- Registration -----");   
      System.out.println("");         
      System.out.println("Enter your full name (first and lastname) "); 
      System.out.println("");
      String FristName=input.next();
      String LastName =input.next();
      System.out.println("Enter your National ID ");
      System.out.println("");
      String Choosenational=input.next();
      System.out.println("Enter your phone number ");
      System.out.println("");
      String Choosephone=input.next();
      
      Summary+="\n"+"full name : "+FristName+" "+ LastName+"\n\n";
      Summary+="National ID : "+Choosenational +"\n\n";        
      Summary+="phone number : "+Choosephone+"\n\n";       
      Summary+="------------------------------------------------";
      
      System.out.println("You have to register in the full training course consisting of 30 training hours with a total cost of  2,400 Riyals (excluding VAT)");
      System.out.println(" Need more info (Y/N)?");
     String Chooseyn=input.next();
      
      if(Chooseyn.equals("Y")||Chooseyn.equals("y")){
      System.out.println("");
      System.out.println("Fees break down");   
      System.out.println("");       
      System.out.println("Item                    No. of Units          Unit Price (SR)   Cost (SR)    ");       
      System.out.println("");
      System.out.println("Theoretical Lectures      8 hours               75                600 ");
      System.out.println("");
      System.out.println("Knowledge Test            1 test                75                75  ");
      System.out.println("");
      System.out.println("Simulator Classes         2 hours               75                150");
      System.out.println("");
      System.out.println("Practical Training        20 hours              75                1500  ");
      System.out.println("");
      System.out.println("Road Test                 1 test                75                75    ");
      System.out.println("");
      System.out.println("Total                                                             2,400  SR   ");         
        System.out.println("");
        System.out.println("");
      }
      else if (Chooseyn.equals("N")||Chooseyn.equals("n")){
      
      }
     
        break;
        }
     } 
             
     //*****************************************************************************************************************
     
    // في حال اختار  اثنان 
    
    
       if (Choose==2){
             while(true){//loop3
      System.out.println("----- Registration -----");   
      System.out.println("");         
      System.out.println("Enter your full name (first and lastname) "); 
      System.out.println("");
      String FristName2=input.next();
      String LastName2 =input.next();
      System.out.println("Enter your National ID ");
      System.out.println("");
      String Choosenational2=input.next();
      System.out.println("Enter your phone number ");
      System.out.println("");
      String Choosephone2=input.next();
        
      Summary+="\n"+"full name : "+FristName2+" "+ LastName2+"\n\n";
      Summary+="National ID : "+Choosenational2 +"\n\n";        
      Summary+="phone number : "+Choosephone2+"\n\n";       
      Summary+="------------------------------------------------";
      
             while(true){//loop 4
         System.out.println("");
        System.out.println("");
        System.out.println("Based on your driving level test result, Choose one of the following (1, 2 or 3):");
        System.out.println("");
        System.out.println("1: Class 1 -> A 6 hours driving training course should to be attended");
        System.out.println("");
        System.out.println("2: Class 2 -> A 12 hours driving training course should to be attended");
        System.out.println("");
        System.out.println("3: Class 3 -> A 30 hours driving training course should to be attended");
             
       int Choose2=input.nextInt();   
                 
         if(Choose2==1||Choose2==2||Choose2==3){
             
         }
         else
     System.out.println("                  Wrong Entry!!            "); 
      System.out.println("");
         
             
         // في حال اختار واحد في الخيار الثاني 
         if(Choose2==1){
          
          System.out.println("");
          System.out.println("You have to register in the refresher training course with a minimum of 6 hours of lessons");   
          System.out.println("");
          System.out.println("Fees break down");
          System.out.println("");
          System.out.println("Item                         No. of Units        Unit Price (SR)     Cost (SR)");
          System.out.println("");
          System.out.println("Practical Training           6 hours             75                  450");
          System.out.println("");
          System.out.println("Road Test                    1 test              75                  75 ");
          System.out.println("");
          System.out.println("Total                                                                525  SR");
            System.out.println("");
            System.out.println("");
          break;
         }
         // في حال اختاراثنان في الخيار الثاني 
         else if (Choose2==2){
           System.out.println("");
          System.out.println("You have to register in the training course with a minimum of 12 hours of lessons");   
          System.out.println("");
          System.out.println("Fees break down");
          System.out.println("");
          System.out.println("Item                         No. of Units          Unit Price (SR)               Cost (SR)");
          System.out.println("");
          System.out.println("Theoretical Lectures         4 hours                75                           300            ");
          System.out.println("");
          System.out.println("Knowledge Test               1 test                 75                           75   ");
          System.out.println("");
          System.out.println("Practical Training           8 hours                75                           600 ");
          System.out.println("");
          System.out.println("Road Test                    1 test                 75                           75");  
          System.out.println("");  
          System.out.println("Total                                                                            1,050  SR");    
           System.out.println("");  
           System.out.println("");  
          break;     
         }
         else if (Choose2==3){
                System.out.println("");
          System.out.println("You have to register in the full training course consisting of 30 training hours");   
          System.out.println("");
          System.out.println("Fees break down");
          System.out.println("");
          System.out.println("Item                    No. of Units          Unit Price (SR)                 Cost (SR)");
          System.out.println("");
          System.out.println("Theoretical Lectures     8 hours                 75                	        600");
          System.out.println("");
          System.out.println("Knowledge Test           1 test                  75                                75");
          System.out.println("");
          System.out.println("Simulator Classes        2 hours                 75                                150");
          System.out.println("");
          System.out.println("Practical Training       20 hours                75                               1500");  
          System.out.println("");  
          System.out.println("Road Test                1 test                  75                                 75 ");    
          System.out.println("");  
          System.out.println("Total                                                                            2,400  SR");  
            System.out.println("");    
             System.out.println(""); 
          break;   
         }
         continue;
             }
        break;    
       }
   
    }
     
      
       if (Choose==1){
       while(true){//loop 5
      System.out.println("----- Registration -----");   
      System.out.println("");         
      System.out.println("Enter your full name (first and lastname) "); 
      System.out.println("");
      String FristName1=input.next();
      String LastName1 =input.next();
      FristName1=FristName1.toUpperCase();
       LastName1 =LastName1.toUpperCase();
      System.out.println("Enter your National ID ");
      System.out.println("");
      String Choosenational1=input.next();
      System.out.println("Enter your phone number ");
      System.out.println("");
      String Choosephone1=input.next();   
               
      Summary+="\n"+"full name : "+FristName1+" "+ LastName1+"\n\n";
      Summary+="National ID : "+Choosenational1 +"\n\n";        
      Summary+="phone number : "+Choosephone1+"\n\n";       
      Summary+="------------------------------------------------";
      
         System.out.println("You have to register in the full training course consisting of 30 training hours with a total cost of  2,400 Riyals (excluding VAT)");
      System.out.println(" Need more info (Y/N)?");
       String Chooseyn1=input.next();
     
        
      if(Chooseyn1.equals("Y")||Chooseyn1.equals("y")){
      System.out.println("");
      System.out.println("Fees break down");   
      System.out.println("");       
      System.out.println("Item                    No. of Units          Unit Price (SR)   Cost (SR) ");       
      System.out.println("");
      System.out.println("Practical Training           6 hours             75                  450 ");
      System.out.println("");
      System.out.println("Road Test                    1 test              75                  75 ");
      System.out.println("");
      System.out.println("Total   							     525  SR  ");
      System.out.println("");
      System.out.println("");
      System.out.println("");
     
      }
      break;
       }
       
       }//  في حال اختاراربعة  
        if (Choose==4){
         System.out.println("");
         System.out.println("----------- Summary ----------");
         System.out.println("");
         System.out.println(Summary);
         
         // خروج من البرنامج 
         System.exit(0);
        
        }
        // we have five  loops      
}            
  }
    
}
