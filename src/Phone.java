import java.io.Serial;
import java.io.Serializable;
import java.util.Arrays;

public class Phone implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит {" + name + "}");
    }

    public void receiveCall(String name, String number) {
        System.out.println("Phone{" +
                            "name='" + name + '\'' +
                            ", number='" + number + "'}");
    }

    public void sendMessage(String... numbers) {
        System.out.println("\nОтправляны сообщения на номер(а): " + Arrays.toString(numbers));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
