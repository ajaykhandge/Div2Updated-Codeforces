import java.util.*;
import java.io.*;

public class PetyaAndOrigami{

    public static void main(String[] args) throws Exception{
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int k = sc.nextInt();

        int red_sheets = n*2;
        int green_sheets = n*5;
        int blue_sheets = n*8;

        int red_n = 0, green_n = 0,blue_n = 0;

         red_n = (int) Math.ceil((double) red_sheets / (double) k);
         green_n = (int) Math.ceil((double) green_sheets / (double) k);
         blue_n = (int) Math.ceil((double) blue_sheets / (double) k);

        System.out.println(red_n+ green_n+ blue_n);





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