package creational.builder.example2;

public class Person {
    // Required fields
    private String firstName;
    private String lastName;

    // Optional fields
    private int age;
    private String address;

    // Private constructor to force use of Builder
    private Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    // Static Builder class
    public static class Builder {
        // Required fields
        private final String firstName;
        private final String lastName;

        // Optional fields (default values)
        private int age = 0;
        private String address = "";

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this; // For method chaining
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age + ", Address: " + address;
    }
}
