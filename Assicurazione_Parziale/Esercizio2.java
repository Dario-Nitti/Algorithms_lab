package Assicurazione_Parziale;

public class Esercizio2 {

    public static <T> void inverti(T[] array){
        int len= array.length;
        for(int i=0; i<len/2; i++){
            T temp= array[i];
            array[i]=array[len-1-i];
            array[len-i-1]=temp;
        }
    }

    public static <T> T[] inverti2(T[]array){
        int len= array.length;
        T temp[] = array.clone();
        for(int i=0; i<len; i++)
            temp[i]=array[len-1-i];
        return temp;
    }
    public static void main(String[] args) {
        // ver 1
        Integer x[] = {0,1,2,3,4,5,6,7,8,9};
        inverti(x);
        System.out.println();
        for(Integer i: x) System.out.print(i + " ");

        //ver2
        System.out.println();
        Integer y[] = inverti2(x);
        for(Integer i: y) System.out.print(i + " ");

    }

}
