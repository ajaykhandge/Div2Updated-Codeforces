import java.util.*;
import java.io.*;

public class Game{

    public static void main(String []args) throws Exception{
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        
        Arrays.sort(arr);

        if(n%2!=0)
        System.out.println(arr[n/2]);
        else
        System.out.println(arr[((n/2)-1)]);






        

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