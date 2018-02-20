package danil.chapter16;
import java.util.*;

public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        List<List<String>> lls = new ArrayList<List<String>>();
        List<List> lists = new ArrayList<List>();
        lls.add(new ArrayList<String>());

        List<Object> objectList = new ArrayList<Object>();
        objectList.add(lls);

        List<List<BerylliumSphere>> listBery = new ArrayList<List<BerylliumSphere>>();
        for (int i = 0; i < 5; i++){
            listBery.add(new ArrayList<BerylliumSphere>());
            for(int j = 0; j < 3; j++) {
                listBery.get(i).add(new BerylliumSphere());
            }
        }
        System.out.println(listBery);
    }
}
