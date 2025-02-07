class Laptop
{
    String model;
    int price;
//	String serial;

    public String toString()
    {
//		return "Hey";
        return model+ " : "+price;
    }
    public boolean equals(Laptop that)
    {
//		if(this.model.equals(that.model) && this.price==that.price) 
//			return true;
//		else
//			return false;

        return this.model.equals(that.model) && this.price==that.price ;
    }
}