public class B{
    private int b1;
    private float b2;
    public int getB1(){
        return this.b1;
    }
    public float getB2(){
        return this.b2;
    }
    public void setB1(int b1){
        this.b1 = b1;
    }
    public void setA2(float b2){
        this.b2 = b2;
    }
    public void mb1(){
        System.out.println("Método MB1, classe B");
    }
    public void mb2(){
        System.out.println("Método MB2, classe A");
    }
    public void mb3(){
        System.out.println("MB3");
    }
}