package reflection;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private boolean hasType;
    private int problem4;
    private ArrayList<Problem> problems = new ArrayList<>();

    public void add(Problem problem) {

        problems.add(problem);

        problem4++;
    }




    public void solve(Problem problem){
        problems.remove(problem);
        problem4--;

    }

    public List<Problem> recount(){
        return problems;

    }

    public boolean problemHasType() {
        return hasType;
    }

    public int getSize() {
        return problems.size();
    }


}
