public class Test{
    public static void main(String[] args){
        System.out.println("Hey");

        Integer a = 3;

        System.out.print("Thie is a number: " + a);
        System.out.println("It has a type: " + a.getClass().getName());


        System.out.println("This is that same number ToString()'d: " + a.toString());
        System.out.println("It also has a type: " + a.toString().getClass().getName());

        System.out.println("This created a string from a thing: " + String.valueOf(42));

        int[] value = {1,2,3};

        System.out.println("This is the value of... uh the value? " + String.valueOf(value));
        System.out.println("This is the value added to me " + value);
        
        System.out.println("How do I get this value from `value`?\n123");


        /*
        string_version = String.valueOf(value[0]) + String.valueOf(value[1]) + String.valueOf(value[2]);
        string_version = string_version + string_version;
        string_version = String.valueOf(value[0]) + String.valueOf(value[1]) + String.valueOf(value[2]);

        string_version = String.valueOf(value[0]);
        string_version = string_verision + String.valueOf(value[1]);
        string_version = string_verision + String.valueOf(value[2]);
        */

        String string_version = "";

        for (int i = 0; i < value.length; i++){
            //System.out.print(value[i]);
            string_version = string_version + value[i];

        }

        System.out.println(string_version);
    }
}
