package userDefinedComparator_TreeSet;

public class UserDefinedPerson implements Comparable{
    int eId;
    String name;

    public UserDefinedPerson(int eId, String name) {
        this.eId = eId;
        this.name = name;
    }

    @Override
    public String toString() {
        return eId +
                ":" + name;
    }

    @Override
    public int compareTo(Object o) {
        int eid = this.eId;
        UserDefinedPerson userDefinedPerson= (UserDefinedPerson) o;
        int eid2 =userDefinedPerson.eId;
        if(eid<eid2){
            return -1;
        }
        else if (eid>eid2){
            return +1;
        }
        else
            return 0;

    }
}
