
public class Main {
    
    
    
    public static void main(String[] args)
    {
        
        
        PcMuhendisi muhendis1=new PcMuhendisi(true, true);
        muhendis1.adlisicilsorgula();
        muhendis1.askerlikdurumusorgula();
        System.out.println(muhendis1.mezuniyetortalamasi("3,07"));
        String[] tecrube={"Vestel","Artı ve Artı","Trendyol"};
        muhendis1.istecrubesi(tecrube);
        
    }
}
