package sk.itsovy.dolinsky.unittests;

public class Main {

    public static void main(String[] args) {

    	int[] arr = {100,200,3};
		System.out.println(new MyMath().isPrimeNumber(7));
		System.out.println(new MyMath().getMin(arr));
		System.out.println(new MyMath().existTriangle(2,2,5));
		System.out.println(new Text().reverse("avaJ"));
		System.out.println(new Information().convertToBinary(254));
    }
}
