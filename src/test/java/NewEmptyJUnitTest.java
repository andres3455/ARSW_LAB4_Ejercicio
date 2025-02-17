/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import edu.eci.arsw.springdemo.GrammarChecker;
import edu.eci.arsw.springdemo.EnglishSpellChecker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Andres Rodriguez
 */
public class NewEmptyJUnitTest {
    

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
    
    
   @Test
    public void testGrammarChecker() {
        
        GrammarChecker grammar = new GrammarChecker();
        EnglishSpellChecker english = new EnglishSpellChecker();
        grammar.setSpellChecker(english);
        
        String result = grammar.check("la la la ");
        assertEquals("Spell checking output:Checked with english checker:la la la Plagiarism checking output: Not available yet", result);
    }
}
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
