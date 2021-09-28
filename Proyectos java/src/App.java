public class App {
    public static void main(String[] args) throws Exception 
    {
        int Num1=0, Num2=1,i=1,x=0,iteraciones=5;
        System.out.println(Num1+"\n"+Num2);
        while(iteraciones>=i)
        {
            x=Num1+Num2;
            Num1=Num2;
            Num2=x;
            i++;
            System.out.println(x);
        }
    }
}
