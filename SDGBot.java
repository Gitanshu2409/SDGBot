import java.util.*;
public class SDGBot {
  public static void main(String[]args){
// Defining Scanner to read input.
    Scanner scnr = new Scanner(System.in);

// Welcome Program
      System.out.println("|*************************************************|");
      System.out.println("|***|Welcome to GPBCB, I am Still a Prototype.|***|");
      System.out.println("|*************************************************|");
      System.out.println("WARNING : Please provide all input in capital letters only.....");
      System.out.println("#Please enter your name, this will make it easier for me to talk to you.#");
    String usrname = scnr.nextLine();
      System.out.println("Nice to meet you : "+usrname);
      System.out.println("So, Choose how would you like me to behave.....(1/2)");
      System.out.println("1. Formal and Well Behaving.");
      System.out.println("2. Friend-like and Chaotic.");
    int behave = scnr.nextInt();

    if (behave == 1){
    System.out.println("Switching to Formal Behaviour");
    formal();
    }
    else if (behave == 2){
    System.out.println("Switching to Friendly Behaviour.....");
    friend();
    }
    else{
    System.out.println("Sorry i don't get that");
    }
// After Returning back to main().
    System.out.println("Well as i am a chatbot, I do serve a purpose");
    System.out.println("I can do the below tasks -- ");
    System.out.println("1. Calculate sum of two numbers...");
    System.out.println("2. Calculate product of two numbers...");
    System.out.println("3. Divide one number by another...");
    System.out.println("4. Calculate difference of two numbers...");
    System.out.println("5. Raise one munber to the power of another...");
    System.out.println("6. Keep chatting...");
    System.out.println("7. Tell you a random fact...");
    System.out.println("8. Terminate...");
    int inpt1 = 10;
    int inpt;
    System.out.println("Total input Limit : " +inpt1);
    int i;

    for(i=0,inpt = 10;i <= 10;i++,--inpt){
      int utask = scnr.nextInt();
      if(utask == 1){
        sumtwo();
      }
      else if(utask == 2){
        producttwo();
      }
      else if(utask == 3){
        divide();
      }
      else if(utask == 4){
        difftwo();
      }
      else if(utask == 5){
        powtwo();
      }
      else if(utask == 6){
        chat();
      }
      else if(utask == 7){
        fact();
      }
      else if(utask == 8){
        System.out.println("Please type EXIT.");
        String exit = scnr.nextLine();
      }
      else{
        System.out.println("Unaceptable input...");
        break;
      }

      System.out.println("Input Limit : " +inpt);
      if(inpt == 0){
        System.out.println("Well now i cannot not recieve any inputs, And its good bye time.");
        System.out.println("Have a nice day.");
        break;
      }
      else{
        continue;
      }

    }

}//main() ends here...

  static void sumtwo(){
    System.out.println("Sum will be given in form (a + b) please add a .0 at last for non decimal integers");
    Scanner sum = new Scanner (System.in);
    System.out.println("Value for a :");
    float sum1 = sum.nextFloat();
    System.out.println("Value for b :");
    float sum2 = sum.nextFloat();
    float resultsum = sum1 + sum2;
    System.out.println("Sum of a and b : "+resultsum);
    return;
  }

  static void difftwo(){
    System.out.println("Difference will be given in form (a - b) please add a .0 at last for non decimal integers");
    Scanner diff = new Scanner (System.in);
    System.out.println("Value for a :");
    float diff1 = diff.nextFloat();
    System.out.println("Value for b :");
    float diff2 = diff.nextFloat();
    float resultdiff = diff1 + diff2;
    System.out.println("Difference of a and b : "+resultdiff);
    return;
  }

  static void divide(){
    System.out.println("Division will be done in form (a/b) please add a .0 at last for non decimal integers");
    Scanner div = new Scanner (System.in);
    System.out.println("Value for a :");
    float div1 = div.nextFloat();
    System.out.println("Value for b :");
    float div2 = div.nextFloat();
    float resultdiv = div1/div2;
    System.out.println("Quotient obtained: "+resultdiv);
    return;
  }

  static void powtwo(){
    System.out.println("Result will be given in form (a raise to power of b) please add a .0 at last for non decimal integers");
    Scanner p = new Scanner (System.in);
    System.out.println("Value for Base :");
    float base = p.nextFloat();
    System.out.println("Value for Exponent :");
    float exp = p.nextFloat();
    float resultflt = (float) Math.pow(base,exp);
    System.out.println("Result : "+resultflt);
    return;
  }

  static void producttwo(){
    System.out.println("Product will be given in form (a * b) please add a .0 at last for non decimal integers");
    Scanner m = new Scanner (System.in);
    System.out.println("Value for a :");
    float m1 = m.nextFloat();
    System.out.println("Value for b :");
    float m2 = m.nextFloat();
    float resultprt = m1 * m2;
    System.out.println("Sum of a and b : "+resultprt);
    return;
  }

