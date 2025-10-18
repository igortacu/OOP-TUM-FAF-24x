public class Greeter {
    private final String greeting; // helo
    public Greeter( String greeting){
        if(greeting == null || greeting.isEmpty()){
            throw new IllegalArgumentException("Greeting is null or empty or times is less than 0");
        }
        this.greeting = greeting;
    }
    public String greet(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name");
        return greeting + ", " + name + "!";
    }

    public String greet(String name, int times) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name");
        if (times <= 0) throw new IllegalArgumentException("times > 0");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            if (i > 0) sb.append(System.lineSeparator());
            sb.append(greet(name));
        }
        return sb.toString();
    }
}
