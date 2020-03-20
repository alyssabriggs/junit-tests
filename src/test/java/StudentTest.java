import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

	@Test
	public void testCreateStudent(){
		Student jen = new Student(1L, "Jen");
		Student kassy = null;
		assertNull(kassy);
		assertNotNull(jen);
	}

	@Test
	public void testStudentFields(){
		Student jen = new Student(1L, "Jen");
		assertSame(1l, jen.getId());
		assertSame("Jen", jen.getName());
		assertSame(0, jen.getGrades().size());
	}

	@Test
	public void testAddGrade(){
		Student jen = new Student(1L, "Jen");
		jen.addGrade(100);
		assertSame(100, jen.getGrades().get(0));
		jen.addGrade(60);
		assertSame(60, jen.getGrades().get(1));
	}

	@Test
	public void testGetGradeAverage(){
		Student jen = new Student(1L, "Jen");
		jen.addGrade(100);
		jen.addGrade(60);
		jen.addGrade(80);
		assertEquals(80, jen.getGradeAverage(), 0);
	}


}
