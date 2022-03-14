import java.util.*;
import java.io.*;


public class NastyaBook{

    public static void main(String[] args) throws Exception{
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int k = sc.nextInt();

        //searhc the bookk

        for(int i=0;i<arr.length;i++){
            int left = arr[i][0], right = arr[i][1];
            if(k>=left && k<=right){
                //chapter found 
                System.out.println(n-i);
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