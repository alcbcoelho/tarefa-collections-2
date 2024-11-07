import model.Person;
import exception.InvalidPatternException;

import java.util.*;

public class Program2 {
    private static final String VALUE_TO_QUIT = "9999";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Person> men = new HashSet<>();
        Set<Person> women = new HashSet<>();

        while (true) {
            try {
                System.out.print(
                        "\nInsira o nome de uma pessoa separado por um hífen seguido pela inicial de seu sexo (exemplo: André - M); ou " +
                        VALUE_TO_QUIT + " para sair do programa: "
                );
                String input = sc.nextLine();

                if (input.equals(VALUE_TO_QUIT)) break;

                List<String> inputParts = Arrays.stream(input.split("-")).map(String::trim).toList();

                validateInputAfterSplit(inputParts);

                Person p = new Person(inputParts.get(0), inputParts.get(1));

                if (p.getGender().equalsIgnoreCase("M")) {
                    men.add(p);
                    System.out.println("\n" + p.getName().toUpperCase() + " adicionado ao conjunto dos HOMENS");
                } else {
                    women.add(p);
                    System.out.println("\n" + p.getName().toUpperCase() + " adicionada ao conjunto das MULHERES");
                }

                System.out.println("\nConjunto dos homens: " + men);
                System.out.println("Conjunto das mulheres: " + women);
            } catch (InvalidPatternException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void validateInputAfterSplit(List<String> inputParts) {
        if (inputParts.size() != 2)
            throw new InvalidPatternException();
        if (!inputParts.get(1).equalsIgnoreCase("M") && !inputParts.get(1).equalsIgnoreCase("F"))
            throw new InvalidPatternException();
    }
}
