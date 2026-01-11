//isci sinifi ornegi
public class IsciMaas{
    public static void main(String[] args){
        Employee emp1=new Employee(1967,45,2000,"Muazaffer");
         System.out.println("vergi="+emp1.vergi());
        System.out.println("bonus="+emp1.bonus());
        System.out.println("zam="+emp1.zam());
        double netmaas=emp1.maas-emp1.vergi()+emp1.bonus();
        System.out.println("net maas="+netmaas);
        System.out.println("zamli maas="+(emp1.maas+emp1.zam()));
    }
} 
 class Employee{
    public String isim;
    public double maas;
    public int calismasaati,isealinmayili;
    
    Employee(int isealinmayili,int calismasaati,double maas,String isim){
        this.isim=isim;
        this.maas=maas;
        this.calismasaati=calismasaati;
        this.isealinmayili=isealinmayili;
        
    }
    
    public double vergi(){
        if(this.maas>=1000)
        return this.maas*0.03;
        
        return 0.0;
    }
    
    public double bonus(){
        int ekstrasaat=this.calismasaati-40;
        if(ekstrasaat>0)
        return ekstrasaat*30;
        
        return 0.0;
    }
    
    public double zam(){
        int yil=2025-this.isealinmayili;
        if(yil<10)
        return maas*0.05;
        
        else if(yil>=10&&yil<20)
        return maas*0.10;
        
        else
        return maas*0.15;
    }
    
    
    
    
}