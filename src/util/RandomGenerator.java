package util;

public class RandomGenerator {
    static public int getRandomNum(int a, int b){
	return (a>b)?(int)(Math.random()*(b-a+1)+a):(int)(Math.random()*(a-b+1)+b);
    }
}
