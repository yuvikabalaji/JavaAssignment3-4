public class MethodOverloading {
        int square(int num1, int num2)
        {
            return (num1+num2)*(num1+num2);
        }
        int square(int num1, int num2, int num3)
        {
            return (num1+num2+num3)*(num1+num2+num3);
        }
        int square(int num1, int num2, int num3, int num4)
        {
            return (num1+num2+num3+num4)*(num1+num2+num3+num4);
        }
        public static void main(String[] args)
        {
            MethodOverloading obj = new MethodOverloading();

            System.out.println("Square of the sum of two numbers: "+obj.square(1, 2));
            System.out.println("Square of the sum of three numbers: "+obj.square(1, 2, 3));
            System.out.println("Square of the sum of four numbers: "+obj.square(1, 2, 3, 4));
        }
    }

