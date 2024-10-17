public class DiaADiaFactory extends AbstractFactory{
    public Ropa getRopa(String ropaType){
        switch(ropaType){
            case "Formal": return new Formal();
            case "Casual": return new Casual();
            default: return null;
        }
    }
}
