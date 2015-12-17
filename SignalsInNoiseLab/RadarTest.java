

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Scanner;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
        Radar radar = new Radar(100,100);
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testRadar1(){
    Radar radar = new Radar(100,100);
        int rows = radar.getNumRows();
        int cols=radar.getNumCols();
        int scans=radar.getNumScans();    
    int monsterLocationRow = 0;
    int monsterLocationCol = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to Choose the monsters loc?: 1=yes 0=no");
        int choice = scan.nextInt();
        if( choice == 1)
        {
        System.out.println("Choose the monsters row: ");
        monsterLocationRow = scan.nextInt();
        System.out.println("Choose the monsters column: ");
        monsterLocationCol = scan.nextInt();
    }
    else if(choice == 0)
    {
       monsterLocationRow = (int)(Math.random() * rows);
       monsterLocationCol = (int)(Math.random() * cols);
    }
    
        
        radar.setMonsterLocation(monsterLocationRow,monsterLocationCol);
        for( int i=0;i<10;i++)
        {
            radar.scan();
        }
        
        for(int i =0; i<rows;i++)
        {
            for(int j = 0; j<cols;j++)
            {
                if(radar.getAccumulatedDetection(i,j)==scans)
                {
                    assertEquals(monsterLocationRow, i);
                    assertEquals(monsterLocationCol,j);
                }
            }
        }
        
    }
    
    @Test
    public void testRadar2(){
        
    Radar radar = new Radar(100,100);
        int rows = radar.getNumRows();
        int cols=radar.getNumCols();
        int scans=radar.getNumScans();    
    int monsterLocationRow = 0;
    int monsterLocationCol = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to Choose the monsters loc?: 1=yes 0=no");
        int choice = scan.nextInt();
        if( choice == 1)
        {
        System.out.println("Choose the monsters row: ");
        monsterLocationRow = scan.nextInt();
        System.out.println("Choose the monsters column: ");
        monsterLocationCol = scan.nextInt();
    }
    else if(choice == 0)
    {
       monsterLocationRow = (int)(Math.random() * rows);
       monsterLocationCol = (int)(Math.random() * cols);
    }
    
   
    radar.setMonsterLocation(monsterLocationRow,monsterLocationCol);
    for( int i=0;i<50;i++)
    {
        radar.scan();
    }
 

            for(int i =0; i<rows;i++)
        {
            for(int j = 0; j<cols;j++)
            {
                if(radar.getAccumulatedDetection(i,j)==scans)
                {
                    assertEquals(monsterLocationRow, i);
                    assertEquals(monsterLocationCol,j);
                }
            }
        }
        



    }
    
    
    
    
    
    
}
//when running the test, it will run once, stop then click back
//on the counsle and type random numbers again
