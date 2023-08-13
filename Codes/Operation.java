public class Operation{
	int data=50;
/** call by reference example*/
	void change(Operation op){
		op.data=op.data+500;
// Main method starts from here
}
	public static void main(String[] args) {
		Operation op=new Operation();
		System.out.println("before change"+op.data);
		op.change(op);
		System.out.println("ater"+op.data);
		System.out.println(op);
	}
}