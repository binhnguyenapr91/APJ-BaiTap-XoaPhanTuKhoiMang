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

	static void removeItem(int[] array, int index){
		array[index]=0;
		changeThePosition(array,index);
	}

	static void changeThePosition(int[] array,int index){
		for(int i = index;i<array.length-1; i++){
			int temp=1;
			temp = array[i];
			 array[i]= array[i+1];
			 array[i+1] = temp;
		}
	}
	static void showArray(int[] array) {
		for(int i =0;i<array.length;i++) {
			System.out.print(" "+array[i]);
		}
		System.out.println("\n");
	}
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5,6,7,8,9,10};
        int indexInArray;
        int replaceValue;
		System.out.println("This part to replace one item.");
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

		System.out.println("This part to remove one item!");
        showArray(inputArray);
		System.out.println("Enter your value to remove:");
		int removeValue = scanner.nextInt();
		indexInArray = indexInArray(inputArray, removeValue);
		removeItem(inputArray,indexInArray(inputArray,removeValue));
		showArray(inputArray);
    }
}
