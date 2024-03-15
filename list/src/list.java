
public class list 
{
    node head;
    public list()
    {
        this.head = null;
    }
    void insert(int val)
    {
        node newNode = new node(val);
        if(head == null)
            head = newNode;
        else
        {
            node current = head;
            while(current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }
    
    void insertatbegin(int val)
    {
        node newNode = new node(val);
        if(head == null)
            head = newNode;
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }
    
    void avg()
    {
        int sum = 0;
        int count = 0;
        node current = head;
        while(current != null)
        {
            sum += current.val;
            count++;
            current = current.next;
        }
        System.out.println(sum/count);
    }
            
    void deleteatEnd()
    {
        if(head != null)
        {
            node current = head;
            while(current.next.next != null)
                current = current.next;
            current.next = null;
        }
    }
    
    void deleteatbegin()
    {
        head = head.next;
    }
            
    void display()
    {
        node current = head;
        while(current != null)
        {
            System.out.print(current.val+" -->");
            current = current.next;
        }
        System.out.println("NULL");
    }
    
    int max()
    {
        int max = head.val;
        node current = head.next;
        while(current != null)
        {
            if(max < current.val)
                max = current.val;
            current = current.next;
        }
        return max;
    }
    
    int numberofZero()
    {
        int count = 0;
        node current = head;
         while(current != null)
        {
            if(current.val == 0)
                count++;
            current = current.next;
        }
         return count;
    }
    
    void insertMiddle(int val)
    {
        node current = head;
        node newNode = new node(val);
        while(current.next != null)
        {
            if(current.val < val && current.next.val > val)
            {
                newNode.next = current.next;
                current.next = newNode;
            }
            current = current.next;
        }
    }
    
    
    
    public static void main(String[] Args)
    {
        list l = new list();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(8);
        l.display();
        l.insertMiddle(5);
        l.display();
        System.out.println(l.max());
        l.display();
        l.deleteatEnd();
        l.deleteatEnd();
        l.display();
        l.deleteatbegin();
        l.display();
        l.avg();
        System.out.println(l.max());
    }
    
    
    
    
}
