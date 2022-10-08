package by.org.jdbc_demo01.main;

public class Subscriber{
    private int id;
    private String name;
    private int number;

    public Subscriber(int id, String name, int number){
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Subscriber{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
