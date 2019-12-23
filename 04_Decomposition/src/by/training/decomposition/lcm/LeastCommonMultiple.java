package by.training.decomposition.lcm;

public class LeastCommonMultiple {

    private long lcm(long a,long b){
        return a / gcd(a,b) * b;
    }
    private long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }


    public long lcm(long ... numbers){
        long lcm = 1;
        for (long number: numbers) {
            lcm = lcm(number, lcm);
        }
        return lcm;
    }
}
