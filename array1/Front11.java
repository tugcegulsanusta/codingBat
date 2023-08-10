package array1;

public class Front11 {
    /*
    Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.


    front11([1, 2, 3], [7, 9, 8]) → [1, 7]
    front11([1], [2]) → [1, 2]
    front11([1, 7], []) → [1]

     */
    public int[] front11(int[] a, int[] b) {
        int[] arrtwo = new int[2];
        int[] arrone = new int[1];
        int[] arrzero = new int [0];
        if(a.length>= 1 && b.length >= 1){
            arrtwo[0] = a[0];
            arrtwo[1] = b[0];
            return arrtwo;
        }else if(a.length>=1 && b.length<1){
            arrone[0]=a[0];
            return arrone;
        }else if(b.length>=1 && a.length<1){
            arrone[0] = b[0];
            return arrone;
        }return arrzero;
    }

}
