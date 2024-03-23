package Serialization_Deserialization;

import java.io.Serializable;

public class Account implements Serializable {
    String name= "Sachin";
    transient String password = "tendulkar";
}
class Example4{}
