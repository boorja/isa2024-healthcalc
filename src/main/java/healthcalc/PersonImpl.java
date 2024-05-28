package healthcalc;

public class PersonImpl implements Person{
    public float weight;
    public float height;
    public Gender gender;
    public int age;
    
    public PersonImpl(float weight, float height,Gender gender, int age){
        this.weight=weight;
        this.height=height;
        this.gender=gender;
        this.age=age;
    }

    public PersonImpl(float height,Gender gender){
        this.height=height;
        this.gender=gender;
    }
    
    @Override
    public float weight() {
        return weight;
    }

    @Override
    public float height() {
        return height;
    }

    @Override
    public Gender gender() {
        return gender;
    }

    @Override
    public int age() {
        return age;
    }

}
