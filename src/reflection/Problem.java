package reflection;



public class Problem {

    private String name;

    private Type type;
    private boolean isSolved;

    public boolean isSolved(){
        return isSolved;
    }


    public Problem(String name, Type type){
        this.name = name;
        this.type = type;
    }

}
