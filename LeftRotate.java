
public class LeftRotate {

	public static void main(String[] args) {
		
		
		int c[]= {1,2,3,4,5};
		
		
		
		int n=3;
		for(int i=0;i<n;i++) {
			
			int j,first;
			first=c[0];
			
			for(j=0;j<c.length-1;j++) {
				c[j]=c[j+1];
			}
			
			c[j]=first;
		}

	for(int j=0;j<c.length;j++) {
		System.out.println(c[j]);
	}
	}
}
