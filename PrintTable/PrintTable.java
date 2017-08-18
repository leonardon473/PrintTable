package PrintTable;

public class PrintTable{

	String[][] table;
	int n,m; /// n => x  m => y 
	int nLength[];
	int mLength[];

	public PrintTable(){
	}

	public void setTable(String[][] _table) {
		table = _table;
	}

	/*
	public void setHead(String[][] _head) {
	}

	public void setFooter(String[][] _head) {
	}
	*/	

	public void printTable() {
		n = table.length;
		m = table[0].length;		
		nLength = new int[n];
		mLength = new int[m];

		for (int e = 0; e < m; e++){
			for (int i = 0; i < n; i++){
				if (table[i][e] == null) {
					table[i][e] = "";
				}
			}
		}
		for (int e = 0; e < m; e++){
			for (int i = 0; i < n; i++){
				nLength[i] = table[i][e].length();
			}
			mLength[e] = nLength[0];
			for (int i = 0; i < n - 1; i++){				
				if (mLength[e] < nLength[i+1]) {
					mLength[e] = nLength[i+1];
				}
			}	
		}

		printColorRed();
		printLine();

		System.out.print("|");
		for (int e = 0; e < m; e++){
			printColorCyan();
			System.out.print(" "+table[0][e]);
				//int space = mLength[e] - table[i][e];
			for (int u = 0; u < mLength[e] - table[0][e].length(); u++) {
				System.out.print(" ");
			}
			printColorRed();
			System.out.print(" |");
		}
		System.out.print("\n");

		printLine();

		for (int i = 1; i < n; i++){
			printColorRed();
			System.out.print("|");
			for (int e = 0; e < m; e++){
				printColorGreen();
				System.out.print(" "+table[i][e]);
				for (int u = 0; u < mLength[e] - table[i][e].length(); u++) {
					System.out.print(" ");
				}
				printColorRed();
				System.out.print(" |");
			}
			System.out.print("\n");
		}

		printLine();
		printResetColor();
	}

	public void printLine() {
		System.out.print("+");
		for (int e = 0; e < m; e++){	
			for (int u = 0; u < mLength[e]+2; u++) {
				System.out.print("-");
			}
			System.out.print("+");
		}
		System.out.print("\n");
	}

	public void printColorRed() {
		System.out.print("\033[31m");
	}

	public void printColorCyan() {
		System.out.print("\033[36m");
	}

	public void printColorGreen() {
		System.out.print("\033[32m");
	}

	public void printResetColor() {
		System.out.print("\033[0m");
	}

}