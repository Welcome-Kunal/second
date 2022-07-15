package Com.kite.TestCases;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		int A[]= {15,65,48,25,15,18,65};
		System.out.println(A.length);
		Arrays.sort(A);
		{for(int i=0;i<=A.length;i++) {
			System.out.print(A[i]+"  ");}}
		System.out.println();
		{for(int i=1-A.length;i>=0;i--) {
			System.out.print(A[i]+"  ");}}
		System.out.println();
		{for(int j=0;j<=A.length;j++) {
			if(A[j]%2!=0) {
				System.out.print(A[j]+"  ");}}}
		System.out.println();
		{for(int j=0;j<A.length;j++) {
			if(A[j]%2==0) {
				System.out.print(A[j]+"  ");}}}
		System.out.println();
		{int Maximum=A[0];
		for(int k=0;k<A.length;k++) {
			if(Maximum>A[k]) {
				Maximum=A[k];}}
		System.out.println("Maximum Number="+Maximum);}
		System.out.println();
		{int Minimum=A[0];
		for(int k=0;k<A.length;k++) {
			if(Minimum<A[k]) {
				Minimum=A[k];}}
		System.out.println("Mimimum Number="+Minimum);}
		for(int X=0;X<A.length;X++) {
			for(int Y=X+1;Y<A.length;Y++) {
				if(A[X]==A[Y]) {
					System.out.print(A[Y]+"  ");}}}
}
}
