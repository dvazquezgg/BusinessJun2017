class SalesPerson // each object contains details of one salesperson
{
    private String id;
    private Sales[] salesHistory; // details of the different sales
    private int count = 0; // number of sales made

    //constructor for a new salesperson
    public SalesPerson(String id)
    {
        // code missing
    }

    // constructor for a salesperson transferred (together with
    // their sales details) from another branch
    public SalesPerson(String id, Sales[] s, int c)
    {
        // code missing
    }
    public int getCount(){return count;}
    public String getId() {return id;}

    // returns the sale at position i in the sales history
    public Sales getSalesHistory(int i)
    {
        return salesHistory[i];
    }

    // adds a new sale to the salesperson's sales history
    public void setSalesHistory(Sales s)
    {
        salesHistory[count] = s;
        count = count + 1;
    }
    // calculates total sales for the salesperson
    public double calcTotalSales()
    {
        // TODO: implement this method
        return 0.0;
    }
    // calculates the sale with the largest value
    public Sales largestSale()
    {
        // TODO: implement this method
        return null;
    }
}