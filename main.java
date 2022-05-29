import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      ArrayList<Integer> data = new ArrayList<Integer>();
      
      data.add(5);
            data.add(4);
                  data.add(3);
                        data.add(2);
                              data.add(1);
                                    data.add(0);
      
      Iterator iter = new Iterator();
      iter.setData(data);
      
      while(iter.hasNext()) {
        System.out.println(iter.next());
      }
    }
}

public class Iterator {
  public ArrayList<Integer> data;
  private int indx;
  
  public Iterator() {
    this.indx = 0;
  }
  
  public void setData(ArrayList<Integer> arr) {
    this.data = arr;
  }
  public boolean hasNext() {
    return this.indx < this.data.size();
  }
  public int next() {
    if (this.hasNext()) {
      int current = this.data.get(this.indx);
      this.indx += 1;
      return current;
    }
    return -1;
  }
  public void reset() {
    this.indx = 0;
  }
}



