class Encapsulation{
    private int id;
    private String  name;
    public  void  setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args){
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setId(1);
        encapsulation.setName("Deepak");
        System.out.println(encapsulation.getId());
        System.out.println(encapsulation.getName());
    }
}