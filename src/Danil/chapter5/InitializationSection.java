package danil.chapter5;

public class InitializationSection {
    String initializationSection(int marker){
        String s = "Initialization in section(" + marker + ")";
        System.out.println(s);
        return s;
    }
}

class InitializationSections {
    InitializationSection section1;
    InitializationSection section2;
    {
        section1 = new InitializationSection();
        section2 = new InitializationSection();
        section1.initializationSection(1);
        section2.initializationSection(2);
    }
}
