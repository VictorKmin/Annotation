import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        User test = new User("!gor", "rtyjnbvg@gmail.com", "Hf@j");
        User test2 = new User("!@#$%", "vaska@gmail.com", "Pupk!n");
        User normal = new User("Andrey", "andruha@gmail.com", "Stalin");

        handlerValidator(test);
        handlerValidator(test2);
        handlerValidator(normal);



    }


    public static void handlerValidator(User user) throws IllegalAccessException {
        Class clazz = user.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Validator.class)) {
                String s = (String) field.get(user);
                System.out.println(s);
                if (s.matches("^[_A-z0-9]*((-|\\s)*[_A-z0-9])*$")) {
//                if (s.contains("^[_A-z0-9]*((-|\\s)*[_A-z0-9])*$")) {
                    System.out.println("All right");
                }
                else {
                    System.out.println("Error");
                }

            }
        }
    }


}
