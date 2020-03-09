package edu.campus02;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(lights(1));
        double distance;
        distance = 20;
        System.out.println(race(distance));
        int gang = 2;
        int windspeed = 15;
        String direction = "against";
        int speed = modelcar(gang, windspeed, direction);
        System.out.println("The speed is :" +speed);
    }

    public static String lights (int schalter){
        String light;
        if (schalter == 1)
            light = "Lights on";
        else
            light = "Lights off";
        return light;
    }
    public static String race (double flugweite){
        String place = "Invalid Distance!";
        if (flugweite>193.67)
            place = "First Place!";
        else if (flugweite<=198.7 && flugweite>197.1)
            place = "Second Place!";
        else if (flugweite<=197.1 && flugweite>195)
            place = "Third Place!";
        else if (flugweite <=195 && flugweite > 193.67)
            place = "Fourth Place!";
        else if (flugweite <150 && flugweite>100)
            place ="Runner Eliminated";
        else if (flugweite <50 && flugweite>20)
            place = "Player Injured!";
        return place;
    }
    public static int modelcar (int gang, int windspeed, String direction){
        int speed = 0;
        switch (gang){
            case 1:
                speed = 10;
                if (direction == "against" && windspeed ==15 )
                    speed = speed * 90 /100;
                else if (direction == "against" && windspeed ==25)
                    speed = speed * 80 / 100;
                else if (direction == "against" && windspeed == 50)
                    speed = speed *60 / 100;
                break;
            case 2:
                speed = 20;
                if (direction == "against" && windspeed ==15 )
                    speed = speed * 90 /100;
                else if (direction == "against" && windspeed ==25)
                    speed = speed * 80 / 100;
                else if (direction == "against" && windspeed == 50)
                    speed = speed *60 / 100;
                break;
            case 3:
                speed = 30;
                if (direction == "against" && windspeed ==15 )
                    speed = speed * 90 /100;
                else if (direction == "against" && windspeed ==25)
                    speed = speed * 80 / 100;
                else if (direction == "against" && windspeed == 50)
                    speed = speed *60 / 100;
                break;
            case 4:
                speed = 40;
                if (direction == "against" && windspeed ==15 )
                    speed = speed * 90 /100;
                else if (direction == "against" && windspeed ==25)
                    speed = speed * 80 / 100;
                else if (direction == "against" && windspeed == 50)
                    speed = speed *60 / 100;
                break;
        }
        return speed;
    }
}
