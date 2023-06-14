import ardoise.*;

public class MethodeTest {
    public static boolean colineaires(PointPlan p1, PointPlan p2) {
        if ( p1.getAbscisse() == p2.getAbscisse()) {
            return true;
        }
        else if ( p1.getOrdonnee() == p2.getOrdonnee()) {
            return true;
        }
        else { return false; }
    }

    public static boolean colineaires(PointPlan p1, PointPlan p2, PointPlan p3) {
        if ( MethodeTest.colineaires(p1, p2) && MethodeTest.colineaires(p1, p3) && MethodeTest.colineaires(p2, p3)) {
            return true;
        }
        else { return false; }
    
    }
}
