package Jan24;

public class Age {

    int age;

    Age(int age)
    {
        this.age=age;
    }

    public void drivingEligibility()
    {
        if(this.age<16)
        {
            throw new UnderEligible("Not eligible for driving");
        }
        System.out.println("The person is eligible for driving");
    }
}
