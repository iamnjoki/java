
public class Main {

    public static void main(String[] args) {
        // Test your program here!
        
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("How are you?", "Habari yako?");
        abbreviations.addAbbreviation("Did you go to school today?", "Ulienda shule leo?");
        
        String find = abbreviations.findExplanationFor("How are you?");
        System.out.println(find);
        System.out.println();
        boolean checkIfContains = abbreviations.hasAbbreviation("Uko?");
        System.out.println(checkIfContains);
    }
}
