public class MyArrayList {
    private int size;

    private boolean isEmpty = true;

    private int numberOfElement;

    private int[] elements;



    public MyArrayList(int size){
        this.size = size;
        elements = new int[size];

    }


    public int getSize(){
        return size;
    }

    public boolean isEmpty() {
        return isEmpty;

    }

//    public void arrayListIsEmpty() {
//        isEmpty = false;











    public void add(){

        size++;

    }

    public void remove() {
        if(isEmpty()) throw  new IndexOutOfBoundsException("no element found in the list");
        else{
            size--;
        }


    }


}



