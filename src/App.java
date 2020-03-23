import java.util.Scanner;

public class App {
	
	static int indexInArray(int[] inputArray, int inputNumber) {
		for(int i =0;i<inputArray.length;i++) {
			if (inputArray[i]==inputNumber) {
				return i;
			}
		}
		return -1;
	}
	
	static void showArray(int[] array) {
		for(int i =0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
	}
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6,7,8,9,10};
        int indexInArray;
        int replaceValue;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value:");
        int inputNumber = scanner.nextInt();
        indexInArray = indexInArray(inputArray, inputNumber);
        
        if(indexInArray!=-1) {
        	System.out.println("Found in:"+indexInArray);
        	System.out.println("Enter your value to replace:");
        	replaceValue = scanner.nextInt();
        	inputArray[indexInArray] = replaceValue;
        	showArray(inputArray);
        }else {
        	System.out.println("Value not found.");
        }
        
    }
}
