import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class StudentTest {
    private Student alyssa;

    @Before
    public void setup(){
        alyssa = new Student(12345, "Alyssa Briggs");
        assertEquals(0, alyssa.getGrades().size());
        alyssa.addGrade(25);
        alyssa.addGrade(100);
        alyssa.addGrade(95);
        alyssa.addGrade(90);
    }

    @Test
    public void testIfStudentAddingToGradesWorks(){
        assertEquals(4, alyssa.getGrades().size());
    }

    @Test
    public void testIfStudentGradeAverageWorks(){
        assertEquals(77.5, alyssa.getGradeAverage(alyssa.getGrades()), 0);
    }


}
