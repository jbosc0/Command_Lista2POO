public class FanHighCommand implements Command {

    private final CeilingFan fan;

    public FanHighCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.high();
    }

    @Override
    public void store(StringBuilder registro) {
        registro.append("FanHighCommand\n");
    }

    @Override
    public void load() {
        execute();
    }
}
