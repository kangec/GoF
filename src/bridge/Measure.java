package bridge;

/*================================================*/
/* This interface is the interface of the abstract class hierarchy
/* in the bridge design pattern
/*================================================*/

public interface Measure {
    double findVolume();

    String convert();
}