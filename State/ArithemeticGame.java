import java.util.Scanner;

/**
 * ArithemeticGame class displays the question, get the user answer and performs calculation accordingly.
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * ArthemeticGame class constructor set the variables and states
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        score = 0;
        reader = new Scanner(System.in);
		state = easyState;
    }

    /**
     * The pressQuestionButton method displays the question and get the user answer and perform the calculations.
     */
    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        String op = state.getOperation();
        int ans;
        int answer;
        if(op=="+") {
            System.out.println(num1+" + "+num2);
            answer = reader.nextInt();
            ans = num1 + num2;
            if(answer==ans) {
                score++;
                System.out.println("Correct");
            }
            else {
                score--;
                System.out.println("Incorrect");
            }
        }
        else if(op=="-") {
            System.out.println(num1+" - "+num2);
            answer = reader.nextInt();
            ans = num1 - num2;
            if(answer==ans) {
                score++;
                System.out.println("Correct");
            }
            else {
                score--;
                System.out.println("Incorrect");
            }
        }
        else if (op == "*") {
            System.out.println(num1+" * "+num2);
            answer = reader.nextInt();
            ans = num1 * num2;
            if(answer==ans) {
                score++;
                System.out.println("Correct");
            }
            else {
                score--;
                System.out.println("Incorrect");
            }
        }
        else {
            System.out.println(num1+" / "+num2);
            answer = reader.nextInt();
            ans = num1/num2;
            if(answer==ans) {
                score++;
                System.out.println("Correct");
            }
            else {
                score--;
                System.out.println("Incorrect");
            }
        }
        if(score >=3) {
            state.levelUp();
            score = 0;
        }
        else if (score<= -3) {
            state.levelDown();
            score = 0;
        }
    }

    /**
     * The setstate method sets the given state.
     * @param state The state to be set
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * The getEasyState method returns the easy state.
     * @return easyState
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * The getMediumState method returns the medium state.
     * @return mediumState
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * The getHardState method returns the hard state.
     * @return hardState
     */
    public State getHardState() {
        return hardState;
    }
}
