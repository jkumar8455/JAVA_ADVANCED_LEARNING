public class ImmutableClassExample {

    private final String stringValue;
    private final int intValue;
    public ImmutableClassExample(String stringValue,int intValue){
        this.stringValue=stringValue;
        this.intValue=intValue;
    }
    
    public String getStringValue() {
        return stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public static void main(String[] args) {
        ImmutableClassExample immutableClassExample=new ImmutableClassExample("string", 5);
        System.out.println(immutableClassExample.getIntValue()+" : "+immutableClassExample.getStringValue());
    }
    
}
