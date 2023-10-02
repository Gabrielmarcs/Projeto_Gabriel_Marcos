public class A{
    private int a1;
    private float a2;

    public int getA1(){
        return this.a1;
    }
    public float getA2(){
        return this.a2;
    }
    public void setA1(int a1){
        this.a1 = a1;
    }
    public void setA2(float a2){
        this.a2 = a2;
    }
    public void ma1(){
        System.out.println("Método MA1, classe A");
    }
    public void ma2(){
        System.out.println("Método MA2, classe A");
    }
    public void ma3(){
        System.out.println("Alteração da classe A partir do clone");
    }   
}