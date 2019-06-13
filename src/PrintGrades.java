




import java.util.Scanner;


public class PrintGrades {
    public static void main(String []args) {
        Scanner keyboard = new Scanner(System.in);
//prompt input
        String answer;
        System.out.println(" Please Enter an Exam Score: ");
        int score = keyboard.nextInt();
        while(score !=0) {
                if (score < 60) {
                    System.out.println("Go back to school");
                }
                else if (score <= 69){
                    System.out.println("Booo you got a D");
                }
                else if (score <= 73) {
                    System.out.println("you got a C-");
                }
                else if (score <=76) {
                    System.out.println("You got a C");
                }
                else if (score <=79) {
                    System.out.println("You got a C+");
                }
                else if (score <=83) {
                    System.out.println("You got a B-!");
                }
                else if (score <=86) {
                    System.out.println("You got a B!");
                }
                else if (score <=89) {
                    System.out.println("You got a B+!!!");
                }
                else if (score <=93) {
                    System.out.println("Good Job You got an A-!");
                }
                else if (score <=96){
                    System.out.println("Great Job! You got and A!!");
                }
                else if (score <=100) {
                    System.out.println("Congrats! You got an A+");
                }
                else {
                    System.out.println("CHEATER!!");
                }
                System.out.println("Would you like to enter another score? : ");
                answer = keyboard.next();
                if(answer.equalsIgnoreCase("yes")) {
                    System.out.println(" Please Enter an Exam Score: ");
                    score = keyboard.nextInt();



                }

                    else {
                    System.out.println("Goodbye");

                    break;
                }
            }

        }
        }