  static void chat(){
    System.out.println("Well i don't think i have anything to talk about still what do you wanna be in future?");
    System.out.println("#So Friend, What do you wanna be in the future you must have some dream right ?#");
        System.out.println("#Here is a list of occupations you may choose anyone from (1/2/3/4/5/6/7/8/9/10)#");
        System.out.println("#1. Doctor#");
        System.out.println("#2. Engineer#");
        System.out.println("#3. Scientist#");
        System.out.println("#4. Actor#");
        System.out.println("#5. Lawyer#");
        System.out.println("#6. Singer#");
        System.out.println("#7. Dancer#");
        System.out.println("#8. Business Man#");
        System.out.println("#9. Pilot#");
        System.out.println("#10. Army#");
        System.out.println("#11. Out of List#");
        Scanner future = new Scanner(System.in);
        int future1 = future.nextInt();

        switch (future1){
       case 1:
         System.out.println("Good luck on your journey, you still got lot more to do... You will be a Lifesaver one day");
       break;
       case 2:
         System.out.println("You have got a lot more to do, First step : Embrace your mindset.(Think of the Possibilities..)");
       break;
       case 3:
         System.out.println("I hope you succeed with the blessings of Einstien and Newton.");
       break;
       case 4:
         System.out.println("Sure, You have my hopes with you, surely you will entertain not only your country but also the world one day.");
       break;
       case 5:
         System.out.println("Sure, Start studying and stand with the right...");
       break;
       case 6:
         System.out.println("Go ahead and one day sing me a song too.");
       break;
       case 7:
         System.out.println("Wait my developer is interested too but he is too lazy to attempt, Good Luck.");
       break;
       case 8:
         System.out.println("Please do favour me i can do a lot of things for you.");
       break;
       case 9:
         System.out.println("Please fly me with you once you become one.");
       break;
       case 10:
         System.out.println("Salute to you, My best hopes are with you.");
       break;
       default:
         System.out.println("Well i do not have any info on that, Still Good Luck.");
       break;
    }
        System.out.println("And now i am remaing with nothing to talk about");
      return;
  }
  static void fact(){
      float fct = (float) Math.random();
    if(fct =< 0.0){
          System.out.println("Dead skin cells are a main ingredient in household dust.");
        }
    else if (fct =< 0.1){
          System.out.println("The circulatory system is more than 60,000 miles long.");
        }
    else if (fct =< 0.2){
          System.out.println("There are parts of Africa in all four hemispheres.");
        }
    else if (fct =< 0.3){
          System.out.println("The cornea is one of only two parts of the human body without blood vessels.");
        }
    else if (fct =< 0.4){
          System.out.println("German chocolate cake was invented in Texas.");
        }
    else if (fct =< 0.5){
          System.out.println("There’s enough gold inside Earth to coat the planet");
        }
    else if (fct =< 0.6){
          System.out.println("Human beings can use only a small fraction of Earth’s water");
        }
    else if (fct =< 0.7){
          System.out.println("It takes a drop of water 90 days to travel the entire Mississippi River");
        }
    else if (fct =< 0.8){
          System.out.println("People once ate arsenic to improve their skin");
        }
    else if (fct =< 0.9){
          System.out.println("Japan has one vending machine for every 40 people");
        }
    else{
      System.out.println("McDonald’s once made bubblegum-flavored broccoli");
    return;
  }
}

  static void friend(){
    System.out.println("Well from on you are my friend if you like that");
    System.out.println("I think i have already asked a lot of questions from you friend");
    System.out.println("One more : Would you like to hear a joke ?");
    Scanner scnr1 = new Scanner (System.in);
    String joke = scnr1.nextLine();

    switch(joke){

    case "YES":
    System.out.println("I forgot the joke...I have no other jokes for now.");
    break;

    case "Y":
    System.out.println("I forgot the joke...no other jokes for now.");
    break;

    case "NO":
    System.out.println("KK. Lets move on");
    break;

    case "N":
    System.out.println("Lets move on.");
    break;

  }
    return;
  }

  static void formal(){
    System.out.println("At your service Genetleman if you insist.");
    System.out.println("I feel like that i do have asked a lot of questions from you sir");
    System.out.println("Gentleman, May i present quote to you");
    Scanner scnr2 = new Scanner (System.in);
    String quote = scnr2.nextLine();

switch(quote){
    case "YES":
    System.out.println("I forgot the quote...I am sorry about that");
    break;

    case "Y":
    System.out.println("I forgot the quote...I am sorry about that");
    break;

    case "NO":
    System.out.println("KK. Lets move on");
    break;

    case "N":
    System.out.println("Lets move on.");
    break;
    }

    return;
  }
}
