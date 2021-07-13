package Builder;

public class User {
    private final String firstName;
    private final String lastName;
    private int age;
    private String phone;
    private String address;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // getter and setter

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age = 0;
        private String phone = "";
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // all the following methods are used to set value for optional fields
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public static void main(String[] args) {
        User user = new User.UserBuilder("Simon", "Zhang")
                            .age(35)
                            .phone("408 796 9398")
                            .address("LA")
                            .build();
        System.out.println(user.firstName + " " +
                            user.lastName + " " + 
                            user.age + " " +
                            user.address);
    }
    
}
