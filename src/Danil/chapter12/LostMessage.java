package danil.chapter12;

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lostMessage = new LostMessage();
            try {
                lostMessage.f();
            } catch(Exception e) {
                System.out.println(e);
            } finally {
                lostMessage.dispose();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
