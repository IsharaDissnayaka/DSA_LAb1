import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        StackX mys = new StackX(5);
        try (Scanner sc = new Scanner(System.in)) {
            String number = new String();
            number = sc.next();
            
            for(int a =0;a<number.length();a++){
                if(number.charAt(a)=='('){
                    mys.Push(number.charAt(a));
                }else if(number.charAt(a)==')'){
                    mys.Pop();
                }

            }
        }
        
        
        if(mys.IsEmpty()==true){
            System.out.println("It iS Valid ");
        }
        else{
            System.out.println(" It Is Not Vaid ");
        }
    }
}