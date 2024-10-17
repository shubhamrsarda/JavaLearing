package code;

import java.util.Objects;

public class Employee implements MyInterface{

    private int id;
    private String name;
    private String country;
    private int salary;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employee(int id, String name, String country, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(country, employee.country);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country, salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
