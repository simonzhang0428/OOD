package Enum;

public class MoreEnum {
    enum Names {
        SIMON("Burger") { public String sings() {
            return "I am Simon."; }
        },
        HELEN("Pizza") { public String sings() {
            return "Hi there, I'm Helen."; }
        },
        DUDU("Cheese");

        private String likeFood;

        Names(String likeFood) {
            this.likeFood = likeFood;
        }
        public String getFood() {
            return this.likeFood;
        }
        public String sings() {
            return "Woof";
        }
    }

    public static void main(String[] args) {
        for (Names n : Names.values()) {
            System.out.print(n);
            System.out.print(", like food: " + n.getFood());
            System.out.println(", sings:  " + n.sings());
        }
    }
}

/**
 * SIMON, like food: Burger, sings: I am Simon. 
 * HELEN, like food: Pizza, sings: Hi there, I'm Helen. 
 * DUDU, like food: Cheese, sings: Woof
 */
