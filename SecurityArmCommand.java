public class SecurityArmCommand implements Command {

    private final SecurityControl sc;

    public SecurityArmCommand(SecurityControl sc) {
        this.sc = sc;
    }

    @Override
    public void execute() {
        sc.arm();
    }

    @Override
    public void store(StringBuilder registro) {
        registro.append("SecurityArmCommand\n");
    }

    @Override
    public void load() {
        execute();
    }
}
