//Java Template

import java.util.*;
import java.io.*;

public class AngryStudents{
    public static void main(String[] args) throws IOException{
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();

            int maxmin = 0;
            int count = 0;

            boolean flag = false;
            for(int i=0;i<n;i++){
                
                char ch = str.charAt(i);
                if(ch=='A')
                    {
                     maxmin  = Math.max(maxmin,count);
                     flag = true;
                     count = 0;
                    }
                else {
                    if(flag==true)
                        count = count+1;
                }
            }

            maxmin = Math.max(maxmin,count);

        System.out.println(maxmin);


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