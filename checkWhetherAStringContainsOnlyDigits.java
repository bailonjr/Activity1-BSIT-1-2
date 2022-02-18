public class checkWhetherAStringContainsOnlyDigits{
    //Input String
    static String name = "Josh";
    static String cell = "0114569278";
                     
    public static boolean verifyName() {
       if (name.matches ("[a-zA-Z]+")){
          return true;
       }else{
           return false;
       }
    }
    public static boolean verifyCell (){
        if(cell.matches ("[0-9]+")){
          return true;
    }else{
          return false;
    }
}
    public static void main(String []args) {
        System.out.println(verifyName());
        System.out.println(verifyCell());
    }
}