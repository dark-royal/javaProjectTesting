package reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class ProblemTest {

    @Test
    public void addProblemTest() {
        Person person = new Person();
        Problem problem = new Problem("marine", Type.SPIRITUAL);
        person.add(problem);
        assertEquals(1,person.getSize());

    }

    @Test
    public void addAnotherProblem(){
        Person person = new Person();
        Problem problem = new Problem("marine", Type.SPIRITUAL);
        Problem problem1 = new Problem("loan", Type.FINANCIAL);
        person.add(problem);
        person.add(problem1);
        assertEquals(2, person.getSize());

    }

    @Test
    public void solveProblemTest(){
        Person person = new Person();
        Problem problem = new Problem("lack of understanding", Type.EDUCATION);
        person.solve(problem);
        assertEquals(0, person.getSize());
    }

    @Test
    public void solveAnotherPersonTest(){
        Person person = new Person();
        Problem problem = new Problem("marine", Type.SPIRITUAL);
        Problem problem1 = new Problem("egun idile", Type.SPIRITUAL);
        Problem problem2 = new Problem("bankrupt", Type.BUSINESS);
        person.add(problem);
        person.add(problem1);
        person.add(problem2);
        assertEquals(3,person.getSize());

        person.solve(problem);
        person.solve(problem1);
        assertEquals(1,person.getSize());
    }

    @Test
    public void recountUnSolved() {
        Person person = new Person();
        Problem problem = new Problem("marine", Type.SPIRITUAL);
        Problem problem1 = new Problem("hunger wan kill me", Type.FINANCIAL);
        Problem problem2 = new Problem("java wan kill me", Type.TECHNICAL);
        Problem problem3 = new Problem("Bankrupt", Type.BUSINESS);
        Problem problem4 = new Problem("i'm confused", Type.EDUCATION);
        person.add(problem);
        person.add(problem1);
        person.add(problem2);
        person.add(problem3);
        person.add(problem4);
        person.solve(problem2);




        }

    }


