import java.util.Scanner;
public class Stack{
	int lTop;
	int[] arr;
	int lCapacity;
	public Stack(int aSize){
		lCapacity = aSize;
		lTop = -1;
		arr = new int[aSize];
	}

	public void push(int aValue){
		if(isFull()){
			System.out.println("Stack is overflow");
			System.exit(1);
		}
		System.out.println("inserting... "+aValue);
		arr[++lTop] = aValue;
	}

	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is underFlow");
			System.exit(1);
		}else{
			System.out.println("Removing data... "+arr[lTop]);
		}
		return arr[lTop--];
	}

	public boolean isEmpty(){
		return lTop == -1;
	}

	public boolean isFull(){
		return lTop == lCapacity - 1;
	}

	public static void main(String[] args){
		Stack lObj = new Stack(4);

		System.out.println("Please Enter a Value");
		Scanner lSc1 = new Scanner(System.in);
		int lValue1 = lSc1.nextInt();
		Scanner lSc2 = new Scanner(System.in);
		int lValue2 = lSc2.nextInt();
		Scanner lSc3 = new Scanner(System.in);
		int lValue3 = lSc3.nextInt();
		Scanner lSc4 = new Scanner(System.in);
		int lValue4 = lSc4.nextInt();

		lObj.push(lValue1);
		lObj.push(lValue2);
		lObj.push(lValue3);
		lObj.push(lValue4);
		lObj.pop();
		lObj.pop();
		lObj.pop();
		lObj.pop();
		lObj.pop();
		lSc1.close();
		lSc2.close();
		lSc3.close();
		lSc4.close();


	}
}