public class Client {

	public static void main(String[] args) {

		// int q = 0;
		// int n;
		// int m;
		// System.out.print("n= ");
		// n = new Scanner(System.in).nextInt();
		// System.out.print("m= ");
		// m = new Scanner(System.in).nextInt();
		// System.out.print("p= ");
		// p = new Scanner(System.in).nextInt();
		// System.out.println(n);
		// System.out.println(m);
		// System.out.println(p);
		// int c = m;
		// double[][] matrix1 = new double[n][m];
		// double[][] matrix2 = new double[m][p];
		// double[][] matrix3 = new double[n][m];

		// for (int i = 0; i < n; i++)
		// for (int j = 0; j < m; j++) {
		// switch (q) {
		// case 1:
		// matrix1[i][j] =
		// case 2:
		// matrix1[i][j] =
		// }
		//
		// System.out.print("matrix1" + "[" + i + "]" + "[" + j + "]=");
		//
		// }

		NumarComplex a = new NumarComplex(1, 1);
		NumarComplex b = new NumarComplex(2, -5);
		NumarReal c = new NumarReal(5);
		System.out.println("Produsul este:" + a.adunare(b));
		System.out.println("Produsul este:" + c.adunare(a));

	}

}
