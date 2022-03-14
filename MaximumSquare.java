import java.util.*;
import java.io.*;

public class MaximumSquare{

    public static void main(String [] args) throws IOException{
        FastScanner sc = new FastScanner();
        int k = sc.nextInt();

        while(k-- >0){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0;i<n;i++){
                arr[i]  = sc.nextInt();
            }


            int min = Integer.MAX_VALUE;
            int ans = 0;

          Arrays.sort(arr);

            for(int i=n-1,j=1;i>=0;i--,j++){
                 min = Math.min(min,arr[i]);
                 if(min >= j)
                    ans = j;   
            }
            System.out.println(ans);


            
        }
        
    }

static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

    
}