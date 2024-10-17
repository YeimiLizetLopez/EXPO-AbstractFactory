public class Main {
    public static void main(String[] args) {
        AbstractFactory ejemplo = new DeportesFactory();
        Ropa ropa1 = ejemplo.getRopa("Deportiva");
        ropa1.desripcion();
        Ropa ropa2 = ejemplo.getRopa("Acuatica");
        ropa2.desripcion();

        AbstractFactory ejemplo2 = new DiaADiaFactory();
        Ropa ropa3 = ejemplo2.getRopa("Formal");
        ropa3.desripcion();
        Ropa ropa4 = ejemplo2.getRopa("Casual");
        ropa4.desripcion();
    }
}
