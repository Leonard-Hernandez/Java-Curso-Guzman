package Wrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10,12,13,14,15};

        int sum = 0;

        for(Integer i: enteros){
            if(i%2 == 0){
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
