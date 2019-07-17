public class Zoo {
	/*
	public static void main(String[] args){
		System.out.println("Parametro 1:" + args[0]);
		System.out.println("Parametro 2:" + args[1]);
	}
	*/
	/*
	public static void main(String args[]){
		System.out.println("Parametro 1:" + args[0]);
		System.out.println("Parametro 2:" + args[1]);
	}
	*/
	
	public static void main(String...args){
		System.out.println("With Varargs - Parametro 1:" + args[0]);
		System.out.println("With Varargs - Parametro 2:" + args[1]);
	}
	
}
