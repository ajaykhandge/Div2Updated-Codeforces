import java.util.*;
import java.io.*;


public class Rounding{

    public static void main(String[] args) throws IOException{
        FastScanner sc = new FastScanner();
        int n  = sc.nextInt();

        if(n==0 || n%10==0)
            {
                System.out.println(n);
                return;
            }

        int div = n/10;
        int ans = 0;

        int rem = n%10;
        if(rem<=5)
            ans = div*10;
        else {
            ans = div*10 + 10;
        }


        System.out.println(ans);

        

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