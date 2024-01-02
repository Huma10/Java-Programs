package org.example.streamconcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {
    int id;
    String mobileNo;

    public Customer(int id, String mobileNo) {
        this.id = id;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Customer> list = new ArrayList();
        list.add(new Customer(1,"+8888888888"));
        list.add(new Customer(2,"+9199999999"));
        list.add(new Customer(3,"+7777777777"));

        list.stream().filter((cust)->cust.mobileNo.startsWith("+91")).forEach(System.out::println);
        List<Customer> collect = list.stream().filter((customer -> customer.mobileNo.startsWith("+91"))).collect(Collectors.toList());
        System.out.println(collect);
    }
}
