public class Queue{

	public int[] mArr;
	public int mCapacity;
	public int mFront;
	public int mRear;
	public Queue(int aSize){
		mArr = new int[aSize];
		mFront = 0;
		mRear = -1;
		mCapacity = aSize;
	}
	public void enQueue(int aValue){
		if(isFull()){
			System.out.println("Queue is overflow: ");
			System.exit(1);
		}
		System.out.println("inserting from rear... "+aValue);
		mArr[++mRear] = aValue;
	}

	public int deQueue(){
		if(isEmpty()){
			System.out.println("Queue is underflow");
			System.exit(1);
		}
		System.out.println("Removing..."+mArr[mFront]);

		return mArr[mFront--];
	}

	public boolean isEmpty(){
		return mRear == -1;
	}

	public boolean isFull(){
		return mRear == mCapacity - 1;
	} 

	public static void main(String[] args){
		Queue lObj = new Queue(4);

		lObj.enQueue(4);
		lObj.enQueue(5);
		lObj.enQueue(7);
		lObj.enQueue(6);
		lObj.deQueue();
		

	}
}