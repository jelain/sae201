import ardoise.*;
import java.util.ArrayList;

public class Etoiles extends Forme{
    private Chapeaux c1;
    private Chapeaux c2;
    private Chapeaux c3;
    private Chapeaux c4;

    public Etoiles() {
        super();
    }

    public Etoiles(Chapeaux c1, Chapeaux c2, Chapeaux c3, Chapeaux c4) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.setNomForme("Étoile");
    }

    public Chapeaux getc1() {
        return this.c1;
    }

    public Chapeaux getc2() {
        return this.c2;
    }

    public Chapeaux getc3() {
        return this.c3;
    }

    public Chapeaux getc4() {
        return this.c4;
    }

    public void setc1(Chapeaux c) {
        this.c1 = c;
    }

    public void setc2(Chapeaux c) {
        this.c2 = c;
    }

    public void setc3(Chapeaux c) {
        this.c3 = c;
    }

    public void setc4(Chapeaux c) {
        this.c4 = c;
    }



    @Override
    public void deplacer(int x, int y) {
        this.getc1().deplacer(x, y);
        this.getc2().deplacer(x, y);
        this.getc3().deplacer(x, y);
        this.getc4().deplacer(x, y);
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> s1 = new ArrayList<Segment>(this.getc1().dessiner());
        ArrayList<Segment> s2 = new ArrayList<Segment>(this.getc2().dessiner());
        ArrayList<Segment> s3 = new ArrayList<Segment>(this.getc3().dessiner());
        ArrayList<Segment> s4 = new ArrayList<Segment>(this.getc4().dessiner());

        ArrayList<Segment> slist = new ArrayList<>();

        for(int i = 0; i<s1.size(); i++) {
            slist.add(s1.get(i));
        }

        for(int i = 0; i<s2.size(); i++) {
            slist.add(s2.get(i));
        }

        for(int i = 0; i<s3.size(); i++) {
            slist.add(s3.get(i));
        }

        for(int i = 0; i<s4.size(); i++) {
            slist.add(s4.get(i));
        }

        return slist;
    }

    @Override
    public String typeForme() {
        return "GF";
    }

    public String toString() {
        return "Étoile {c1 = "+ this.getc1() + ", c2 = " + this.getc2() + ", c3 = " + this.getc3() + ", c4 = " + this.getc4() + " }";
    }
}
