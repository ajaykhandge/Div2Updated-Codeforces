 //Java Template

import java.util.*;
import java.io.*;

public class NekoGraphes{
    public static void main(String[] args) throws IOException{
        FastScanner sc= new FastScanner();

        int n = sc.nextInt();
        int m = sc.nextInt();

        int chests[] = new int[n];
        int keys[] = new int[m];

        for(int i=0;i<n;i++)
           { chests[i] = sc.nextInt();}

        for(int j=0;j<m;j++)
            { keys[j] = sc.nextInt();}

         
        int chestsodd = 0, chestseven = 0;
        int keysodd = 0, keyseven = 0;
        

        for(int i=0;i<n;i++){
            if(chests[i]%2 != 1)
                chestsodd++;
            else
                chestseven++;
        }

        for(int i=0;i<m;i++){
            if(keys[i]%2 != 1)
                keysodd++;
            else
                keyseven++;
        }

    int ans = Math.min(chestseven,keysodd)+Math.min(chestsodd,keyseven);
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