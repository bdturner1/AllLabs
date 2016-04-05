/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author blake.turner352
 */
public class Palette
{
    //~ Instance/static variables .............................................

    private Brick aBrick;
    private int   bricksInPlane;
    private int   height;
    
    // constants:
    private static final double BASE_WEIGHT = 6.5;  // in kg
    private static final double BASE_HEIGHT = 15;   // in cm


    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Create a palette with a given number of bricks.  The bricks are
     * all 8cm x 20cm x 12cm.
     * @param numBricksInPlane  is the number of bricks in each level on the
     *                          base
     * @param stackHeight       is the number of bricks stacked on top of each
     *                          other
     */
    public Palette(int numBricksInPlane, int stackHeight)
    {
        aBrick = new Brick(8, 20, 12);
        bricksInPlane = numBricksInPlane;
        height        = stackHeight;
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get the weight of this palette.
     * @return the weight of the palette (in kg)
     */
    public double getWeight()
    {
        int numberOfBricks = bricksInPlane * height;
        return aBrick.getWeight() * numberOfBricks;
    }


    // ----------------------------------------------------------
    /**
     * Get the height of this palette.
     * return the height of this stack (in cm)
     */
    public double getHeight()
    {
        return (aBrick.getHeight() * height);
    }
}
