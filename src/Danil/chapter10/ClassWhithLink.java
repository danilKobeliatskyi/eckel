package danil.chapter10;

public class ClassWhithLink {
    class Anonymous extends WithoutDefaultConstructor{
        Anonymous(String s) {
            super(s);
            wdc();
        }
        public WithoutDefaultConstructor wdc(){
            return new WithoutDefaultConstructor("new Without Default");
        };
    }
    ClassWhithLink(){
        ClassWhithLink.Anonymous anonymous = new Anonymous("Inner Clas");
    }
}
