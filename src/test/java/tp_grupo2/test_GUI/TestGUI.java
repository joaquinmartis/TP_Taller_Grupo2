package tp_grupo2.test_GUI;



import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.JComponent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import controlador.Controlador;

public class TestGUI {
	Robot robot;
	Controlador controlador;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	public TestGUI()
    {
        try
        {
            robot = new Robot();
        } catch (AWTException e)
        {
        }
    }
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		controlador = new Controlador();
	}

	@After
	public void tearDown() throws Exception {
		((JComponent) controlador.getVista()).setVisible(false);
	}

}
