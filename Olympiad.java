import java.util.*;
import java.io.*;

public class Olympiad{
    public static void main(String[] args) throws IOException{

        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<n;i++){
            if(arr[i]!=0 && !set.contains(arr[i]))
                set.add(arr[i]);
                
             
        }

        System.out.println(set.size());
 
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