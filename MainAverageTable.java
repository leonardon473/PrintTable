import java.util.Scanner;

import PrintTable.PrintTable;

public class MainAverageTable{
	public static void main(String[] args){
		String[][] _table = new String[8][3];
		writeTable(_table);
		averageTable(_table);

		PrintTable table = new PrintTable();
		table.setTable(_table);
		table.printTable();
	}

	public static void writeTable(String[][] table) {
		table[0][0] = "First name";
		table[0][1] = "Last name";
		table[0][2] = "Average";
		table[1][0] = "Leonardo";
		table[1][1] = "Ramírez";
		table[1][2] = "6";
		table[2][0] = "Fernando";
		table[2][1] = "Basurto";
		table[2][2] = "6";
		table[3][0] = "Kelvin";
		table[3][1] = "Mendoza";
		table[3][2] = "7";
		table[4][0] = "Itzel";
		table[4][1] = "Garcia";
		table[4][2] = "8";
		table[5][0] = "Ulises";
		table[5][1] = "Navarrete";
		table[5][2] = "7";
		table[6][1] = "Average";
		table[7][1] = "General=";
	}

	public static void scanTable(String[][] table) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++){
			System.out.print("Nombre de la persona "+i+":\n");
			table[i][0] = sc.nextLine();
			System.out.print("Apellido de la persona "+i+":\n");
			table[i][1] = sc.nextLine();
			System.out.print("Promedio de la persona "+i+":\n");
			table[i][2] = sc.nextLine();
		}
	}

	public static void averageTable(String[][] table) {
		float promedio = 0;
		for (int i=1;i<6;i++) {
			promedio += Float.parseFloat(table[i][2]);
		}
		promedio = promedio / 5;
		table[7][2] = String.valueOf(promedio);
	}
}
/*
Leonardo            Ramírez             6                   
Ulises              Navarrete           7                   
Fernando            Basurto             6                   
Kelvin              Mendoza             7                   
Itzel               Garcia              8 
*/