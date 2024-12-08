import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie wartości n
        System.out.print("Podaj wartość n: ");
        int n = scanner.nextInt();

        // Utworzenie tablicy
        int[] tablica = new int[n];

        // Wypełnienie tablicy liczbami od 1 do n
        for (int i = 0; i < n; i++) {
            tablica[i] = i + 1;
        }

        // Wyświetlenie liczb
        System.out.print("Liczby w tablicy: ");
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }

        scanner.close();
    }
}