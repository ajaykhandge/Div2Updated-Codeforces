import java.util.*;
import java.io.*;

public class ChooseNumbers{

    public static void main(String[] args) throws Exception{
        FastScanner sc = new FastScanner();
        int n  = sc.nextInt();
        int arrn[] = new int[n];
        for(int i=0;i<n;i++)
            arrn[i] = sc.nextInt();
        
        int m = sc.nextInt();
        int arrm[] = new int[m];

        for(int i=0;i<m;i++)
            arrm[i] = sc.nextInt();

        Arrays.sort(arrn);
        Arrays.sort(arrm);

        System.out.println(arrn[n-1] +" " + arrm[m-1]);


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