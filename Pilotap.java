import java.util.Collections;

public class Pilotap extends Thread{

    public double tempo;
    private Semaforo s;
    private int pos;
    private static int numeropilota;
    private String nomepilota;
    private int giripista=15;
    private Gara g;


    public Pilotap(Semaforo s,String nomenomepilota){

        this.s=s;
        this.nomepilota=nomepilota;
        this.pos=pos;
        this.tempo=tempo;
        g=new Gara();
        
    }

    public double getTempo() {
        return tempo;
    }
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    public static int getNumeropilota() {
        return numeropilota;
    }

    public static void setNumeropilota(int numeropilota) {
        Pilotap.numeropilota = numeropilota;
    }

    public void vai(Semaforo s){
        //Entra negli spogliatoi per indossare la tuta e il casco (se non c’è posto attende) 
        s.p();

        try {
            Thread.sleep((long)(Math.random() * 1000));
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        s.V();
        //Sale sul kart e entra in pista, facendo partire il proprio cronometro -
        long start = System.nanoTime();
        //Effettua 15 giri di pista; Ogni giro di pista impiega un tempo random 
        for(int i=0;i<giripista;i++){
            try {
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
        //Lascia la pista, facendo stoppare il proprio cronometro -> long stop = System.nanoTime();
        long stop = System.nanoTime();

        setTempo(stop-start/1000000);

        
        toString();




    }

   
}
