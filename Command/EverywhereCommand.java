public class EverywhereCommand implements Command{
    private MilitaryCadence cadence;

    public EverywhereCommand(MilitaryCadence cadence){
        this.cadence = cadence;
    }

    @Override
    public void execute(){
        cadence.singEverywhereWeGo();
    }
}

