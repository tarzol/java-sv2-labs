package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {
        Verb word1 = new PhrasalVerb("megy", "el");
        Verb word2 = new PhrasalVerbWithSuffix("mond","el", "ek");
        Preposition word3 = new PhrasalVerb("lát", "meg");
        Preposition word4 = new PhrasalVerbWithSuffix("lát", "meg", "om");
        PhrasalVerb word5 = new PhrasalVerb("néz", "el");
        PhrasalVerb word6 = new PhrasalVerbWithSuffix("lát","el","ek" );
        Suffix word7 = new PhrasalVerbWithSuffix("olvas","át", "om");
        PhrasalVerbWithSuffix word8 = new PhrasalVerbWithSuffix("áll","fel", "ok");

        System.out.println(word1.getWord());
        System.out.println(word2.getWord());
        System.out.println(word3.getPreposition()+"  "+word3.getWholeWord());
        System.out.println(word4.getPreposition()+"  "+word4.getWholeWord());
        System.out.println(word5.getPreposition()+"  "+word5.getWord()+"  "+word5.getWholeWord());
        System.out.println(word6.getPreposition()+"  "+word6.getWord()+"  "+word6.getWholeWord());
        System.out.println(word7.getSuffix());
        System.out.println(word8.getSuffix()+" "+word8.getWord()+" "+word8.getWholeWord());

    }
}
