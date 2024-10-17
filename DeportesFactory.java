public class DeportesFactory extends AbstractFactory {
    public Ropa getRopa(String ropaType){
        switch (ropaType){
            case "Deportiva": return new Deportiva();
            case "Acuatica": return new Acuatica();
            default: return null;
        }
    }
}
