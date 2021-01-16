package MyPackage.ActivitySelectionProblem;

import javax.xml.crypto.Data;

public class DataNode{

    int start;
    int end;
    public DataNode(int start,int end){
        this.end = end;
        this.start = start;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }


    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "DataNode{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public int compareTo(DataNode o) {
        return this.end - o.end;
    }
}
