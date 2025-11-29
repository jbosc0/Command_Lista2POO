public class SoundOnCommand implements Command {

    private final Sound sound;

    public SoundOnCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        sound.on();
    }

    @Override
    public void store(StringBuilder registro) {
        registro.append("SoundOnCommand\n");
    }

    @Override
    public void load() {
        execute();
    }
}
