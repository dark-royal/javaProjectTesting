public class MyArrayList {
    private int size;

    private boolean isEmpty = true;

    private int numberOfElement;


    public MyArrayList(int size){
        this.size = size;
        int[] elements = new int[size];

    }


    public int getNumberOfElement(){
        return numberOfElement;
    }

    public boolean isEmpty() {
        return isEmpty;

    }

    public void arrayListIsEmpty() {
        isEmpty = false;

    }









    public void add(String element){

        numberOfElement++;

    }

    public void remove(String element) {
        if (!isEmpty()) numberOfElement++;
        else {
            throw new IndexOutOfBoundsException("no element found in the list");
        }
    }

    }






