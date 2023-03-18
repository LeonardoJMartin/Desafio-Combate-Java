package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		Champion champion1 = new Champion(name, life, attack, armor);

		System.out.println("\nDigite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		Champion champion2 = new Champion(name, life, attack, armor);

		System.out.print("\nQuantos turnos você deseja executar? ");
		int turnos = sc.nextInt();

		for (int i = 1; i <= turnos; i++) {
			if (champion1.getLife() > 0 && champion2.getLife() > 0) {
				champion1.takeDamage(champion2);
				champion2.takeDamage(champion1);
				System.out.println("\nResultado do turno " + i + ":");
				System.out.println(champion1.status());
				System.out.println(champion2.status());
			}
		}
		System.out.println("\nFIM DO COMBATE");

		sc.close();

	}

}
