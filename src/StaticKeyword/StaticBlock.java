package StaticKeyword;

public class StaticBlock {

    public static final int PROCESSORS;

    static{
        PROCESSORS = Runtime.getRuntime().availableProcessors();

    }

}
