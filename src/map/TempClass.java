package map;

public class TempClass {
        public  String toString(){
                return "temp";
        }
        public void finalize(){
                System.out.println("Finalize method calls");
        }
}
