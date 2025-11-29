public class GarageUpCommand implements Command {

    private final GarageDoor door;

    public GarageUpCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }

    @Override
    public void store(StringBuilder registro) {
        registro.append("GarageUpCommand\n");
    }

    @Override
    public void load() {
        execute();
    }
}
