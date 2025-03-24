/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package HomeMenu;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author VIEN
 */
public class HomeNGTest {
    
    public HomeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of OnOff method, of class Home.
     */
    @Test
    public void testOnOff() {
        System.out.println("OnOff");
        boolean a = false;
        boolean b = false;
        Home instance = new Home();
        instance.OnOff(a, b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of View method, of class Home.
     */
    @Test
    public void testView() {
        System.out.println("View");
        Home instance = new Home();
        boolean expResult = false;
        boolean result = instance.View();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ViewProduct method, of class Home.
     */
    @Test
    public void testViewProduct() throws Exception {
        System.out.println("ViewProduct");
        Home instance = new Home();
        instance.ViewProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of layout method, of class Home.
     */
    @Test
    public void testLayout() {
        System.out.println("layout");
        Home instance = new Home();
        instance.layout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ViewAccount method, of class Home.
     */
    @Test
    public void testViewAccount() throws Exception {
        System.out.println("ViewAccount");
        Home instance = new Home();
        instance.ViewAccount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadTableAccount method, of class Home.
     */
    @Test
    public void testLoadTableAccount() {
        System.out.println("loadTableAccount");
        Home instance = new Home();
        instance.loadTableAccount();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openMenuBar method, of class Home.
     */
    @Test
    public void testOpenMenuBar() {
        System.out.println("openMenuBar");
        Home instance = new Home();
        instance.openMenuBar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeMenuBar method, of class Home.
     */
    @Test
    public void testCloseMenuBar() {
        System.out.println("closeMenuBar");
        Home instance = new Home();
        instance.closeMenuBar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Home.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Home.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
