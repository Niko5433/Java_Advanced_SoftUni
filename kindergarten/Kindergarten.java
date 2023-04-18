package kindergarten;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;


    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child) {
        if (this.capacity > this.registry.size()) {
            this.registry.add(child);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeChild(String firstName) {
        Child child = this.registry.stream().filter(r -> r.getFirstName().equals(firstName))
                .findFirst().orElse(null);
        return this.registry.remove(child);
    }

    public int getChildrenCount() {
        return this.registry.size();
    }

    public Child getChild(String firstName) {
        for (Child child : this.registry) {
            if (child.getFirstName().equals(firstName)) {
                return child;
            }
        }
        return null;
    }
    public String registryReport() {
        Collections.sort(registry, Comparator.comparing(Child::getAge)
                .thenComparing(Child::getFirstName)
                .thenComparing(Child::getLastName));

        StringBuilder report = new StringBuilder();
        report.append("Registered children in " + this.name + ":\n");
        for (Child child : registry) {
            report.append("--\n" + child.toString() + "\n");
        }
        return report.toString();
    }


}
