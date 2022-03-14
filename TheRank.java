import java.util.*;
import java.io.*;

public class TheRank{
    public static void main(String []args) throws Exception{
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int sum = A+B+C+D;
        int rank=1;

        for(int i=1;i<n;i++){
              A = sc.nextInt();
              B = sc.nextInt();
              C = sc.nextInt();
              D = sc.nextInt();

            if(sum<(A+B+C+D))
                rank++;

        }
        System.out.println(rank);




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