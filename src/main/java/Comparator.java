public class Comparator <T extends Object, U extends Object>  {
    private U [] array1;
    private T [] array2;

    public Comparator(U[] array1, T[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }


    public void compareArrays(){
        System.out.println(array1.getClass() == array2.getClass());


    }


}
