package be.vives.ti;

public class Stringprocessor {
    private String str;
    public Stringprocessor(){
        str = "";
    }
    public String appendIfMissing(String suffix){
        if (!str.endsWith(suffix)){
            str = str + suffix;
            return str;
        }
        return str;
    }
    public String getString(){
        return str;
    }
}
