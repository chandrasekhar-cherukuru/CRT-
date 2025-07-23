

// instance refers to an object created from a class

public class Instance {

    double temp; //instance variable

    public void todayForecast(double temp){ //instance method

        this.temp = temp;
        System.out.println("Todays temparature is: " +this.temp);

    }

    public void nextDayTemp(double temp){ //instance method
        this.temp = temp - this.temp;
        System.out.println((this.temp > 0) ? "NextDay temp is greater by: " +this.temp : "NextDay temp is less by: " +this.temp);
    }
    public static void main(String[] args) {
        
        Instance weather = new Instance(); //object creation

        //weather is the instance (object) of the Instance class.

        weather.todayForecast(37.2); //method calling

        weather.nextDayTemp(35.2);  //method calling
    }
}
