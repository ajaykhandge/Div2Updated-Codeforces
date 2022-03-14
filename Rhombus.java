import java.util.*;
import java.io.*;


public class Rhombus{

    public static void main(String[] args) throws IOException{
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();

         int dp[] =  new int[n+1];
         dp[1] = 1;

         for(int i=2;i<=n;i++){
             dp[i] = dp[i-1]+ (i-1) * 4; 
         }

         System.out.println(dp[n]);



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