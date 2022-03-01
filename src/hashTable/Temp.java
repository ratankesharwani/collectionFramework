package hashTable;

public class Temp {
    int i;
    Temp(int i){
        this.i = i;
    }
    public int hashCode(){
        return  i%9;
    }
        public String toString(){
        return  i+"";
        }
}
