import java.util.Random;

/**
 * The hard class implements the state and overrides the methods.
 */
public class Hard implements State {
    private ArithemeticGame game;
    Random rand = new Random();

    /**
     * the default constructor sets the given game.
     * @param game
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }
    
    @Override
    public int getNum() {
        return rand.nextInt(100)+1;
    }

    @Override
    public String getOperation() {
        String[] operation = {"+","-","*","/"};
        return (operation[rand.nextInt(operation.length)]);
    }

    @Override
    public void levelUp() {
        System.out.println("You are doing so well.");
    }

    @Override
    public void levelDown() {
        game.setState(game.getMediumState());
        System.out.println("You seem to be struggling, let's got to medium mode.");
    }
}
