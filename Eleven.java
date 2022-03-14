 //Java Template

import java.util.*;
import java.io.*;

public class Eleven{
    public static void main(String[] args) throws IOException{
        FastScanner sc = new FastScanner();
        int n= sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(1);

        int ans = 1+1;
        int i = 2;
        while(ans<=n)
        {
            list.add(ans);
            ans = list.get(i-1) + list.get(i-2);
            i++;
        }

        HashSet<Integer> set = new HashSet<>(list);

        String res="";

        for(int j=1;j<=n;j++){
            if(set.contains(j))
                res+='O';
            else
                res+='o';
        }

        System.out.println(res);

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