package cloudix;

public class Prime {
    // test if a number is prime
    public static boolean bruteForce(int input){
        //edge case
        if(input <= 1) return false;

        // we could check all the way to n-1, that is not necessary
        // lets say we receve input = 100, 50 is a factor, but it needs a 2.
        // The largest possible prime factor is the square root.
        int squareRoot = (int)Math.sqrt((double)input);
        for(int i = 2; i <= squareRoot; i++){
            if(input % i == 0) return false;
        }

        return  true;
    }
}
