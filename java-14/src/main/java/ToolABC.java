class ToolABC {
    Element sort (Element head) {
        if (head == null) return null;
        if (head.next == null) return head;
        Element middle = divide(head);
        head = sort(head);
        middle = sort(middle);
        return merge(head, middle);
    }
    Element divide(Element head) {
        if (head == null) return null;
        if (head.next == null) return null;
        Element fast = head;
        Element slow = head;
        while (fast != null &&
                fast.next != null &&
                fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Element middle = slow.next;
        slow.next = null;
        return middle;
    }
    Element merge(Element a, Element b) {
        Element head = null;
        Element tail = null;
        while (a != null || b != null) {
            Element target = null;
           // if (a == null && b == null) { break; }
            if (a != null && b == null) { target = a; a = a.next; }
            if (a == null && b != null) { target = b; b = b.next; }
            if (a != null && b != null) {
               if(a.value < b.value) {
                   target = a;
                   a = a.next;
               } else {
                   target = b;
                   b = b.next;
               }
            }
            if (head == null) {
                head = target;
                tail = head;
            }
            tail.next = target;
            tail = tail.next;
        }
        return head;
    }
    Element create(int[] data) { 
        if (data == null || data.length == 0) 
            return null;
        Element head = new Element();
        head.value = data[0];
        Element last = head;
        for (int i = 1;i < data.length ;i++) {
            Element e = new Element();  //create
            e.value = data[i];          //Set up
            last.next = e;              //linking
            last = last.next;           //last++
        }
        return head;
    }
    void print(Element e) {
        for (Element c = e; c != null; c = c.next) {
            System.out.println(c.value);
        }
    }
}

/*
class Tool {
    int leave(Element data) {
        if (data == null)  return 0;
        if (data.left == null &&  data.right == null)
            return 1;
        return (leave(data.left) + leave(data.right));
    }
    
    int count (Element data) {
        if (data == null) 
            return (0);
        return (count(data.left)+ 1 + count(data.right));
    }
    
    Element create(int[] data) {
        Element root = null;
        for (int i = 0; i < data.length; i++) {
            root = insert(root, data[i]);
        }
        return root;
    }
    Element insert(Element parent, int k) {
        if (parent == null) {
            parent = new Element();
            parent.value = k;
            return parent;
        }
        if (k < parent.value) 
            parent.left = insert(parent.left, k);
        if (k >= parent.value)   // change ">=" to ">" for non-duplicate value
            parent.right = insert(parent.right, k);
        return parent;
    }
    void print(Element parent) {
        if (parent == null) return;
        print(parent.left);
        System.out.println(parent.value);
        print(parent.right);
    }
}
*/


/*
class Element {
    int number;
    double weight;
    String name;
    Element back;
}
*/