import java.util.Random;

/**
 * The Medium Class implements state interface and overrides the method.
 */
public class Medium implements State {
    private ArithemeticGame game;
    Random rand = new Random();

    /**
     * The default constructor sets the game.
     * @param game
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }
    
    @Override
    public int getNum() {
        return rand.nextInt(50)+1;
    }

    @Override
    public String getOperation() {
        String[] operation = {"+","-","*"};
        return (operation[rand.nextInt(operation.length)]);
    }

    @Override
    public void levelUp() {
        game.setState(game.getHardState());
        System.out.println("You've been advanced to hard mode.");
    }

    @Override
    public void levelDown() {
        game.setState(game.getEasyState());
        System.out.println("You seem to be struggling, let's got to easy mode.");
    }
}
