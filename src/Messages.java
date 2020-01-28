public class Messages
{
    public static void main(String [] args)
    {
        Thought thinking = new Thought();
        Advice speaking = new Advice();

        thinking.message();
        speaking.message(); //overridden method

        System.out.println("By Grace Hudgens");
    }//end main method
}//end messages
