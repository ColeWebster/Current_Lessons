# Java Classes Review

### Q1: What would cause the error below:
<pre><code>
public class Shelf {
    String material;

    public Shelf() {

    }

    public static void main(String[] args) {
        Shelf bureau = new Shelf("pine");
    }
}
</code></pre>

The constructor does not have a parameter listed and would cause the error

### Q2: Every Java program contains at least one class
- True, Java programs always require one class, and real-world programs can contain hundreds.

### Q3 The "Bank" class has one instance field: branchLocationCount. Complete the constructor method for this class:
<pre><code>
public class Bank {
    int branchLocationCount:

    public Bank ( BLANK ) {
        branchLocationCount = numLocations;
    }

    public static void main (String[] args) {
        // Program tasks
    }
}
</code></pre>

- int numLocations

### Q4: Instances of a Java class represent the real world with what two qualities?

- State and behavior

### Q5: The main() method is automaticalls run when the .class file is executed.
- True

### Q6: What is the signature of the followign constructor?
<pre><code>
public class Bug {
  String name;
  boolean ableToFly;
  int numberOfLegs;
 
  public Bug(String bugName, boolean canFly, int numLegs) {
    name = bugName;
    ableToFly = canFly;
    numberOfLegs = numLegs;
  }
  public static void main(String[] args) {
    Bug ladybug = new Bug("Lady Bug", true, 6);
  }
}
</code></pre>

- Bug(String bugName, boolean canFly, int numLegs)
- A signature consists of the constructors name and then the data type and name of each of its parameters. 

### Q7: What is the data type of the variable hedwig?
<pre><code>
public class Owl {
  String speak;
  boolean nocturnal;
  public Owl() {
    speak = "Hoot";
    nocturnal = true;
  }  
 
  public static void main(String[] args) {
    Owl hedwig = new Owl();
  }
}
</code></pre>
- Owl
- The hedwig variable has a reference data type. When declaring a variable with a reference data type, the vaiables type is the name of a class.