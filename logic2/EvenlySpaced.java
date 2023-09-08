package logic2;

public class EvenlySpaced {
    /*
    Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.


    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false
     */
    public boolean evenlySpaced(int a, int b, int c) {
        int max= findMax(a,b,c);
        int middle = findMiddle(a,b,c);
        int min = findMin(a,b,c);

        if(Math.abs(max-middle)==Math.abs(middle-min)){
            return true;
        }return false;

    }
    public int findMin(int x, int y, int z){
        int min1 = Math.min(x,y);
        int min2 = Math.min(x,z);
        int min = Math.min(min1,min2);
        return min;
    }
    public int findMax(int x, int y, int z){
        int max1 = Math.max(x,y);
        int max2 = Math.max(x,z);
        int max = Math.max(max1,max2);
        return max;
    }
    public int findMiddle(int x, int y , int z){
        if((x<y && x>z)||(x<z && x>y)){
            return x;
        }if((y<x && y>z) || (y>x && y<z)){
            return y;
        }else{
            return z;
        }
    }
}
