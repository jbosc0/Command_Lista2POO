public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        TV tv = new TV();
        CeilingFan fan = new CeilingFan();
        GarageDoor garage = new GarageDoor();
        SecurityControl sc = new SecurityControl();
        HotTub hot = new HotTub();
        Sound sound = new Sound();

        ControleRemoto controle = new ControleRemoto();

        controle.executar(new LightOnCommand(light));
        controle.executar(new TVOnCommand(tv));
        controle.executar(new FanHighCommand(fan));
        controle.executar(new GarageUpCommand(garage));
        controle.executar(new SecurityArmCommand(sc));
        controle.executar(new HotTubOnCommand(hot));
        controle.executar(new SoundOnCommand(sound));

        System.out.println("\nPane elétrica ocorreu!");
        System.out.println("Salvando histórico...");
        controle.salvarHistorico();

        System.out.println("\nRestaurando estado dos dispositivos...");
        controle.restaurar();
    }
}
