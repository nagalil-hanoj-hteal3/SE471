package src;

public class GameUtility{
    //case loop for different levels
    public PlayerFactoryIF createFactory(int model) {
        switch(model) {
            case 1:
                return new BeginnerFactory();
            case 2:
                return new IntermediateFactory();
            case 3:
                return new AdvancedFactory();
            default:
                return null;
        }
    }
}
