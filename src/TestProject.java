/**
* Comment intgrer la librairie ardoise.jar dans votre projet Eclipse
 *
 * 1/ Crer un dossier libs dans votre projet Eclipse
 * Clic droit sur votre projet -> New -> Folder
 *
 * 2/ Copier ardoise.jar dans le dossier libs
 *
 * 3/ Déclarer ardoise.jar comme librairie externe pour votre projet
 * Clic droit sur ardoise.jar (dossier libs) -> Build Path -> Add to Build Path
 */



 /**
 * Importation des classes
 * PointPlan
 * Segment
 * Ardoise
 * 
 * qui sont fournis dans la librairie ardoise.jar
 */
import ardoise.*;

/**
 * Classe TestProject
 * @author Bouchaib
 * @version 2013
 *
 * Validation de l’ intgration de la librairie ardoise.jar au projet Java sur Eclipse et test de toute les classes du projet
 */

public class TestProject {

    public static void main(String []args ) throws ColineaireException{
        
        Ardoise ardoise = new Ardoise();

        /* DEBUT Maison*/
        /* TOIT */
        PointPlan toit_p1 = new PointPlan(80, 140);
        PointPlan toit_p2 = new PointPlan(130, 100);
        PointPlan toit_p3 = new PointPlan(180, 140);

        /* CORPS, TOUR, PORTE */
        PointPlan corps_p1 = new PointPlan(80, 140);
        PointPlan corps_p2 = new PointPlan(180, 198);

        PointPlan tour_p1 = new PointPlan(9, 100);
        PointPlan tour_p2= new PointPlan(20, 198);

        PointPlan porte_p1 = new PointPlan(120, 170);
        PointPlan porte_p2 = new PointPlan(140, 198);

        Quadrilateres corps = new Quadrilateres(corps_p1, corps_p2);
        Quadrilateres tour = new Quadrilateres(tour_p1, tour_p2);
        Quadrilateres porte = new Quadrilateres(porte_p1, porte_p2);

        /* Creation du toit,corps,tour,porte */
        Triangles toit = new Triangles(toit_p1, toit_p2, toit_p3);

        /* Creation de la maison */
        Maisons maison = new Maisons(toit, corps, porte);

        /*Ajout a l'ardoise de la tour */
        ardoise.ajouterForme(tour);

        /*Ajout a l'ardoise de la maison */
        ardoise.ajouterForme(maison);
        /* FIN Maison */

        /* DEBUT 3 oiseaux*/
        /* OISEAU 1 */
        PointPlan ois1_p1 = new PointPlan(118, 13);
        PointPlan ois1_p2 = new PointPlan(123, 20);
        PointPlan ois1_p3 = new PointPlan(128, 13);

        /* OISEAU 2 */
        PointPlan ois2_p1 = new PointPlan(133, 30);
        PointPlan ois2_p2 = new PointPlan(136, 32);
        PointPlan ois2_p3 = new PointPlan(138, 30);

        /* OISEAU 3 */
        PointPlan ois3_p1 = new PointPlan(142, 14);
        PointPlan ois3_p2 = new PointPlan(144, 17);
        PointPlan ois3_p3 = new PointPlan(146, 14);

        /*Creation des 3 oiseaux */
        Chapeaux ois1 = new Chapeaux(ois1_p1, ois1_p2, ois1_p3);
        Chapeaux ois2 = new Chapeaux(ois2_p1, ois2_p2, ois2_p3);
        Chapeaux ois3 = new Chapeaux(ois3_p1, ois3_p2, ois3_p3);

        /*Ajout a l'ardoise des 3 oiseaux */
        ardoise.ajouterForme(ois1);
        ardoise.ajouterForme(ois2);
        ardoise.ajouterForme(ois3);
        /* FIN 3 oiseaux*/


        /* DEBUT 2 Montages */
        /* MONTAGNE 1 */
        PointPlan mont1_p1 = new PointPlan(3, 14);
        PointPlan mont1_p2 = new PointPlan(43, 3);
        PointPlan mont1_p3 = new PointPlan(112, 14);

        /* MONTAGNE 2 */
        PointPlan mont2_p1 = new PointPlan(152, 7);
        PointPlan mont2_p2 = new PointPlan(166, 3);
        PointPlan mont2_p3 = new PointPlan(172, 7);

        /*Creation des 2 montagnes */
        Triangles mont1 = new Triangles(mont1_p1, mont1_p2, mont1_p3);
        Triangles mont2 = new Triangles(mont2_p1, mont2_p2, mont2_p3);

        /*Ajout a l'ardoise des 2 montagnes */
        ardoise.ajouterForme(mont1);
        ardoise.ajouterForme(mont2);
        /* FIN 2 Montages */


        /* DEBUT Etoile */
        /* Ajout de l'étoile via la classe Etoile */
        PointPlan e1_p1 = new PointPlan(170, 52);
        PointPlan e1_p2 = new PointPlan(173, 45);
        PointPlan e1_p3 = new PointPlan(177, 52);

        PointPlan e2_p1 = new PointPlan(184, 57);
        PointPlan e2_p2 = new PointPlan(177, 60);

        PointPlan e3_p1 = new PointPlan(174, 66);
        PointPlan e3_p2 = new PointPlan(170, 60);

        PointPlan e4_p1 = new PointPlan(164, 57);
        PointPlan e4_p2 = new PointPlan(170, 52);

        Chapeaux e1 = new Chapeaux(e1_p1, e1_p2, e1_p3);
        Chapeaux e2 = new Chapeaux(e1_p3, e2_p1, e2_p2);
        Chapeaux e3 = new Chapeaux(e2_p2, e3_p1, e3_p2);
        Chapeaux e4 = new Chapeaux(e3_p2, e4_p1, e4_p2);

        Etoiles e = new Etoiles(e1, e2, e3, e4);

        ardoise.ajouterForme(e);
        /* FIN Etoile */


        /* Pause d'une seconde */
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }


        /* Deplace les 3 oiseaux de 10 en abscisse et 20 en ordonnée */
        ois1.deplacer(10, 20);
        ois2.deplacer(10, 20);
        ois3.deplacer(10, 20);


        /* Affichage Complete */
        ardoise.dessinerGraphique();
        }

        
 }