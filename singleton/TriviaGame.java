import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame{
    private static TriviaGame triviagame;
    private int score;
    private Random rand; 
    private Scanner reader;
    private ArrayList<Question> questions;
    
    /**
     * Constructor TriviaGame initialize the questions,rand,reader and score.
     */
    private TriviaGame(){
        questions = DataLoader.getTriviaQuestions();
        rand= new Random();
        reader = new Scanner(System.in);
        score=0;
        System.out.println("Welcome to the game");
    }
    
    /**
     * This method creates the triviagame instance if it is not created before.
     * @return triviagame
     */
    public static TriviaGame getInstance(){
        if(triviagame == null){
            System.out.println("Creating a Trivia Game");
            triviagame = new TriviaGame();
        }
        return triviagame;
    }
    
    /**
     * Method playRound picks random question and checks the entered answer with the correct answer.
     * @return true or false as per the answer entered. 
     */
    private boolean playRound(){
        int question = rand.nextInt(questions);
        System.out.print(question);
        System.out.println("Enter your answer");
        int answer = reader.nextInt();
        if(answer == Integer.parseInt(Question.getCorrectAnswer()){
            score++;
            System.out.print("You have guessed the correct answer");
            return true;
        } else{
            return false;
        }
    }
    
    /**
     * Method play keeps the game playing otherwise asked.
     */
    public void play(){
        boolean b = true;
        while(b){
            System.out.println("(P)lay or (Q)uit");
            String answer2 = reader.nextLine();
            if(answer2=="p" || answer2=="P"){
                b=playRound();
            } else if(answer2=="q" || answer2=="Q"){
                System.out.println(+score);
                System.out.println("Goodbye");
                System.exit(0);
            } else{
                System.out.println("Please enter P or Q");
                play();
            }
        }
    }
}
