package danil.chapter10;

public class Out {

    Out(){
        System.out.println("external class");
    }
    class In {

        In(){

            System.out.println("inner class");
        }
    }
}
