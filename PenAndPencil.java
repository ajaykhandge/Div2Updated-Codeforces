import java.io.*;
import java.util.*;

public class PenAndPencil{

    public static void main(String[] args){
        FastScanner sc= new FastScanner();

        int t =sc.nextInt();

        while(t-->0){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int k = sc.nextInt();

            
            int r_pens = 0;
            int r_pencils = 0;
            if(a<=c)
                r_pens = 1;
            else
             r_pens = (int)Math.ceil(((double)a/(double)c));

            if(b<=d)
                r_pencils  =1;
            else
                r_pencils = (int)Math.ceil(((double)b/(double)d));
            

            if((r_pens+ r_pencils) > k)
                System.out.println(-1);
            else
            {
                System.out.println(r_pens+" "+ r_pencils);
            }
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