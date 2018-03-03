package danil.chapter18;
import java.nio.*;

public class DoubleBufferDemo {
    private static final int BSIZE = 1024;
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        DoubleBuffer db = bb.asDoubleBuffer();
        db.put(new
                double[]{11.11,42.42,27.37,99.99,143.143,811.811,1016.1026});
        System.out.println(db.get(3));
        db.put(3, 1811.1811);
        db.flip();
        while(db.hasRemaining()) {
            double d = db.get();
            System.out.println(d);
        }
    }
}
