// a class where the object will be an expense
// each expense will have 3 attributes
// amt = how much spent on it (amount)
// spent_on = the thing on which each thing has been spent
// group = The general category it should be in
class expense {
    double amt; 
    String spent_on; 
    String group; 

    expense(double amt,String spent_on,String group) {
        this.amt = amt;
        this.spent_on = spent_on;
        this.group = group;
    }
}