public class CamelCaseTranslator {

    public static String toUnderScore(String name){
        if (name.equals("")) return "";
        return String.join("_", name.split("(?=[A-Z])(?<!_)|(?<=[A-Za-z])(?=\\d)"));
    }
}
