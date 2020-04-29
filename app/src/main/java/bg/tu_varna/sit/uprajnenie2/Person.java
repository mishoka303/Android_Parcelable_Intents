package bg.tu_varna.sit.uprajnenie2;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {

    private String name;
    private Integer age;
    private String address;
    private String city;
    private String dobirth;

    protected Person(Parcel in) {
        name = in.readString();
        age = in.readInt();
        address = in.readString();
        city = in.readString();
        dobirth = in.readString();
    }
    //Constructor
    public Person(){
        this.name = "";
        this.age = 0;
        this.address = "";
        this.city = "";
        this.dobirth = "";
    }

    public Person(String name, Integer age, String address, String city, String dobirth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.dobirth = dobirth;
    }

    //Get/Set name
    public void set_name(String name) {
        this.name = name;
    }
    public String get_name() {
        return this.name;
    }

    //Get/Set age
    public void set_age(Integer age) {
        this.age = age;
    }
    public Integer get_age() {
        return this.age;
    }

    //Get/Set address
    public void set_address(String address) {
        this.address = address;
    }
    public String get_address() {
        return this.address;
    }

    //Get/Set city
    public void set_city(String city) {
        this.city = city;
    }
    public String get_city() {
        return this.city;
    }

    //Get/Set dobirth
    public void set_dobirth(String dobirth) {
        this.dobirth = dobirth;
    }
    public String get_dobirth() {
        return this.dobirth;
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(address);
        dest.writeString(city);
        dest.writeString(dobirth);
    }
}
