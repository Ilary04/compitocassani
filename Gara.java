import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Gara {

private ArrayList<Pilotap>listapiolati;

public Gara(){
    this.listapiolati=new ArrayList<Pilotap>();
}

public static class comparatoretempi implements Comparator<Pilotap> {

    @Override
    public int compare(Pilotap arg0, Pilotap arg1) {
        int tmp=0;
        tmp=(int) (arg0.getTempo()-arg1.getTempo());
        return tmp;
    }


    
}



Collections.sort(listapiolati, new Gara.comparatoretempi);



}