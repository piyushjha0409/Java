public class LoadingBlocks{

    static{
        System.out.println("Inside static");
    }
    {
        System.out.println("Inside init block");
    }
    public static void main(String[] args) {
        new LoadingBlocks();
        new LoadingBlocks();
        new LoadingBlocks();
        new LoadingBlocks();
       
    }
}