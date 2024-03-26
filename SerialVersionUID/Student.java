package SerialVersionUID;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int i = 10;
    int j = 20;
}
// in the above program after serialization even though if we perform any change tto
// Student.class file we can deserialize object
// we can configure our own serialversionUID both sender and receiver not required
// to maintain the same JVM  versions
//Note-: Some IDE's generate explicit serialversionUID