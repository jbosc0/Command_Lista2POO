public class HotTubOnCommand implements Command {

    private final HotTub hot;

    public HotTubOnCommand(HotTub hot) {
        this.hot = hot;
    }

    @Override
    public void execute() {
        hot.on();
    }

    @Override
    public void store(StringBuilder registro) {
        registro.append("HotTubOnCommand\n");
    }

    @Override
    public void load() {
        execute();
    }
}
 