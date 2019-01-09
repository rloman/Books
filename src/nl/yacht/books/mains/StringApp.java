package nl.yacht.books.mains;

public class StringApp {

    public static void main(String[] args) {
        String name = "Eindhoven";

        String name2 = name;

        name2 = name2+" Breda ";

        String otherName = "Eindhoven";

        otherName = otherName.toUpperCase();

        System.out.println(otherName);

        StringBuilder b = new StringBuilder(name);

        for(int i = 0;i<25000;i++){
            b.append(i);
        }

        name = b.toString();
        System.out.println(name);

        String recipeString = String.format("I like the recipe with %d", 3);
    }
}
