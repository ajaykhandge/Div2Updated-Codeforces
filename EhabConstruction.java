import java.util.*;
import java.io.*;

public class EhabConstruction{
    public static void main(String[] args) throws IOException{
        FastScanner sc = new FastScanner();
        int x = sc.nextInt();
        boolean flag = false;

        for(int i=x;i>=1 && flag==false ;i--){
            
            for(int j=2;j<=i;j++){
                if(i%j==0){

                    if((i*j) > x && (i/j) < x)
                    {
                        System.out.println(i+" "+ j);
                        flag = true;
                        break;
                    }

                }
            }
        }
        if(!flag)
        System.out.println(-1);



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