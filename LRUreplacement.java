import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LRUreplacement {
    public static void main(String[] args) {
        int capacity=3;
        int pages[]={1,2,3,4,2,1,5,2,3,4,5};

        Set<Integer> memory=new HashSet<>();
        Map<Integer,Integer> recentuse=new HashMap<>();
        int pagefaults=0;
        for(int i=0;i<pages.length;i++)
        {
            int page =pages[i];
            if(!memory.contains(page))
            {
                 pagefaults++;
                 if(memory.size()==capacity)
                {
                    int lrupage=-1;
                    int lruindex=Integer.MAX_VALUE;
                    for(int p:memory)
                    {
                        int lastused= recentuse.get(p);
                        if(lastused <lruindex)
                        {
                            lruindex=lastused;
                            lrupage=p;
                        }
                    }
                    memory.remove(lrupage);
                    recentuse.remove(lrupage);
                    System.out.println("removed lru page"+lrupage);
                }
                memory.add(page);
                System.out.println("page loaded"+page); 
            }
            else{
                System.out.println("page"+page+ "is accesed in memory");
                
            }
            recentuse.put(page, i);
        }
         System.out.println("number of pagefaults :"+ pagefaults);

    }
    
}
