
public class PcMuhendisi implements IMuhendis {

    private boolean askerlik;
    private boolean adlisicilkaydi;
    
    public PcMuhendisi(boolean askerlik,boolean adlisicilkaydi)
    {
        this.askerlik=askerlik;
        this.adlisicilkaydi=adlisicilkaydi;
    }
    
    @Override
    public void askerlikdurumusorgula() {
        
        if(askerlik)
        {
            System.out.println("Askerlik yapıldı..");
        }
        else
        {
            System.out.println("Askerlik yapılmadı..");
        }
        
    }

    @Override
    public String mezuniyetortalamasi(String derece) {
        return "Ortalamam: "+derece;
        
    }

    @Override
    public void adlisicilsorgula() {
        
        if(adlisicilkaydi)
        {
            System.out.println("Adli sicil kaydı bulunmaktadır..");
        }
        else
        {
            System.out.println("Adli sicil kaydı bulunamadı..");
        }
    }

    @Override
    public void istecrubesi(String[] array) {
        
        System.out.println("Çalıştığım Yerler: ");
        int i;
        for(i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
        
    }
    
}
