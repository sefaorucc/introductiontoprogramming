package com.medipol.homeworks;

public class MatrisCarpmaIslemi {

	public static void main(String[] args) {
		int[][] a=new int [][]{{2,1},{-1,4},{5,3}};
        int[][] b=new int [][]{{3,2,1,-1},{4,-2,1,2}};
        int[][] c=new int [3][4];
        int i,j,k,t;
 
		        /*a ve b matrislerinin yazdýrmak*/
		        System.out.println("A matrisi");
		        for(i=0; i<=2; i++) {
		            for(j=0; j<=1; j++) {
		                System.out.print(a[i][j]+"\t");
		            }
		            System.out.println();
        }
 
			        System.out.println("B matrisi");
			        for(i=0; i<=1; i++){
			            for(j=0;j<=3;j++) {
			                System.out.print(b[i][j]+"\t");
			            }
			            System.out.println();
        }
		 
		        /* a ve b matrisinin çarpýmý olan
		         * c martisinin hesaplanmasý */
		        for(k=0; k<=3; k++) {
		            for(i=0; i<=2; i++) {
		                c[i][k]=0;
		                for(j=0; j<=1; j++) {
		                    c[i][k]=c[i][k]+
		                            a[i][j]*b[j][k];
                }
            }
        }
        
		        // c matrisinin yazdýrmak
		        System.out.println("C matrisi");
		        for(i=0; i<=2; i++)
		        {
		            for(j=0;j<=3;j++)
		                System.out.print(c[i][j]+"\t");
		            System.out.println();
        }
    }


	}


