class Operation{
	int data=50;

	void change(int data){
		data=data+500;
	}
	public static void main(String[] args) {
		Operation op=new Operation();
		System.out.println("before change"+op.data);
		op.change(500);
		System.out.println("ater"+op.data);
	}
}