package Task;

public class conover {

        int a;
        int b;
        int c;
        public conover (int a, int b)
        {
        this.a=a;
        this.b=b;

            System.out.println("Calling a and b");
        }
        public conover (int a, int b ,int c)
        {
            this.a=a;
            this.b=b;
            this.c=c;
            System.out.println("Calling a ,b and c");
        }
        public static void main(String[] args)
        {
            conover c1=new conover(9,3);
            conover c2=new conover(3,4,5);
            System.out.println(c1.a);
            System.out.println(c2.b);
        }
    }
