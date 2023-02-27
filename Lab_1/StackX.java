public class StackX {


    private int Top;
    private int MaxSize;
    private char array[];

    public StackX(int Number){
        this.MaxSize=Number;
        array = new char[MaxSize];
        Top=-1;
    }
   

    public boolean IsEmpty(){
        return(Top==-1);
    }
    
    public boolean IsFull(){
        return(Top==MaxSize-1);
    }

    public void Push(char val){
          if(IsFull()){
            System.out.println("Que IS Full ");
          }else{
            array[++Top]=val;
          }
    }


    public char Pop(){
        if(!IsEmpty()){
            return array[Top--];
           
        }else{
            System.out.println("array Is Empty");
           
        }
        return 0;  
    }

    public char Peek(){
        if(!IsEmpty()){
            return array[Top];
        }else{
            System.out.println("array Is Empty");
        }
        return 0;  
    }
}
