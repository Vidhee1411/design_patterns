import java.util.Random;

/**
 * The Easy class implements the State interface and overrides the methods
 */
public class Easy implements State {
    private ArithemeticGame game;
    Random rand = new Random();

    /**
     * The easy constructor sets the game.
     * @param game
     */
    public Easy(ArithemeticGame game) {
        this.game = game;
    }
    
    @Override
    public int getNum() {
        return rand.nextInt(10)+1;
    }

    @Override
    public String getOperation() {
        String[] operation = {"+","-"};
        return (operation[rand.nextInt(operation.length)]);
    }

    @Override
    public void levelUp() {
        game.setState(game.getMediumState());
        System.out.println("You've been advanced to medium mode.");
    }

    @Override
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
