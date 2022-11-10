// Create a class Medicine to represent a drug manufactured by a pharmaceutical company. 
// Provide a function displayLabel() in this class to print the Name and address of the company. 
// Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the 
// displayLabel() function in each of these classes to print additional information suitable to the 
// type of medicine. For example, in the case of tablets, it could be “store in a cool dry place”, in 
// the case of ointments it could be “for external use only” etc.
// Create a class TestMedicine and include the main function to do the following:
// Create three Medicine objects of the type as decided by a randomly generated integer in the 
// range 1 to 3. 
// Refer to Java API Documentation to find out the random generation feature. 
// Check the polymorphic behavior of the displayLabel() method
class TestMedicine{
    public static void main(String[] args) {
        double r = Math.random() * 4;
        int a = (int) r;
        switch (a) {
            case 1:
                Medicine m = new Medicine();
                Tablet t = new Tablet();
                m.displayLabel();
                t.displayLabel();
                break;
            case 2:
                Syrup s = new Syrup();
                s.displayLabel();
                break;
            case 3:
                Ointment o = new Ointment();
                o.displayLabel();
                break;
        }

    }
}