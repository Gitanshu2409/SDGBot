import java.util.*;
public class AwareBotX{
  public static void main(String[]args){
// Defining Scanner to read input.
    Scanner scnr = new Scanner(System.in);

// Welcome Program
      System.out.println("|#################################################|");
      System.out.println("|###|Welcome to AwareBotX, I am Still a Prototype.|###|");
      System.out.println("|#################################################|");
      System.out.println("");
      System.out.println("WARNING : Please provide all input in capital letters only.....");
      System.out.println("#Please enter your name, this will make it easier for me to talk to you.#");
    String usrname = scnr.nextLine();
      System.out.println("Nice to meet you : "+usrname);
      System.out.println("");
      System.out.println("So, Choose how would you like me to behave.....(1/2)");
      System.out.println("1. Formal and Well Behaving.");
      System.out.println("2. Friend-like and Chaotic.");
      System.out.println("");
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
    aware();
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

    for(inpt = 10;inpt != 0;){
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
      inpt--;
      System.out.println("Remaining Inputs : " + inpt);
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
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          default:
          System.out.println("But if you will not be able to save your planet then how will you be able to accomplish your goal ?");
          break;
    }
        System.out.println("Think about it......");
      return;
  }
  static void fact(){
      float fct = (float) Math.random();
    if(fct <= 0.0){
          System.out.println("Around 27,000 trees are cut down each day.");
        }
    else if (fct <= 0.1){
          System.out.println("78% of marine mammals are at risk of choking on plastic.");
        }
    else if (fct <= 0.2){
          System.out.println("A glass bottle can take up to 1 million years to decompose.");
        }
    else if (fct <= 0.3){
          System.out.println("Paper from trees can be recycled 6 times.");
        }
    else if (fct <= 0.4){
          System.out.println("Aluminium can be recycled forever!");
        }
    else if (fct <= 0.5){
          System.out.println("There is enough gold inside Earth to coat the planet");
        }
    else if (fct <= 0.6){
          System.out.println("Climate change could be irreversible by 2030.");
        }
    else if (fct <= 0.7){
          System.out.println("It takes a drop of water 90 days to travel the entire Mississippi River");
        }
    else if (fct <= 0.8){
          System.out.println("We use more of the earth's resources than it can renew.");
        }
    else if (fct <= 0.9){
          System.out.println("Arctic sea ice is rapidly diminishing.");
        }
    else{
      System.out.println("Two-thirds of extreme weather events in the last 20 years were influenced by humans.");
    return;
  }
}

  static void friend(){
    System.out.println("Well from now on you are my friend if you like that.");
    System.out.println("I think i have already asked a lot of questions from you friend.");
    System.out.println("");
    System.out.println("One more : Would you like to hear a joke ?");
    System.out.println("");
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
    aware();
        System.out.println("");
    return;
  }

  static void formal(){
    System.out.println("At your service Gentleman if you insist.");
    System.out.println("I feel like that i do have asked a lot of questions from you sir");
        System.out.println("");
    System.out.println("Gentleman, May i present quote to you");
        System.out.println("");
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
    aware();
        System.out.println("");
    return;
  }

  static void aware(){
    System.out.println("");
    System.out.println("Do you know at what risk our planet is ?");
    System.out.println("");

    System.out.println("Have you ever planted a tree?");
    Scanner respond = new Scanner (System.in);
    System.out.println("Answer (Y/N) : ");
    String response = respond.nextLine();

      if (response.equals("Y")){
        System.out.println("Well! That is highly appreciated.");
        System.out.println("");
      }else if (response.equals("N")){
        System.out.println("Oh! That is not good.");
        System.out.println("");
      }else{
        System.out.println("I don't understand that.");
      }

    System.out.println("Have you ever seen a leaking tap...?");
    System.out.println("Answer (Y/N) : ");
    String responseYN = respond.nextLine();

      if (responseYN.equals("Y")){
        System.out.println("So, you have seen it.");
      }else if (responseYN.equals("N")){
        System.out.println("Stop Lying! Odds of that happening do not even count.");
      }else{
        System.out.println("I don't know what that means...");
      }
    System.out.println("");
    System.out.println("Well i am not here for that.......");
    System.out.println("");
    System.out.println("Do you know that : In 2019, the world lost an entire soccer field worth of primary rainforest every six seconds.");
    System.out.println("");
    System.out.println("Also : A leaky faucet that drips at the rate of one drip per second can waste more than 3,000 gallons per year.");
    System.out.println("");
    System.out.println("I can only make you aware as i am a bot but you have to act upon it.");
    System.out.println("");
    return;
  }

}
