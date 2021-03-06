package game;

/**
 * Classe définissant une raquette.
 * Une raquette est ici un rectangle dessiné dans un canevas (panneau).
 * Dans ce jeu, chaque joueur possède évidemment sa propre raquette.
 * 
 * @author Baptiste Vannesson
 */
public class Paddle {

    /** Constante déterminant la largeur de la raquette */
    public static final byte WIDTH = 100;
    
    /** Constante déterminant la hauteur de la raquette */
    public static final byte HEIGHT = 15;
 
    /** Constante déterminant la position de la raquette sur l'axe des y */
    public static final short Y = 550;
    
    /** Position de la raquette sur l'axe des x */
    private int x;
    
    /**
     * Constructeur par défaut d'une raquette.
     * Par défaut, une raquette se trouve à l'origine en x.
     */
    public Paddle() {
        this(0);
    }
    
    /**
     * Constructeur d'une raquette, prenant en paramètre sa position sur l'axe des abscisses.
     * 
     * @param x Position de la raquette sur l'axe des x
     */
    public Paddle(int x) {
        this.x = x;
    }

    /**
     * Accesseur pour la position de la raquette sur l'axe des x
     * 
     * @return Position de la raquette sur l'axe des x
     */
    public int getX() {
        return x;
    }

    /**
     * Mutateur pour la position de la raquette sur l'axe des x
     * 
     * @param x Nouvelle position de la raquette sur l'axe des x
     */
    public void setX(int x) {
        this.x = x;
    }
    
}
