import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> nameSet = new TreeSet<>();

        System.out.print("Insira nomes de pessoas separados por vírgula: ");
        String input = sc.nextLine();

        List<String> names = new ArrayList<>(Arrays.stream(input.split(",")).map(String::trim).toList());
        names.sort(null);

        System.out.println();
        names.forEach(System.out::println);
    }
}
