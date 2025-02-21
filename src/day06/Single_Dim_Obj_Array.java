package day06;

public class Single_Dim_Obj_Array {

	public static void main(String[] args) {
		// Single dimensional object array.
		
		Object a[] = {100,10.5,1957486.5648794,'P',"Automation Testing",true};
		
		// Enhanced for loop.
	//	for(Object x:a) {
	//		System.out.println(x);
	//	}
		
	//	Normal for loop.
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
