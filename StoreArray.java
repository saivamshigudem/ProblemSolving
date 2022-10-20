class Exchange{
	public void Enter(int a[]) {
		int b[] = new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
		
	}
}



public class Problem1 {

	public static void main(String[] args) {
		int a[]= {10,20,70,80,45};
		
		new Exchange().Enter(a);;
		
	}

}
