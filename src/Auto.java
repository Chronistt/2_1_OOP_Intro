public class Auto {
         String brand;
        String model;
        String color;
        String country;
        int year;
        double engineVolume;

        public Auto(String brand, String model, String color, String country, int year, double engineVolume) {
            if (this.brand != null) {
                this.brand = brand;
            } else this.brand = "default";
            if (this.model != null) {
                this.model = model;
            } else this.model = "default";
            this.color = color;
            if (this.country != null) {
                this.country = brand;
            } else this.country = "default";
            if (this.year<=0) {
                this.year = 2020;
            } else this.year = year;
            if (this.engineVolume <= 0) {
                this.engineVolume = 1.5;
            } else this.engineVolume = engineVolume;
        }




        @Override
        public String toString() {
            return "\n Car brand " + brand + "\n model " + model + "\n country " + country + "\n color " + color + "\n production year "+ year + "\n Enginge Volume " + engineVolume;
        }
    }

