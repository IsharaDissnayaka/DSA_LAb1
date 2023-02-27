class Queuex{
    private int maxSize;
    private int Rear=-1;
    private int Front=0;
    private int NItems=0;
    private int array[];


    public Queuex(int max){
        this.maxSize=max;
        array = new int[maxSize];

    }

     public boolean isEmpty(){
        return(NItems==0);
     }

     public boolean isFull(){
        return(Rear==maxSize-1);
     }
    public void insert(int number){
        if(isFull()){
            System.out.println("que is Full");
        }
         NItems++;
         array[++Rear]=number;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("que is Empty");
            return -99;
        }else{
            NItems--;
            return array[Front++];
        }

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("que is Empty");
            return -99;
        }else{
            return array[Front];
        }

    }

}