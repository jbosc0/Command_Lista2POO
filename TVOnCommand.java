public class TVOnCommand implements Command {

    private final TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void store(StringBuilder registro) {
        registro.append("TVOnCommand\n");
    }

    @Override
    public void load() {
        execute();
    }
}
