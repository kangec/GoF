package Visitor;

/*===================================*/
/* This is the interface of a class  */
/* hierarchy that is to be visited   */
/* by some visitors                  */
/*===================================*/

public interface ComputerParts {

    void accept(Visitor vis);

    String getName();

    double getPrice();

    String getDescription();
}
