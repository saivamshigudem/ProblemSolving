
public class Frequency {

	public static void main(String[] args) {
		int []c = {10,20,10,30,50,20,40};
		
		int visit=-1;
		for(int i=0;i<c.length;i++) {
			int count=1;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
					c[j]=visit;
				}
			}

			if(c[i]!=visit) {
				System.out.println(c[i]+" count value  "+count);
			}
			}
		}
		
	}

