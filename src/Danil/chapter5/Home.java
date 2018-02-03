package Danil.chapter5;

public class Home {
        int lodgerCount = 0;
        String s = "New lodger";

        Home(int lodger){
            lodgerCount = lodger;
            System.out.println("lodger =" + lodgerCount);
        }
        Home(String ss){
            s = ss;
            System.out.println("String s =" + ss);
        }
        Home(String s, int lodger){
            this(lodger);
            this.s = s;
            System.out.println("Arguments");
        }
        Home(){
            this(" lodger in home", 30);
            System.out.println("Without arguments");
        }
        void printLodgerCount(){
            System.out.println("Lodger count =" + lodgerCount + "s" + s);
        }
}
