
/*
class Engine {
    void print(Element parent) {
        if (parent == null) return;
        if (parent.left != null) {
            System.out.print("(");
            print(parent.left);
        }
        
      
        
        System.out.print(parent.name);
        
        if (parent.right != null) {
            print(parent.right);
            System.out.print(")");
        }
        
    }
    Element create(String[] data) {
        return create(data, 0, data.length - 1);
    }
    Element create(String[] data, int left, int right) {
       if (left > right) return null;
       int mid = (left + right) / 2;
       Element center = new Element();
       center.name = data[mid];
       center.left = create(data, left, mid - 1);
       center.right = create(data, mid + 1, right);
       return center;
    }
    void loopNum(int n) {       
        if (n == 0) return;
        loopNum(n - 1);
        System.out.println(n);
    }
}

*/
 